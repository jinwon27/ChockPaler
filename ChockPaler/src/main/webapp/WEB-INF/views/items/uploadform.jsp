<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>/views/items/uploadform.jsp</title>
</head>
<body>
	<div class="container">
		<div class="mb-3">
			<form action="${pageContext.request.contextPath }/items/upload.do">
				<label for="type" class="form-label">타입</label>
				<select class="form-select" name="item_type" id="type">
					<option value="">선택</option>
					<option value="cookie">쿠키</option>
					<option value="beverage">음료</option>
				</select>
				<br />
				<label class="form-label" for="name">상품명</label>
				<input type="text" class="form-control" id="name" name="name" placeholder="상품명 입력.." />
				<br />
				<label class="form-label" for="detail">상세정보</label>
				<textarea class="form-control" name="detail" id="detail"></textarea>
				<br />
				<label class="form-label" for="price">price</label>
				<input type="text" class="form-control" id="price" name="price" placeholder="가격 입력..." /> 원
				<br />
				<label class="form-label" for="img">이미지</label>
				<input type="file" class="form-control" name="img" id="img"
		            	accept=".jpg, .jpeg, .png, .JPG, .JPEG"/>
				<br />
				<label class="form-label" for="remain_count">재고</label>
				<input type="text" class="form-control" id="remain_count" name="remain_count" placeholder="재고 입력..."/>
				<br />
				<button class="btn btn-outline-success" type="submit">등록</button>
				<button class="btn btn-outline-danger" type="reset">취소</button>
			</form>
		</div>
	</div>
</body>
</html>