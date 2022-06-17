<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/userorder/userorder.jsp</title>
</head>
<body>

	<h1>장바구니</h1>
	
	<div class="container">
	<div class="row">
	<c:forEach var="tmp" items="${list }"></c:forEach>
	</div>
	
		<form action="<!-- 컨트롤러 안에 들어갈 order.do-->">
			<!-- 장바구니에 담긴 item.dto -->
			<!-- 이름 -->
			<!-- 가격 -->
			
			<button type="submit">주문하기</button>
			<button type="reset">취소</button>
		</form>
	</div>
</body>
</html>