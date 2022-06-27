<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/notice/list.jsp</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<jsp:include page="/WEB-INF/views/include/navbar.jsp"></jsp:include>
	<div class="container">
		<h1>NOTICE</h1>
		<table class="table table-striped">
			<colgroup>
				<col  class="col-1"/>
				<col  class="col-7"/>
				<col  class="col-4"/>
			</colgroup>
			<thead class="table-dark">
				<tr>
					<th>no</th>
					<th>제목</th>
					<th>날짜</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="tmp" items="${list }" step="1">
					<tr>
						<td>${tmp.num }</td>
						<th scope="row">
							<a href="${pageContext.request.contextPath }/notice/detail.do?num=${tmp.num}">${tmp.title }</a>
						</th>
						<td>${tmp.regdate }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<!-- 페이징 처리하는 구간 -->
		<div id="pageId">
			<!-- 처음페이지로 이동 : 현재 페이지가 1보다 크면 [처음] 하이퍼링크를 화면에 출력 -->
			<ul class="pagination">
				<c:if test="${pageUtil.curBlock > 1}">
					<li class="page-item">
						<a class="page-link" href="${pageContext.request.contextPath}/notice/list.do?curPage=1">처음</a>
					</li>
				</c:if>
				<!-- 이전페이지 블록으로 이동 : 현재 페이지 블럭이 1보다 크면 [이전] 하이퍼링크를 화면에 출력-->
				<c:if test="${pageUtil.curBlock > 1 }">
					<li class="page-item">
						<a class="page-link" href="${pageContext.request.contextPath}/notice/list.do?curPage=${pageUtil.prevPage}">이전</a>
					</li>
				</c:if>
				<!-- 하나의 블럭에서 반복문 수행 시작페이지 부터 끝페이지까지 -->
				<c:forEach var="num" begin="${pageUtil.blockBegin }"
					end="${pageUtil.blockEnd }">
					<!-- 현재페이지이면 하이퍼링크 제거 -->
					
					<li class="page-item ${num == pageUtil.curPage ? 'active':''}">
						<a class="page-link" href="${pageContext.request.contextPath}/notice/list.do?curPage=${num}">${num }</a>
					</li>
					
				</c:forEach>
				<!-- 다음페이지 블록으로 이동 : 현재 페이지 블럭이 전체 페이지 블럭보다 작거나 같으면 [다음] 하이퍼링크를 화면에 출력-->
				<c:if
					test="${pageUtil.curBlock <= pageUtil.totBlock }">
					<li class="page-item">
						<a class="page-link" href="${pageContext.request.contextPath}/notice/list.do?curPage=${pageUtil.nextPage}">다음</a>
					</li>
				</c:if>
				<!-- 끝페이지 블록으로 이동 : 현재 페이지가 전체 페이지보다 작거나 같으면 [끝] 하이퍼링크를 화면에 출력-->
				<c:if
					test="${pageUtil.curPage < pageUtil.totPage }">
					<li class="page-item">
						<a class="page-link" href="${pageContext.request.contextPath}/notice/list.do?curPage=${pageUtil.totPage}">끝</a>					
					</li>
				</c:if>
			</ul>
		</div>
		
		<button type="button" class="btn btn-outline-info" onclick="location.href='${pageContext.request.contextPath }/notice/add.do';">등록</button>
	</div>
   	<!-- 웹 하단부 info -->
   	<%@include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>