<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/basket/insert.jsp</title>
</head>
<body>
	<!-- '장바구니 담기' 했을 때 나타나는 페이지 -->
	<div class="container">
		<h2>선택하신 상품을 장바구니에 담았습니다.</h2>
		<a href="${pageContext.request.contextPath }/home.do">쇼핑 계속하기</a>
		<a href="/basket/basketList.do">장바구니 가기</a>
	</div>
</body>
</html>