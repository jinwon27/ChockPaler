<<<<<<< HEAD
<<<<<<< HEAD
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
	<a href="${pageContext.request.contextPath }/userorder/userorderform.do">장바구니</a>
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
					<td></td>
					<td>${requestScope.itemDto.content }</td>
				</tr>
			<!-- 반복문 끝나는 구간 -->
			</tbody>
		</table>
	</div>
	
	<!-- 웹 하단부 info -->
</body>
</html>
=======
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<html>
<head>
	<style>
		li{
			display: inline-block;
		}
	</style>
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
		<c:forEach var="tmp" items="${itemList }" step="1" varStatus="status" >
			<li>
				<div>
					<div>
						<a href="상품 이미지경로"></a>
					</div>
					<!-- <a href="상품 간단설명된 이미지 경로"></a>  -->
					<p>분류 : ${tmp.item_type }</p>
					<p>no : ${tmp.item_num }</p>
					<p>${tmp.name }</p>
					<p>${tmp.detail }</p>
					<p>${tmp.price } 원</p>
				</div>
			</li>
		</c:forEach>
	</ul>
	<div id="pageId">
		<!-- 처음페이지로 이동 : 현재 페이지가 1보다 크면 [처음] 하이퍼링크를 화면에 출력 -->
		<c:if test="${pageUtil.curBlock > 1}">
			<a href="${pageContext.request.contextPath}/home.do?curPage=1">[처음]</a>
		</c:if>
		<!-- 이전페이지 블록으로 이동 : 현재 페이지 블럭이 1보다 크면 [이전] 하이퍼링크를 화면에 출력-->
		<c:if test="${pageUtil.curBlock > 1 }">
			<a href="${pageContext.request.contextPath}/home.do?curPage=${pageUtil.prevPage}">[이전]</a>
		</c:if>
		<!-- 하나의 블럭에서 반복문 수행 시작페이지 부터 끝페이지까지 -->
		<c:forEach var="num" begin="${pageUtil.blockBegin }"
			end="${pageUtil.blockEnd }">
			<!-- 현재페이지이면 하이퍼링크 제거 -->
			<c:choose>
				<c:when test="${num == pageUtil.curPage }">
					<span style="color: red">${num }</span>
				</c:when>
				<c:otherwise>
					<a href="${pageContext.request.contextPath}/home.do?curPage=${num}">${num }</a>
				</c:otherwise>
			</c:choose>
		</c:forEach>
		<!-- 다음페이지 블록으로 이동 : 현재 페이지 블럭이 전체 페이지 블럭보다 작거나 같으면 [다음] 하이퍼링크를 화면에 출력-->
		<c:if
			test="${pageUtil.curBlock <= pageUtil.totBlock }">
			<a href="${pageContext.request.contextPath}/home.do?curPage=${pageUtil.nextPage}">[다음]</a>
		</c:if>
		<!-- 끝페이지 블록으로 이동 : 현재 페이지가 전체 페이지보다 작거나 같으면 [끝] 하이퍼링크를 화면에 출력-->
		<c:if
			test="${pageUtil.curPage < pageUtil.totPage }">
			<a href="${pageContext.request.contextPath}/home.do?curPage=${pageUtil.totPage}">[끝]</a>
		</c:if>
	</div>
	<!-- 웹 하단부 info -->
</body>
</html>
>>>>>>> branch 'master' of https://github.com/usang0320/ChockPaler.git
=======
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<html>
<head>
	<style>
		li{
			display: inline-block;
		}
	</style>
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
	<a href="${pageContext.request.contextPath }/userorder/userorderform.do?name=${dto.id }">장바구니</a>
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
		<c:forEach var="tmp" items="${itemList }" step="1" varStatus="status" >
			<li>
				<div>
					<div>
						<a href="상품 이미지경로"></a>
					</div>
					<!-- <a href="상품 간단설명된 이미지 경로"></a>  -->
					<p>분류 : ${tmp.item_type }</p>
					<p>no : ${tmp.item_num }</p>
					<p>${tmp.name }</p>
					<p>${tmp.detail }</p>
					<p>${tmp.price } 원</p>
				</div>
			</li>
		</c:forEach>
	</ul>
	<div id="pageId">
		<!-- 처음페이지로 이동 : 현재 페이지가 1보다 크면 [처음] 하이퍼링크를 화면에 출력 -->
		<c:if test="${pageUtil.curBlock > 1}">
			<a href="${pageContext.request.contextPath}/home.do?curPage=1">[처음]</a>
		</c:if>
		<!-- 이전페이지 블록으로 이동 : 현재 페이지 블럭이 1보다 크면 [이전] 하이퍼링크를 화면에 출력-->
		<c:if test="${pageUtil.curBlock > 1 }">
			<a href="${pageContext.request.contextPath}/home.do?curPage=${pageUtil.prevPage}">[이전]</a>
		</c:if>
		<!-- 하나의 블럭에서 반복문 수행 시작페이지 부터 끝페이지까지 -->
		<c:forEach var="num" begin="${pageUtil.blockBegin }"
			end="${pageUtil.blockEnd }">
			<!-- 현재페이지이면 하이퍼링크 제거 -->
			<c:choose>
				<c:when test="${num == pageUtil.curPage }">
					<span style="color: red">${num }</span>
				</c:when>
				<c:otherwise>
					<a href="${pageContext.request.contextPath}/home.do?curPage=${num}">${num }</a>
				</c:otherwise>
			</c:choose>
		</c:forEach>
		<!-- 다음페이지 블록으로 이동 : 현재 페이지 블럭이 전체 페이지 블럭보다 작거나 같으면 [다음] 하이퍼링크를 화면에 출력-->
		<c:if
			test="${pageUtil.curBlock <= pageUtil.totBlock }">
			<a href="${pageContext.request.contextPath}/home.do?curPage=${pageUtil.nextPage}">[다음]</a>
		</c:if>
		<!-- 끝페이지 블록으로 이동 : 현재 페이지가 전체 페이지보다 작거나 같으면 [끝] 하이퍼링크를 화면에 출력-->
		<c:if
			test="${pageUtil.curPage < pageUtil.totPage }">
			<a href="${pageContext.request.contextPath}/home.do?curPage=${pageUtil.totPage}">[끝]</a>
		</c:if>
	</div>
	<!-- 웹 하단부 info -->
</body>
</html>
>>>>>>> branch 'master' of https://github.com/usang0320/ChockPaler.git
