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
	<a href="${pageContext.request.contextPath }/views/users/loginform.do">로그인</a>
	<a href="${pageContext.request.contextPath }/views/users/mypage.do">마이페이지</a>
	<a href="${pageContext.request.contextPath }/views/users/shoppingbasket.do">장바구니</a>
	<a href="${pageContext.request.contextPath }/views/shop/orderinquiry.do">주문배송조회</a>
	<br />
	<div class="container">
		<form action="/searchItems.do">
			<input type="text" placeholder="검색어 입력..."/>
			<button type="submit">검색</button>
		</form>
	</div>
	<br />  <!-- div는 block 요소라 <br /> 이 필요없던가 ? -->
	
	<!-- 상품 리스트 출력 -->
	<div class="container">
		<table>
			<thead>
				<tr>
					<th>제목</th>
					<th>내용</th>
				</tr>
			</thead>
			<tbody>
			<!-- 반복문 돌릴 구간 -->
				<tr>
					<td>${requestScope.itemDto.name }</td>
					<td>${requestScope.itemDto.content }</td>
				</tr>
			<!-- 반복문 끝나는 구간 -->
			</tbody>
		</table>
	</div>
	
	<!-- 웹 하단부 info -->
</body>
</html>
