<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #e3f2fd;">
		  <div class="container-fluid">
		    <div class="collapse navbar-collapse" id="navbarSupportedContent">
		      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
		      	<li class="nav-item dropdown">
		          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
		          	Brand
		          </a>
		          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
		            <li><a class="dropdown-item" href="#">브랜드 소개</a></li>
		            <li><a class="dropdown-item" href="#">매장 위치</a></li>
		          </ul>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="#">공지사항</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="${pageContext.request.contextPath }/home.do?item_type=cookie">쿠키</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="${pageContext.request.contextPath }/home.do?item_type=beverage">음료</a>
		        </li>
		        <!-- 
		        	<li class="nav-item dropdown">
			          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
			          	음료
			          </a>
			          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
			            <li><a class="dropdown-item" href="#">커피</a></li>
			            <br />
			            <li><a class="dropdown-item" href="#">에이드</a></li>
			          </ul>
			        </li>
		         -->
		        <li class="nav-item">
		          <a class="nav-link" href="#">Event</a>
		        </li>
		      </ul>
		      <!-- 
		      <form class="d-flex" role="search">
		        <input class="form-control me-2" type="search" placeholder="검색어 입력..." aria-label="Search">
		        <button class="btn btn-outline-success" type="submit">search</button>
		      </form>
		      -->
		    </div>
		  </div>
		</nav>
</body>
</html> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<!-- 로그인 및 마이페이지 검색 navbar  -->
<nav class="navbar navbar-expand-md navbar-light fixed-top bg-white">
    <div class="container-fluid">
      <div class="collapse navbar-collapse" id="navbarCollapse">
        <ul class="navbar-nav ms-auto mb-2 mb-md-0">
                <li class="nav-item">
            		<a class="nav-link" href="#">로그인</a>
          		</li>
          		<li class="nav-item">
           			 <a class="nav-link" href="#">회원가입</a>
          		</li>
          		<li class="nav-item">
           			 <a class="nav-link" href="#">마이페이지</a>
          		</li>
          		<li class="nav-item">
           			 <a class="nav-link" href="#">장바구니</a>
          		</li>
          		<li class="nav-item">
           			 <a class="nav-link" href="#">검색</a>
          		</li>
        </ul>
      </div>
    </div>
 </nav>