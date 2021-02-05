<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<style>
img {
padding: 50px;
margin-left: 30px;
}
</style>
</head>
<body>
	<div>
		<form role="form" action="register" method="post">
			<div>
				<label>name</label>&nbsp;&nbsp;  <input placeholder="이름" type="text" name='name' autofocus>
			</div><br>
			<div>
				<label>id</label>&nbsp;&nbsp;&nbsp;&nbsp; <input placeholder="아이디" type="text" name='id'>
			</div><br>
			<div>
				<label>pw</label>&nbsp;&nbsp;&nbsp;&nbsp;  <input placeholder="비밀번호" type="text" name='pw'>			
			</div><br>
			<div>
				<label>email</label>&nbsp;&nbsp;  <input placeholder="이메일" type="text" name='email'>			
			</div><br>

			<button type="submit" class="btn btn-default">Submit</button>
			<button type="reset" class="btn btn-default">Reset</button>
		</form>
	</div>
	 <img src="/resources/img/welcome.gif" alt="welcome" width="200">
	
	</body>
</html>