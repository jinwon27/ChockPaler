<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/items/iteminfo.jsp</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col">
				<img src="${pageContext.request.contextPath }${dto.img}" class="img-thumbnail">
			</div>
			<div class="col">
				<form action="${pageContext.request.contextPath }/basket/insert.do">
					<input type="hidden" name="item_num" value="${dto.item_num }">
					<input type="hidden" name="name" value="${dto.name }"/>
					<input type="hidden" name="img" value="${dto.img }"/>
					<label for="" class="col-sm-2 col-form-label">
						<p>${dto.name }</p>
					</label>
					<br />
					<select name="count" id="count" class="form-select" aria-label="Default select example">
					 	<option selected>수량을 선택하세요.</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						<option value="10">10</option>
					</select>
					<br />
					<div class="form-floating">
  						<textarea class="form-control" placeholder="Leave a comment here" id="floatingTextarea2" name="detail" style="height: 100px">
							${dto.detail }	
  						</textarea>
  						<label for="floatingTextarea2">Detail</label>
					</div>
					<br />
					<div class="input-group mb-3">
  						<span class="input-group-text" id="basic-addon3">가격</span>
  						<input data-price="${dto.price }" type="text" class="form-control" id="basic-url" name="price" aria-describedby="basic-addon3" value="${dto.price }">
					</div>
					<br />
					<button type="submit" class="btn btn-outline-success">장바구니 담기</button>
					<button type="reset" class="btn btn-outline-danger">취소</button>
				</form>
    		</div>
		</div>
	</div>
</body>
<script src="${pageContext.request.contextPath}/resources/js/gura_util.js"></script>
<script>
	document.querySelector("#count").addEventListener("change", function(){
		var count = this.value;
		let price=document.querySelector("#basic-url").getAttribute("data-price");
		
		document.querySelector("#basic-url").value = price*count;
	});
</script>
</html>