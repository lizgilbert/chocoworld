<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main</title>
<style>
* {
	margin: 0px auto; padding: 0px; vertical-align: middle; text-align:center
}
body,h1,h2,h3,h4,input,button{font-family:NanumGothicWeb,verdana,dotum,sans-serif;font-size:15px;color:#383d41}
header{padding:5px}
header h1{font-size:40px;color:#383d41; }
li{list-style:none}
nav{text-align:center; vertical-align: middle; margin:auto; line-height:50px;clear:both;overflow:hidden;}
nav li{display:inline-block;padding-right:5px;font-family:verdana;}
nav li a{ text-decoration: none;}
nav li span{display:inline-block;padding:10px 10px;border-radius:5px;background-color:#fff}
footer{clear:both;padding:10px;font-size:0.8em;text-align:center }
      .box {
      		animation-name:moving;
      		animation-duration:3s;
      		animation-iteration-count:infinite;
      		margin: 0px auto; padding: 0px; vertical-align: middle; text-align:center
      }
      @keyframes moving {
      	from{
      		width:400px;
      		background: white;
      		opacity:0.5;
      		transform:scale(0.5) rotate(10deg);
   	  }
   	  25%{
   	 	 	width:400px;
      		background: white;
      		opacity:0.7;
      		transform:scale(0.5) rotate(-30deg);
   	  }
   	  50%{
   	 	 	width:400px;
      		background: white;
      		opacity:0.7;
      		transform:scale(0.5) rotate(30deg);
   	  }
   	  75%{
   			width:400px;
   			background:white;
   			opacity:1;
   			transform:scale(1) rotate(0deg);
   		}
   	  to{
   			width:400px;
   			background:white;
   			opacity:1;
   			transform:scale(0.8) rotate(0deg);
   		}
		}
		img {
		width: 400px;
		margin: 20px 0px 15px 0px;
		animation: rotate 3s , background 1.5s infinite alternate;
		border-top-left-radius: 30px; 
		border-top-right-radius: 30px; 
		border-bottom-left-radius: 30px; 
		border-bottom-right-radius: 30px; 
		
	}
	
	@keyframes rotate {
		from {
			transform: rotateX(-30deg) rotateY(0deg);
		}
		50% {
			transform: rotateX(180deg) rotateY(0deg);
		}
		to {
			transform: rotateX(360deg) rotateY(0deg);
		}
	}
	
	@import url('https://fonts.googleapis.com/css2?family=Grandstander:ital,wght@1,200&display=swap'
	);
	.gs-font{
		font-family: 'Grandstander', cursive;
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
         <li><span><a href="/login" >Login</a></span></li>
      </ul>
   </nav>
   <section> 
	<img src="/resources/img/main.jpg" alt="숑숑퐁퐁"/> 
   </section>

   <footer>
     ⓒ2020 chocoWorld,Inc
   </footer>

</body>
</html>