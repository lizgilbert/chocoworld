<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
* {
	margin: 0px auto;
	padding: 0px;
	vertical-align: middle;
}

body, h1, h2, h3, h4 {
	font-family: NanumGothicWeb, verdana, dotum, sans-serif;
	font-size: 15px;
	color: #383d41;
background-image:
	url("/resources/img/back.png" );}

header {
	padding: 5px
}

header h1 {
	font-size: 40px;
	color: #383d41;
}

li {
	list-style: none
}

nav {
	text-align: center;
	vertical-align: middle;
	margin: auto;
	line-height: 50px;
	clear: both;
	overflow: hidden;
	margin-top: 40px;
	margin-bottom: 40px;
}

nav li {
	display: inline-block;
	padding-right: 5px;
	font-family: verdana;
}

nav li a {
	text-decoration: none;
}

nav li span {
	display: inline-block;
	padding: 10px 10px;
	border-radius: 5px;
}

footer {
	clear: both;
	padding: 10px;
	font-size: 0.8em;
	text-align: center
}

input {
	width: 300px;
	padding: 12px 20px;
	margin: 8px 0;
	box-sizing: border-box;
	background-color: white;
}
input , textarea {
  background-color: white;
}

#sform {
	display: inline-block;
	text-align: left;
	margin-left: 600px;
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
	<nav>
		<ul>
			<li><span><a href="/main">Main</a></span></li>
			<li><span><a href="/metoon">Webtoon</a></span></li>
			<li><span><a href="/meill">Illustration</a></span></li>
			<li><span><a href="/diarylist">Diary</a></span></li>
			<li><span><a href="/register">Sign up</a></span></li>
			<li><span><a href="/login">Login</a></span></li>
		</ul>
	</nav>
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
				<textarea rows="10" cols="70" name="content"></textarea>
			</div>
			<br>
			<div>
				<label>Writer</label>&nbsp;&nbsp; <input name="writer">
			</div>
			<br>
			<div class="button">
				<button type="submit">Submit Button</button>
				<button type="reset">Reset Button</button>
				</div>
		</form>
	</div>
</body>
</html>