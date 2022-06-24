<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/notice/detail.jsp</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
	<form action="${pageContext.request.contextPath }/notice/updateform.do">
		<label for="title"></label>
		<input type="text" id="title" name="title" value="${dto.title }"/>
		<label for="cotent"></label>
		<textarea name="content" id="content" cols="30" rows="10">${dto.content }
		</textarea>
		<button type="submit" class="hidden">수정</button>
	</form>
	<button onclick="location.href='${pageContext.request.contextPath }/notice/list.do'">확인</button>
</body>
</html>