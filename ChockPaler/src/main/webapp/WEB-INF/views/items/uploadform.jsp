<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/items/uploadform.jsp</title>
</head>
<body>
	<div class="container">
		<form action="${pageContext.request.contextPath }/views/items/upload.do">
			<label for="type">타입</label>
			<select name="type" id="type">
				<option value="">선택</option>
				<option value="cookie">쿠키</option>
				<option value="beverage">음료</option>
			</select>
			<br />
			<label for="name">상품명</label>
			<input type="text" id="name" name="name"/>
			<br />
			<label for="detail">상세정보</label>
			<textarea name="detail" id="detail"></textarea>
			<br />
			<label for="price">price</label>
			<input type="text" id="price" name="price" /> 원
			<br />
			<label for="">이미지</label>
			<!-- image 첨부하는 요소 -->
			<br />
			<label for="">재고</label>
			<input type="text" id="" name=""/>
			<br />
			<button type="submit">Upload</button>
		</form>
	</div>
</body>
</html>