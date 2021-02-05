<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인창</title>
<style>
img {
padding: 50px;
}
</style>
</head>
<body>
<div>
  <form role="form" action="login"  method="post" >
  			<div>
  				<label>id</label>&nbsp;&nbsp;  <input placeholder="아이디" type="text" name="id" autofocus>
			</div>
			<br>
    		<div>
				<label>pw</label>&nbsp;&nbsp;    <input placeholder="비밀번호" type="password" name='pw'>	
			</div>
			<br>
			
			<button type="submit" class="btn btn-default">Submit</button>
			<button type="reset" class="btn btn-default">Reset</button>
		</form>
  <br>
 </div>  
 <div>
  <button id="member_btn" type="button"><a href="/register">새 회원 등록하기</a></button>
 </div>
 <img src="/resources/img/choco.gif" alt="choco" width="200">
 </body>
</html>