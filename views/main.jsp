<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main</title>
<link rel="shortcut icon" type="image/x-icon"
	href="/resources/img/web.ico" />
<link rel="stylesheet" href="/resources/css/main.css" />
<style>
* {
	
	margin: 0px auto;
	padding: 0px;
	vertical-align: middle;
	text-align: center;
	
}


body, h1, h2, h3, h4, input, button {
	font-family: NanumGothicWeb, verdana, dotum, sans-serif;
	font-size: 15px;
	color: #383d41;
	background-image:
	url("/resources/img/back.png" )
}

header {
	margin-top: 50px;
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
	margin-top: 20px;
	margin-bottom: 20px;
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
img {
	border-top-left-radius: 30px; 
	border-top-right-radius: 30px; 
	border-bottom-left-radius: 30px; 
	border-bottom-right-radius: 30px; 
}


		}
</style>
</head>
<body>

	<header>
		<h1>Choco World</h1>
	</header>
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
	<section>

		<div class="slider">
			<input type="radio" name="slide" id="slide1" checked> <input
				type="radio" name="slide" id="slide2"> <input type="radio"
				name="slide" id="slide3">
			<ul id="imgholder" class="imgs">
				<li><img src="/resources/img/1.jpeg"></li>
				<li><img src="/resources/img/2.jpeg"></li>
				<li><img src="/resources/img/3.jpeg"></li>
			</ul>
			<div class="bullets">
				<label for="slide1">&nbsp;</label> 
				<label for="slide2">&nbsp;</label>
				<label for="slide3">&nbsp;</label>
			</div>
		</div>
	</section>

	<footer> ⓒ2020 chocoWorld,Inc </footer>

</body>
</html>