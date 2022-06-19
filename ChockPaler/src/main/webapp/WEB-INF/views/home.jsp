<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<html>
<head>
	<title>/home.jsp</title>
</head>
<body>
	<h1> 프로젝트 페이지 </h1>
	<!-- Navbar -->
	<!-- <br /> -->
	<!-- ${usersDto.name } 님 환영합니다 if(session.id == usersDto.id) -->
	<c:choose>
		<c:when test="${ empty sessionScope.id}">
			<a href="${pageContext.request.contextPath}/users/loginform.do">로그인</a>
			<a href="${pageContext.request.contextPath}/users/signupform.do">회원가입</a>
		</c:when>
		<c:otherwise>
			<p>
				${sessionScope.id }님 로그인중... 
				<a href="${pageContext.request.contextPath}/users/logout.do">로그아웃</a>
			</p>
		</c:otherwise>
	</c:choose>

	<a href="${pageContext.request.contextPath }/users/info.do">마이페이지</a>
	<a href="${pageContext.request.contextPath }/users/userorder.do">장바구니</a>
	<a href="${pageContext.request.contextPath }/shop/orderinquiry.do">주문배송조회</a>
	<a href="${pageContext.request.contextPath }/items/uploadform.do">자, 신상 팔아볼까?</a>

	<br />
	<div class="container">
		<form action="${pageContext.request.contextPath }/views/items/searchItems.do">
			<input type="text" placeholder="검색어 입력..."/>
			<button type="submit">검색</button>
		</form>
	</div>
	<br />  <!-- div는 block 요소라 <br /> 이 필요없던가 ? -->
	
	<h2>
		<span> ITEMS </span>
	</h2>
	<div id="underline"></div>
	<ul class="itemList">
		<!-- 반복문 -->
		<c:forEach items="${itemList }" step=1 varStatus="status">
			<li>
				<div>
					<div>
						<a href="상품 이미지경로"></a>
					</div>
					<a href="상품 간단설명된 이미지 경로"></a>
				</div>
			</li>
		</c:forEach>
	</ul>
	
	<!-- 웹 하단부 info -->
</body>
</html>
