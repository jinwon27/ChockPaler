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
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css" />
<body>
	<div class="container">
		<c:choose>
			<c:when test="${empty dto }">
				<p>주문 내역이 없습니다.</p>
			</c:when>
			<c:otherwise>
				<p>주문번호 : ${dto.num}</p>
				<p>주문자 : ${dto.id}</p>
				<p>주소 : ${dto.addr}</p>
				<p>상품명 : ${dto.item_name}</p>
				<a href="${pageContext.request.contextPath }/home.do">HOME</a>
			</c:otherwise>
		</c:choose>
	</div>
	<!-- 웹 하단부 info -->
	<%@include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>