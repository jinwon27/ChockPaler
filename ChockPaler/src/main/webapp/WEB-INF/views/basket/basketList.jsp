<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/basket/basketList.jsp</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
	<h1>${id}님의 장바구니</h1>
	<c:forEach var="tmp" items="${list}" step="1" varStatus="status" >
		<div class="row">
			<div class="col-4">
		      <p>${tmp.img }</p>
		    </div>
		    <div class="col">
		   		<p>상품 : ${tmp.name }</p>
		      	<p>수량 : ${tmp.count }</p>
		      	<p>가격 : ${tmp.price }</p>
		      	<p>------------------</p>
		    </div>
		</div>
	</c:forEach>
	<h1><strong>총액 : ${sum}</strong></h1>
</body>
</html>