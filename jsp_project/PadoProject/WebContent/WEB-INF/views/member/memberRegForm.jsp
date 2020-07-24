
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입폼</title>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>

<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/default.css">

<style>
.check_ok {
	color: blue;
}

.check_not {
	color: red;
}

#idchk {
	display: none;
}
</style>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/header.jsp"%>
      <div id="box" class="white">
         <div id="white">
         <h3 class="white">회원가입</h3>
         </div>
		<hr>
		<form id="regForm" action="memberReg.do" method="post"
			enctype="multipart/form-data">
			<table>
				<tr>
                  <td id="tdwhite">
                  <label for="memail" class="white">아이디/e-mail</label><br>
                  <input type="email" name="mid" id="mid" class="inputSize" >
                     <span  id="checkmsg"></span>
                     <input type="checkbox" name="idchk" id="idchk" style="display: none;"  >
                  </td>
				</tr>
				<tr>
					<td id="tdwhite"><label for="mpw" class="white">비밀번호</label> <br>
						<input type="password" name="mpw" id="mpw" class="inputSize"
						required></td>
				</tr>
				<tr>
					<td id="tdwhite"><label for="mname" class="white">이름</label><br>
						<input type="text" name="mname" id="mname" class="inputSize"
						required></td>
				</tr>
				<tr>
					<td id="tdwhite"><label for="mname" class="white">연락처</label><br>
						<input type="text" name="mphonenumber" id="mphonenum"
						class="inputSize"></td>
				</tr>
				<tr>
					<td id="tdwhite"><label for="mphoto" class="white">사진</label><br>
						<input type="file" name="mphoto" id="mphoto"></td>
				</tr>
				<tr>
					<td class="joinButton"><input type="reset" value="close"
						class="closeButton"> <input type="submit" name="회원가입"
						value="ok" class="okButton"></td>
				</tr>
			</table>
		</form>
	</div>

	<%@ include file="/WEB-INF/views/include/footer.jsp"%>
</body>
</html>
<script>
	$(document).ready(function() {

		$('#regForm').submit(function() {

			if (!$('#idchk').prop('checked')) {
				alert('아이디 중복 체크는 필수 항목 입니다');
				$('#mid').focus();
				return false;
			}

		});

		$('#mid').focusin(function() {

			$(this).val('');
			$('#idchk').prop('checked', false);

			$('#checkmsg').text('');

			$('#checkmsg').removeClass('check_not');
			$('#checkmsg').removeClass('check_ok');
		});

		$('#mid').focusout(function() {

			if ($(this).val().length < 1) {
				$('#checkmsg').text("아이디 항목은 필수 항목입니다.");
				$('#checkmsg').addClass('check_not');
				return false;
			}

			// 비동기 통신
			$.ajax({
				url : 'idCheck.do',
				data : {
					mid : $(this).val()
				},
				success : function(data) {
					if (data == 'Y') {
						$('#checkmsg').text("사용가능한 아이디 입니다.");
						$('#checkmsg').addClass('check_ok');
						$('#idchk').prop('checked', true);
					} else {
						$('#checkmsg').text("사용이 불가능한 아이디 입니다.");
						$('#checkmsg').addClass('check_not');
						$('#idchk').prop('checked', false);
					}
				}
			});

		});

	});
</script>


