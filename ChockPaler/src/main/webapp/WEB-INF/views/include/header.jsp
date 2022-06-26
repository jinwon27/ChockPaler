
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<div class="header">
	<div class="pagetop">

		<div align="right" style="margin-right: 100px">
			<form name="">
				<tr id="head">
					<c:choose>
						<c:when test="${ empty sessionScope.id}">
							<td><a
								href="${pageContext.request.contextPath}/users/loginform.do">로그인
							</a></td>
							<td>|</td>
							<td><a
								href="${pageContext.request.contextPath}/users/signupform.do">회원가입</a></td>
							<td>|</td>
						</c:when>
						<c:otherwise>
							<td><a href="#">로그아웃</a></td>
							<td>|</td>
							<td><a href="#">마이페이지</a></td>
							<td>|</td>
							<td><a href="#">장바구니</a></td>
							<td>|</td>
						</c:otherwise>
					</c:choose>
					<td><a href="#">고객센터</a></td>
				</tr>

			</form>
		</div>
	</div>
</div>






<!-- 쿠키 및 음료  -->
<div class="pagemid">
	<div class="wrapper2">
		<I><h1>
				<a href="${pageContext.request.contextPath}/home.do">ChockPaler</a>
			</h1></I>



		<ul class="flex-menu">
			<li>&nbsp;</li>
			<li><a
				href="${pageContext.request.contextPath}/home.do?viewcount=1">BEST</a></li>
			<li><a
				href="${pageContext.request.contextPath}/home.do?item_type='cookie'">COOKIE</a></li>
			<li><a
				href="${pageContext.request.contextPath}/home.do?item_type='beverage'">BEVERAGE</a></li>
			<li><a href="${pageContext.request.contextPath}/notice/list.do">NOTICE</a></li>
			<li><a href="${pageContext.request.contextPath}">EVENT</a></li>
			<li>
				<!-- 검색 -->
				<div style="margin-left: 10%;" align="right">
					<form method="post" action="/stu/shop/openMainSearch.do"
						id="searchbox5">
						<input id="search" name="keyword" type="text" size="40"
							placeholder="" value="" />
					</form>
				</div>
			</li>
		</ul>
	</div>
</div>






