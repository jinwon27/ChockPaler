<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/items/iteminfo.jsp</title>
</head>
<body>
	<div class="container">
		<!-- 정보들이  출력되는곳-->
		<form action="/basket/insert.do"> <!-- 장바구니 페이지로 보내줄 컨트롤러에 매핑할 주소 -->
		<!-- 여기 마무리 하겠습니다 -->
			<label for="name">상품명</label>
			<input type="text" id="name" name="name" value="${dto.name }"/>
			<br />
			<label for="count">갯수</label>
			<select name="count" id="count">
				<option value="1">1</option>
				<option value="2">2</option>
			</select>
			<br />
			<button type="submit">장바구니 담기</button>
			<button type="reset">취소</button>
		</form>
	</div>
</body>
</html>