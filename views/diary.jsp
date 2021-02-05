<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%
	Date nowTime = new Date();
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Diary</title>
<link rel="shortcut icon" type="image/x-icon"
	href="/resources/img/web.ico" />
<style>

header {
	padding: 5px !important;
}

#sform {
	display: inline-block;
	
}

div.button {
	width: 50%;
}

div.button input {
	padding: 10px;
	width: 100%;
	font-size: 18px;
}

</style>
</head>
<body>

	<div id="sform">
		<form role="form" action="/diary" method="post">
			<div>
				<label>Title</label>&nbsp;&nbsp; <input placeholder="제목" type="text"
					name="title" autofocus>
			</div>
			<br>
			<div>
				<label>Date</label>&nbsp;&nbsp; <input type="date"
					value=<%=nowTime%>>
				<!-- <button type="button"><img src="/resources/img/calendar.png" width="20"></button> -->
			</div>
			<br>

			<div>
				<label>Content</label>
				<textarea rows="10" name="content"></textarea>
			</div>
			<br>
			<div>
				<label>Writer</label>&nbsp;&nbsp; <input name="writer">
			</div>
			<br>
			<div class="button">
				<button type="submit">Submit</button>
				<button type="reset">Reset</button>
				</div>
		</form>
	</div>
	<div>
	 <img src="/resources/img/planter.png" alt="planter" width="200">
	 </div>
</body>
</html>