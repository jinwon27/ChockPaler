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
			<label for="younghwa">타입</label>
			<input type="text" id="younghwa" name="type"/>
			<br />
			<label for="younghwa2">상품명</label>
			<input type="text" id="younghwa2" name="name"/>
			<br />
			<label for="">상세정보</label>
			<textarea name="detail" id=""></textarea>
			<br />
			<label for="">price</label>
			<input type="text" id="" name="price" />
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