<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/notice/detail.jsp</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<style>
	button{
		float: right;
	}
</style>
</head>
<body>
	<div class="container">
		<h1 style="text-align: center;"> N O T I C E </h1>
		<form action="${pageContext.request.contextPath }/notice/updateform.do">
			<input class="form-control" type="text" name="title" value="${dto.title }"/>
			
			<!-- 여기 여백 주려면 어캐해야댐 ? -->
			<br />
			
			<textarea class="form-control" name="content" cols="30" rows="10">
				${dto.content }
			</textarea>
			<br />
			<button class="btn btn-outline-success" onclick="location.href='${pageContext.request.contextPath }/notice/list.do'">확인</button>
			<button class="btn btn-outline-primary" type="submit" disabled="disabled" class="updateBtn">수정</button>
		</form>
	</div>
</body>
</html>