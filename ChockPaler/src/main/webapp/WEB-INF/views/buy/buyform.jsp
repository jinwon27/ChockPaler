<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/buy/buy.jsp</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</head>
<body>
<jsp:include page="/WEB-INF/views/include/navbar.jsp"></jsp:include>
	<div class="container">
		<h1>주문 페이지 입니다.</h1>
		<form action="${pageContext.request.contextPath }/buy/order.do" >
		<table class="table table-striped">
			<thead>
				<tr>
					<th class="text-center" colspan="2">상품정보</th>
					<th>수량</th>
					<th>가격</th>
				</tr>
			</thead>
				<tbody>
					<tr>
						<c:forEach var="tmp" items="${list }">
							<td>
								<img src="${pageContext.request.contextPath }${tmp.img}" />
							</td>
							<td>${tmp.name }</td>
							<td>${tmp.count }</td>
							<td>${tmp.price }</td>
						</c:forEach>
					</tr>
				</tbody>
			<tfoot>
				<tr>
					<th colspan="3" class="text-center">총액</th>
					<th>${sum }</th>
				</tr>
			</tfoot>
		</table>
		<br />
		<div>
			<label for="client_name">받는 분</label>
			<input type="text" name="client_name" id="client_name"/>
			<br />
			<label for="addr">배송지</label>
			<input type="text" name="addr" id="addr" />
		</div>
		<div class="text-center">
			<button class="btn btn-success" type="submit">주문하기</button>
		</div>
	</form>
	</div>
</body>
</html>