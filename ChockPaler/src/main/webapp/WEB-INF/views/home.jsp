<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<html>
<head>
	<style>
		li{
			display: inline-block;
		}
		.pagination{
			justify-content : center;
		}
		.card{
   			animation-duration : 0.6s; 
		}
		
		.carousel-item{
			background-color: #cecece;
		}
		
		.carousel-item img{
			/* fill | contain | cover | scale-down | none(default) */
			object-fit: contain;
		}
		.page-item.active .page-link {
			background-color: gray;
			border-color: black;
		}
	</style>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css" />
</head>
<body>
	
	<div class="container">
		<!-- 여기서부터 진원님 -->
		<jsp:include page="/WEB-INF/views/include/navbar.jsp"></jsp:include>
		<jsp:include page="/WEB-INF/views/include/header.jsp"></jsp:include>
	
		<!-- 0624 진원님 여기까지 -->
		
		
		<div id="carouselExampleControls" class="carousel slide carousel-fade" data-bs-ride="carousel">
			<div class="carousel-indicators">
				<button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
				<button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
				<button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
				<button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="3" aria-label="Slide 4"></button>
			</div>
			
			<div class="carousel-inner">
				<div class="carousel-item active">
		      		<img src="${pageContext.request.contextPath }/images/1.jpg" class="d-block w-100" width="600" height="600">
		    	</div>
		    	<div class="carousel-item">
		      		<img src="${pageContext.request.contextPath }/images/2.jpg" class="d-block w-100" width="600" height="600">
		    	</div>
			    <div class="carousel-item">
			      	<img src="${pageContext.request.contextPath }/images/3.jpg" class="d-block w-100" width="600" height="600">
			    </div>
			    <div class="carousel-item">
			      	<img src="${pageContext.request.contextPath }/images/4.jpg" class="d-block w-100" width="600" height="600">
			    </div>
			</div>
			<button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
				<span class="carousel-control-prev-icon" aria-hidden="true"></span>
			    <span class="visually-hidden">Previous</span>
			</button>
			<button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
			    <span class="carousel-control-next-icon" aria-hidden="true"></span>
			    <span class="visually-hidden">Next</span>
			</button>
		</div>
		
		<h2>
			<span> ITEMS </span>
		</h2>
		<div class="row">
			<c:forEach var="tmp" items="${itemList }" step="1" varStatus="status" >
				<div class="col-12 col-md-6 col-lg-4">
					<div class="card mb-3 animate__animated animate__fadeIn" id="itemsDiv">
					<!-- <a href="상품 간단설명된 이미지 경로"></a>  -->
						<a href="${pageContext.request.contextPath }/items/iteminfo.do?num=${tmp.item_num }">
							<div class="img-wrapper">
								<img class="card-img-top" src="${pageContext.request.contextPath }${tmp.img}"/>
							</div>
						</a>
						<div class="card-body">
							<p>분류 : ${tmp.item_type }</p>
							<p>no : ${tmp.item_num }</p>
							<p>${tmp.name }</p>
							<p>${tmp.detail }</p>
							<p>${tmp.price } 원</p>
						</div>		
					</div>
				</div>
		</c:forEach>
	</div>
	
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
	<%@include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>










