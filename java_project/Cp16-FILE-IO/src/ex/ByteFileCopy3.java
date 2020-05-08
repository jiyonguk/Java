package ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteFileCopy3 {
	public static void main(String[] args) throws IOException {
		// 원본 파일의 데이터를 프로그램안으로 가져와야한다.
		// => InPutStream 인스턴스 생성
		InputStream in = null;
		// 새로운 파일을 생성
		// => OutputStream 인스턴스 생성
		OutputStream out = null;
		int copyByte = 0;
		int readLen;
		byte[] buf = new byte[1024];
		try {
			in = new FileInputStream("kk.pdf");
			out = new FileOutputStream("Copy2.pdf");

			while (true) {

				readLen = in.read(buf);
				if (readLen == -1) {
					break;
				}
				out.write(buf, 0, readLen);
				copyByte += readLen;
			}

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
				System.out.println("복사된 크기" + copyByte);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
