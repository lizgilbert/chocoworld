<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>chocoWorld</title>
 <link rel="shortcut icon" type="image/x-icon" href="/resources/img/web.ico"/>

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
footer{clear:both;padding:10px;font-size:0.8em;text-align:center }
input{
    width:300px;
    padding: 12px 20px;
    margin: 8px 0;
    box-sizing: border-box;
    background-color: white;
}
input , textarea {
  background-color: white;
}
#get_diary input , #get_diary textarea {
border: none; background: transparent;width:190px;font-size:1.0em; padding: 5px;
margin: 5px; font-family: 'Dosis', sans-serif;
word-break: keep-all;
border-radius: 20px;}
#get_diary textarea {
	margin-left:13px;
	padding: 20px;
	text-indent:25%;
	 width: 450px;
  height: 500px;
  line-height: 1.7;
  letter-spacing: 0.1em;
  text-align:justify;
  font-size: 20px;
}
textarea {
  width: 450px;
  height: 300px;
  line-height: 1.7;
  letter-spacing: 0.1em;
  text-align:justify;
  font-size: 20px;
  padding: 20px;
  
}
#get_diary label {
	color: #c5a208;
}
header {
	font-family: NanumGothicWeb, verdana, dotum, sans-serif;
	font-size: 20px;
	color: #383d41;
	margin-top: 20px;
}
body{
background-image:
	url("/resources/img/back.png" );}

body,h2,h3,h4{font-family:NanumGothicWeb,verdana,dotum,sans-serif;	font-size: 17px;
color:#383d41;
}

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
button {
line-height:20px;
padding: 5px 10px;
margin: 5px 0px 5px 10px;
background-color: rgba(253, 251, 98, 0.712);
border-radius: 8px;
width: 110px;

img {
border-radius: 8px;

}
button .button {
line-height:20px;
padding: 5px 0 5px 15px;
background-color: rgba(253, 251, 98, 0.712);
border-radius: 8px;
width: 110px;}
button#member_btn {
width: 170px;
}

#member_btn:hover {
background-color: rgb(86, 218, 223);
}
button:hover {

	font-weight:bold;
	background-color: #aad1d1bd;

}
div a {
text-decoration:none;
}
.button_img img {
    transform:scale(1);
    transition:.3s;
    border-radius: 5px;}
.button_img:hover img {
	border: 0.5rem solid #aad1d1bd;
    transform:scale(1.2);
}


</style>
</head>
<header>
	<h1><a href="/main">choco World</a></h1>

</header>
<body>
   <nav>
      <ul>
         <li><span><a href="/metoon">Webtoon</a></span></li>
         <li><span><a href="/meill">Illustration</a></span></li>
         <li><span><a href="/diarylist">Diary</a></span></li>
         <li><span><a href="/register">Sign up</a></span></li>
         <li><span><a href="/login" >Login</a></span></li>
      </ul>
   </nav>



</body>
</html>