<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/orderinquiry/list.jsp</title>
</head>
<style>
	.isDel{
		visibility: hidden;
	}
</style>
<body>
	<div class="container">
		<p>주문번호 : ${dto.num}</p>
		<p>주문자 : ${dto.id}</p>
		<p>주소 : ${dto.addr}</p>
		<p>상품명 : ${dto.item_name}</p>
		<a href="${pageContext.request.contextPath }/home.do">HOME</a>
	</div>
</body>
</html>