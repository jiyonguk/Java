package service;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import dao.ReportDao;
import jdbc.ConnectionProvider;
import model.Report;

public class ReportRegService {

	private ReportRegService() {
	}

	private static ReportRegService service = new ReportRegService();

	public static ReportRegService getInstance() {
		return service;
	}

	ReportDao dao;

	public int regReport(HttpServletRequest request) {

		int resultCnt = 0;
		
		String sname = "";
		String sno = "";
		String filePath = "";
		
		Connection conn = null;
		
		try {
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);

			if (isMultipart) {
				DiskFileItemFactory factory = new DiskFileItemFactory();
				ServletFileUpload upload = new ServletFileUpload(factory);

				List<FileItem> items = upload.parseRequest(request);

				Iterator<FileItem> ite = items.iterator();

				while (ite.hasNext()) {

					FileItem item = ite.next();

					// isFormField() : text value를 가지는 input 확인
					if (item.isFormField()) { // type=file 이외의 input
						// 파라미터 이름
						String paramName = item.getFieldName();
						// 파라미터의 값
						String paramValue = item.getString("utf-8");
						System.out.println(paramName + "=" + paramValue);
						
						if(paramName.equals("sname")) {
							sname = paramValue;
						}else if(paramName.equals("sno")) {
							sno = paramValue;
						}
					} else { // type=file
						// 파라미터 이름
						String paramName = item.getFieldName();
						// 파일 이름
						String fileName = item.getName();
						// 파일의 사이즈
						long file_size = item.getSize();
						// 파일의 타입
						String contentType = item.getContentType();
						// 임시메모리에 저장 여부
						boolean isInMemory = item.isInMemory();
						System.out.println("필드이름 : " + paramName);
						System.out.println("파일이름 : " + fileName);
						System.out.println("파일사이즈  : " + file_size);
						System.out.println("파일타입 : " + contentType);

						// 서버 내부의 경로
						// String uri = "/file";

						String uri = request.getSession().getServletContext().getInitParameter("uploadPath");
						// 시스템의 실제 경로
						String realPath = request.getSession().getServletContext().getRealPath(uri);
						System.out.println(realPath);
						String newFileName = System.nanoTime() + "_" + fileName;
						System.out.println("newFileName : "+newFileName);
						// 서버의 저장소에 실제 저장
						File saveFile = new File(realPath, newFileName);
						System.out.println("saveFile : "+saveFile);
						item.write(saveFile);
						System.out.println("저장완료!!!!!!!!!!!!!!!!!");
												
						filePath = uri+"/"+newFileName;
						System.out.println("filePath"+filePath);
					}
				}
				
				
				//데이터베이스 저장
				Report report = new Report();
				report.setSname(sname);
				report.setSno(sno);
				report.setReport(filePath);
				
				conn = ConnectionProvider.getConnection();
				
				dao = ReportDao.getInstance();
				
				resultCnt = dao.insertReport(conn, report);
				System.out.println(resultCnt);
				System.out.println(report);
				
				request.setAttribute("report", report);
				
				
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return resultCnt;
	}

}
