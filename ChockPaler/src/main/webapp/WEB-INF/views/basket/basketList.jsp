<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/basket/basketList.jsp</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/navbar.css" />
<style>
* {
	margin: 0;
	padding: 0;
	-webkit-font-smoothing: antialiased;
	-webkit-text-shadow: rgba(0, 0, 0, .01) 0 0 1px;
	text-shadow: rgba(0, 0, 0, .01) 0 0 1px
}

body {
	font-family: 'Rubik', sans-serif;
	font-size: 14px;
	font-weight: 400;
	background: #E0E0E0;
	color: #000000
}

ul {
	list-style: none;
	margin-bottom: 0px
}

.button {
	display: inline-block;
	background: #0e8ce4;
	border-radius: 5px;
	height: 48px;
	-webkit-transition: all 200ms ease;
	-moz-transition: all 200ms ease;
	-ms-transition: all 200ms ease;
	-o-transition: all 200ms ease;
	transition: all 200ms ease
}

.button a {
	display: block;
	font-size: 18px;
	font-weight: 400;
	line-height: 48px;
	color: #FFFFFF;
	padding-left: 35px;
	padding-right: 35px
}

.button:hover {
	opacity: 0.8
}

.cart_section {
	width: 100%;
	padding-top: 93px;
	padding-bottom: 111px
}

.cart_title {
	font-size: 30px;
	font-weight: 500
}

.cart_items {
	margin-top: 8px
}

.cart_list {
	border: solid 1px #e8e8e8;
	box-shadow: 0px 1px 5px rgba(0, 0, 0, 0.1);
	background-color: #fff
}

.cart_item {
	width: 100%;
	padding: 15px;
	padding-right: 46px
}

.cart_item_image {
	width: 133px;
	height: 133px;
	float: left
}

.cart_item_image img {
	max-width: 100%
}

.cart_item_info {
	width: calc(100% - 133px);
	float: left;
	padding-top: 18px
}

.cart_item_name {
	margin-left: 7.53%
}

.cart_item_title {
	font-size: 14px;
	font-weight: 400;
	color: rgba(0, 0, 0, 0.5)
}

.cart_item_text {
	font-size: 18px;
	margin-top: 35px
}

.cart_item_text span {
	display: inline-block;
	width: 20px;
	height: 20px;
	border-radius: 50%;
	margin-right: 11px;
	-webkit-transform: translateY(4px);
	-moz-transform: translateY(4px);
	-ms-transform: translateY(4px);
	-o-transform: translateY(4px);
	transform: translateY(4px)
}

.cart_item_price {
	text-align: right
}

.cart_item_total {
	text-align: right
}

.order_total {
	width: 100%;
	height: 60px;
	margin-top: 30px;
	border: solid 1px #e8e8e8;
	box-shadow: 0px 1px 5px rgba(0, 0, 0, 0.1);
	padding-right: 46px;
	padding-left: 15px;
	background-color: #fff
}

.order_total_title {
	display: inline-block;
	font-size: 14px;
	color: rgba(0, 0, 0, 0.5);
	line-height: 60px
}

.order_total_amount {
	display: inline-block;
	font-size: 18px;
	font-weight: 500;
	margin-left: 26px;
	line-height: 60px
}

.cart_buttons {
	margin-top: 60px;
	text-align: right
}

.cart_button_clear {
	display: inline-block;
	border: none;
	font-size: 18px;
	font-weight: 400;
	line-height: 48px;
	color: rgba(0, 0, 0, 0.5);
	background: #FFFFFF;
	border: solid 1px #b2b2b2;
	padding-left: 35px;
	padding-right: 35px;
	outline: none;
	cursor: pointer;
	margin-right: 26px
}

.cart_button_clear:hover {
	border-color: #0e8ce4;
	color: #0e8ce4
}

.cart_button_checkout {
	display: inline-block;
	border: none;
	font-size: 18px;
	font-weight: 400;
	line-height: 48px;
	color: #FFFFFF;
	padding-left: 35px;
	padding-right: 35px;
	outline: none;
	cursor: pointer;
	vertical-align: top
}
}
</style>
</head>
<body>
	<div class="cart_section">
		<jsp:include page="/WEB-INF/views/include/navbar.jsp"></jsp:include>
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-10 offset-lg-1">
					<div class="cart_container">
						<form action="${pageContext.request.contextPath }/buy/buyform.do">
							<div class="cart_title">Shopping Cart</div>
							<div class="cart_items">
								<ul class="cart_list">
									<c:forEach var="tmp" items="${list}" step="1">
										<li class="cart_item clearfix">
											<div class="cart_item_image">
												<img src="${pageContext.request.contextPath }${tmp.img}" name="img"/>
											</div>
											<div
												class="cart_item_info d-flex flex-md-row flex-column justify-content-between">
												<div class="cart_item_name cart_info_col">
													<div class="cart_item_title">
														<label for="item_num">Num</label>
													</div>
													<div class="cart_item_text">${tmp.item_num }
														<input class="form-control" type="text" id="item_num"
															name="item_num" value="${tmp.item_num }" disabled="disabled"
															hidden="true">
													</div>
												</div>
												<div class="cart_item_color cart_info_col">
													<div class="cart_item_title">
														<label for="name">Name</label>
													</div>
													<div class="cart_item_text">${tmp.name}
														<input class="form-control" type="text" id="name"
															name="name" value="${tmp.name}" disabled="disabled"
															hidden="true">
													</div>
												</div>
												<div class="cart_item_quantity cart_info_col">
													<div class="cart_item_title">
														<label for="id">id</label>
													</div>
													<div class="cart_item_text">${tmp.id }
														<input class="form-control" type="text" id="id" name="id"
															value="${tmp.id}" disabled="disabled" hidden="true">
													</div>
												</div>
												<div class="cart_item_price cart_info_col">
													<div class="cart_item_title">
														<label for="count">Count</label>
													</div>
													<div class="cart_item_text">${tmp.count}
														<input class="form-control" type="text" id="count"
															name="count" value="${tmp.count}" disabled="disabled"
															hidden="true">
													</div>
												</div>
												<div class="cart_item_total cart_info_col">
													<div class="cart_item_title">
														<label for="price">Total</label>
													</div>
													<div class="cart_item_text">${tmp.price}
														<input class="form-control" type="text" id="price"
															name="price" value="${tmp.price}" disabled="disabled"
															hidden="true">
													</div>
												</div>
												<div class="cart_item_total cart_info_col">
													<div class="cart_item_title">Delete</div>
													<div class="cart_item_text">
														<a
															href="${pageContext.request.contextPath }/basket/delete.do?item_num=${tmp.item_num}">
															<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-trash3" viewBox="0 0 16 16">
															  <path d="M6.5 1h3a.5.5 0 0 1 .5.5v1H6v-1a.5.5 0 0 1 .5-.5ZM11 2.5v-1A1.5 1.5 0 0 0 9.5 0h-3A1.5 1.5 0 0 0 5 1.5v1H2.506a.58.58 0 0 0-.01 0H1.5a.5.5 0 0 0 0 1h.538l.853 10.66A2 2 0 0 0 4.885 16h6.23a2 2 0 0 0 1.994-1.84l.853-10.66h.538a.5.5 0 0 0 0-1h-.995a.59.59 0 0 0-.01 0H11Zm1.958 1-.846 10.58a1 1 0 0 1-.997.92h-6.23a1 1 0 0 1-.997-.92L3.042 3.5h9.916Zm-7.487 1a.5.5 0 0 1 .528.47l.5 8.5a.5.5 0 0 1-.998.06L5 5.03a.5.5 0 0 1 .47-.53Zm5.058 0a.5.5 0 0 1 .47.53l-.5 8.5a.5.5 0 1 1-.998-.06l.5-8.5a.5.5 0 0 1 .528-.47ZM8 4.5a.5.5 0 0 1 .5.5v8.5a.5.5 0 0 1-1 0V5a.5.5 0 0 1 .5-.5Z"/>
															</svg>
														</a>
													</div>
												</div>
											</div>
										</li>
									</c:forEach>
								</ul>
							</div>
							<div class="order_total">
								<div class="order_total_content text-md-right">
									<div class="order_total_title">Order Total:</div>
									<div class="order_total_amount">${sum}
										<input type="text" id="sum" name="sum" value="${sum }" hidden="true"/>
									</div>
								</div>
							</div>
							<div class="cart_buttons">
								<button type="button" class="button cart_button_clear">쇼핑
									계속하기</button>
								<button type="submit" class="button cart_button_checkout">구매하기
								</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>