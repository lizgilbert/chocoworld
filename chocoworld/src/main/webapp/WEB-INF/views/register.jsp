<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>

</head>
	<div>

		<form role="form" action="register" method="post">
			<div>
				<label>name</label>  <input placeholder="홍길동" type="text" name='name' autofocus>
			</div><br>
			<div>
				<label>id</label>  <input name='id'>
			</div><br>
			<div>
				<label>pw</label>  <input name='pw'>			
			</div><br>
			<div>
				<label>email</label>  <input name='email'>			
			</div><br>

			<button type="submit" class="btn btn-default">Submit Button</button>
			<button type="reset" class="btn btn-default">Reset Button</button>
		</form>

	</div>
</html>