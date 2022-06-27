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
	<form action="${pageContext.request.contextPath }/buy/buy.do">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>
						<input type="checkbox" id="chkAll"/>
						<span>전체선택</span>
					</th>
					<th class="text-center" colspan="2">상품정보</th>
					<th>수량</th>
					<th>가격</th>
					<th class="text-center">삭제</th>
				</tr>
			</thead>
			<c:choose>
				<c:when test="${empty list }">
					<tbody>
						<tr>
							<th class="text-center" colspan="6">장바구니가 비었습니다.</th>
						</tr>
					</tbody>
				</c:when>
				<c:otherwise>
					<c:forEach var="tmp" items="${list}" step="1" varStatus="status" >
						<tbody>
							<tr>
								<td>
									<input type="checkbox" class="chk" name="" value="${tmp.name }"/>
								</td>
								<td>
									<img src="${pageContext.request.contextPath }${tmp.img}" />
								</td>
								<td>${tmp.name }</td>
								<td>${tmp.count }</td>
								<td>${tmp.price }</td>
								<td class="text-center"><a href="${pageContext.request.contextPath }/basket/delete.do">
										<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-trash3" viewBox="0 0 16 16">
										  <path d="M6.5 1h3a.5.5 0 0 1 .5.5v1H6v-1a.5.5 0 0 1 .5-.5ZM11 2.5v-1A1.5 1.5 0 0 0 9.5 0h-3A1.5 1.5 0 0 0 5 1.5v1H2.506a.58.58 0 0 0-.01 0H1.5a.5.5 0 0 0 0 1h.538l.853 10.66A2 2 0 0 0 4.885 16h6.23a2 2 0 0 0 1.994-1.84l.853-10.66h.538a.5.5 0 0 0 0-1h-.995a.59.59 0 0 0-.01 0H11Zm1.958 1-.846 10.58a1 1 0 0 1-.997.92h-6.23a1 1 0 0 1-.997-.92L3.042 3.5h9.916Zm-7.487 1a.5.5 0 0 1 .528.47l.5 8.5a.5.5 0 0 1-.998.06L5 5.03a.5.5 0 0 1 .47-.53Zm5.058 0a.5.5 0 0 1 .47.53l-.5 8.5a.5.5 0 1 1-.998-.06l.5-8.5a.5.5 0 0 1 .528-.47ZM8 4.5a.5.5 0 0 1 .5.5v8.5a.5.5 0 0 1-1 0V5a.5.5 0 0 1 .5-.5Z"/>
										</svg>
									</a>
								</td>
							</tr>
						</tbody>
					</c:forEach>
				</c:otherwise>
			</c:choose>
			
			<tfoot>
				<tr>
					<th colspan="3" class="text-center">총액</th>
					<th>:</th>
					<th></th>
				</tr>
			</tfoot>
		</table>
		<div class="text-center">
			<button class="btn btn-success" type="submit">구매하기</button>
			<button class="btn btn-primary" >쇼핑 계속하기</button>
		</div>
		
	</form>
	<script>
		let chkAll = document.querySelector("#chkAll");
		chkAll.addEventListener("change", function(){
			let chkList = document.querySelectorAll(".chk");
			for(chk of chkList){
				chk.checked = chkAll.checked;
			}
		});
		
		
		//let chks = document.querySelectorAll(".chk");
		//for(let i=0; i<chks.length; i++){
			//chks[i].addEventLister("check", function(){
			//	
		//	});
		//}
		
		
	</script>
	
	<!-- 
		<h1>${id}님의 장바구니</h1>
		<c:forEach var="tmp" items="${list}" step="1" varStatus="status" >
			<div class="row">
				<div class="col-4">
			      <img src="${pageContext.request.contextPath }${tmp.img}" />
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
	 -->
	
</body>
</html>