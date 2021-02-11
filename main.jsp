<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main</title>
<link rel="shortcut icon" type="image/x-icon"
	href="/resources/img/web.ico" />
<style>
@import url('https://fonts.googleapis.com/css2?family=Yusei+Magic&display=swap');
@import url('https://fonts.googleapis.com/css2?family=Dosis&family=Raleway:wght@100&display=swap');
* {
font-family: 'Yusei Magic', sans-serif;
	margin: 0px auto; padding: 0px; vertical-align: middle; text-align:center; 
	letter-spacing: 0.08em;
}
li{list-style:none}
nav {
	text-align: center;
	vertical-align: middle;
	margin: 13px 0 10px 0;
}
nav li{display:inline-block;padding-right:5px;font-family:verdana;}
nav li a{ text-decoration: none;}
nav li span{display:inline-block;padding:10px 10px;border-radius:5px;}


header {
	font-family: NanumGothicWeb, verdana, dotum, sans-serif;
	font-size: 20px;
	color: #383d41;
	margin-top: 20px;
}
body{
background-image:
	url("/resources/img/back.png" );}


nav ul li a:hover{
	font-weight:bold;
	font-size: 20px;
	
}
h1 {
color:yellow;
text-shadow: 3px 2px 5px #000;}
header a{
text-decoration:none;
color:yellow;}
header a:hover{
	font-weight:bold;
	font-size: 50px;
	
}

div a {
text-decoration:none;
}


div#wrapper {
	position: relative;
}
.box {
	position: absolute;
}
#b1 { 
	z-index:1;
	left:470px;
	top:200px;
	width:580px;
	border-radius: 40px;
	}
#b2 { 
	z-index: 3;
	width: 150px;
	padding: 5px 0 0 0;
	border-radius: 50%;
	left:400px;
	}
#b3 { 
	z-index: 3;
	left: 1000px;
	top:450px;
	}
#b4 {
	left:680px;
	top:720px;
	z-index: 4;
	font-size:15px;
	}

#b5 {
	top: 40px;
	left:630px;
	z-index: 4;
	
}
#b6 {
	top:120px;
	left:500px;
	z-index: 4;
	
}
footer {
	padding: 5px 0 0 0;!important;
	font-size: 0.8em;
}
.imgs{
	left:400px;
	top:200px;
	height:500px;
	width:700px;
	overflow:hidden;
	position:absolute;
	border-radius:47px;
}
.imgs>img{
	width:100%;
	height:100%;
	transition:all 1s
	position:relative;
}

</style>
<script src="/resources/js/jquery-1.12.3.js"></script>
<script>
var imgs = 2;
var now = 0;

start(); 

function start(){
   $(".imgs>img").eq(0).siblings().fadeOut(1000);
   setInterval(function(){slide();},3000);
}
function slide(){
   now = now==imgs?0:now+=1;
   $(".imgs>img").eq(now-1).fadeOut(1000);   
   $(".imgs>img").eq(now).fadeIn(1000);
}
	

</script>
</head>
	<div id="wrapper">
<header  id= "b5" class="box">
	<h1><a href="/main">choco World</a></h1>

</header>
<body>
   <nav id= "b6" class="box">
      <ul>
         <li><span><a href="/metoon">Webtoon</a></span></li>
         <li><span><a href="/meill">Illustration</a></span></li>
         <li><span><a href="/diarylist">Diary</a></span></li>
         <li><span><a href="/register">Sign up</a></span></li>
         <li><span><a href="/login" >Login</a></span></li>
      </ul>
   </nav>
	<div class="imgs">
        <img src="/resources/img/1.jpeg"> <!-- random image -->
        <img src="/resources/img/2.jpeg"> <!-- random image -->
        <img src="/resources/img/3.jpeg"> <!-- random image -->
	</div>
	<img id= "b2" class="box" src="/resources/img/girl.GIF" alt="girl">
	<img id= "b3" class="box" src="/resources/img/39873.gif" alt="drop">
	<footer id= "b4" class="box" > ⓒ2020 chocoWorld,Inc </footer>
	</div>

</body>
</html>