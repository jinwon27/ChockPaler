
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<!-- 로그인 및 마이페이지 검색 navbar  -->
<nav class="navbar navbar-expand-md navbar-light fixed-top bg-white">
	<div class="container-fluid">
		<a href="">
			<svg class="bi me-2" width="40" height="32"><use xlink:href="#bootstrap"/></svg>
		</a>
		<div class="collapse navbar-collapse" id="navbarCollapse">
			<ul class="navbar-nav ms-auto mb-2 mb-md-0">
				<c:choose>
        			<c:when test="${ empty sessionScope.id}">
                		<li class="nav-item">
            				<a class="nav-link" href="${pageContext.request.contextPath}/users/loginform.do">로그인 </a>
          				</li>
          				<li class="nav-item">
           			 		<a class="nav-link" href="${pageContext.request.contextPath}/users/signupform.do">회원가입</a>
          				</li>
          			</c:when>
				<c:otherwise>
          			<li>
          				<a href="${pageContext.request.contextPath}/users/logout.do" class="nav-link">로그아웃</a>
					</li>
					<!-- 계정명이 admin 일시 상품등록하기 -->
					<c:choose>
						<c:when test="${sessionScope.id == 'admin' }">
							<li class="nav-item">
								<a class="nav-link" href="${pageContext.request.contextPath}/items/uploadform.do">상품등록</a>
							</li>
						</c:when>
					</c:choose>
          		</c:otherwise>
				</c:choose>
					<li class="nav-item">
						<a class="nav-link" href="${pageContext.request.contextPath }/orderinquiry/orderinquiry.do?id=${id }" >
							<svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" fill="currentColor" class="bi bi-person" viewBox="0 0 16 16">
								<path d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6zm2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0zm4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10z"/>
							</svg>
						</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="${pageContext.request.contextPath }/basket/basketList.do">
							<svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" fill="currentColor" class="bi bi-cart3" viewBox="0 0 16 16">
								<path d="M0 1.5A.5.5 0 0 1 .5 1H2a.5.5 0 0 1 .485.379L2.89 3H14.5a.5.5 0 0 1 .49.598l-1 5a.5.5 0 0 1-.465.401l-9.397.472L4.415 11H13a.5.5 0 0 1 0 1H4a.5.5 0 0 1-.491-.408L2.01 3.607 1.61 2H.5a.5.5 0 0 1-.5-.5zM3.102 4l.84 4.479 9.144-.459L13.89 4H3.102zM5 12a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm7 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm-7 1a1 1 0 1 1 0 2 1 1 0 0 1 0-2zm7 0a1 1 0 1 1 0 2 1 1 0 0 1 0-2z"/>
							</svg>
           				</a>
          			</li>         		        
				</ul>	
		</div>
	</div> 
 </nav>
 
  