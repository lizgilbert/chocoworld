<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main</title>
<link rel="shortcut icon" type="image/x-icon"
	href="/resources/img/web.ico" />
<style>

footer {
	padding: 5px 0 0 0;!important;
	font-size: 0.8em;
}

.slides {
	width: 550px;
	height:400px;
}

section img {
	border-radius: 40px;
	margin-left: 30px;
}

.girl {
	width: 200px;
	padding: 5px 0 0 0;
	border-radius: 40px;
}

</style>
<script src="/resources/js/jquery.js"></script>
<script>
$(function(){
	var srcVal=$(".slides").attr("src");
	console.log(srcVal);
	
	$(".slides").on({
	"mouseover":function(){
	$(".slides").attr({
		"src":srcVal.replace("1.jpeg","3.jpeg")
	});
	},
	"mouseout":function(){
	$(".slides").attr({
		"src":srcVal.replace("3.jpeg","1.jpeg")
	});
	}
});
});
</script>
</head>

	<section>
        <img class="slides" src="/resources/img/1.jpeg"> <!-- random image -->
	</section>
	<img class="girl" src="/resources/img/girl.GIF" alt="girl">

	<footer> ⓒ2020 chocoWorld,Inc </footer>

</body>
</html>