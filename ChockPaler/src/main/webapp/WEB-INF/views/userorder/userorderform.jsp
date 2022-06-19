<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/userorder/userorder.jsp</title>
</head>
<body>

	<h1>장바구니</h1>
	
	<div class="container">
		
		<table class="cart_table">
					<caption>장바구니 목록</caption>
					<tbody>

						<tr>
							<th class="cart_table1"></th>
							<th class="cart_table2"></th>
							<th class="cart_table3">상품명</th>
							<th class="cart_table4">가격</th>
							<th class="cart_table4">삭제</th>
						</tr>
					</tbody>
				</table>
				<table class="cart2_table">
					<caption>장바구니</caption>
					<tbody>
						<c:forEach var="tmp" items="${list })">
						<td class="cart_table1"> <input type="checkbox" /></td>
						<td class="cart_table2"></td>
						<td class="cart_table4">상품명:${name }</td>
						<td class="cart_table4">가격: ${price }</td>
						
						
						<td> <button type="reset">선택 삭제</button></td>
						
						
						</c:forEach>
					</tbody>
				</table>
		
		 <form action="/userorder/userorderBuy.do">
			<!-- 장바구니에 담긴 item.dto -->
			<!-- 이름 -->
			<!-- 가격 -->
			
			<button  type="submit">주문하기</a></button>
			
		</form>
	</div>
</body>
</html>