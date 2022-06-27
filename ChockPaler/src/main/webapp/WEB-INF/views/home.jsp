<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<html>
<head>
   <title>/home.jsp</title>
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
   <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/header.css" />
   <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/footer.css" />
   <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/navbar.css" /> 
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
         <span> </span>
      </h2>

		<div class="container container-mt" style="margin-top:30px;">
    		<div class="row">
        	<c:forEach var="tmp" items="${itemList }" step="1" varStatus="status" >
            	<div class="col-md-4 margin">
                	<div class="card">
                    	<a href="${pageContext.request.contextPath }/items/iteminfo.do?num=${tmp.item_num }">
                        	<img src="${tmp.img}" class="card-img-top" height="300" >
                    	</a> 
                        <div class="card-body">
                            <p class="card-title">${tmp.name}</p> 
                            <h3 class="card-title text-secondary">\ ${tmp.price} </h3>
                        </div>
                </div>
            </div>
        	</c:forEach>
		</div>
      <c:choose>
      	<c:when test="!isSearchWord">
      		<%@include file="/WEB-INF/views/include/paging.jsp" %>
      	</c:when>
      	<c:otherwise>
      		<%@include file="/WEB-INF/views/include/paging2.jsp" %>
      	</c:otherwise>
      </c:choose>
   </div>
   </div>
   <!-- 웹 하단부 info -->
   <%@include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>









