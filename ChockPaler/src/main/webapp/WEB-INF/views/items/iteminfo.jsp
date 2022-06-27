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
		
		<!-- 댓글 입력할 div -->
		<div class="row">
			<form action="${pageContext.request.contextPath }/review/addreview.do">
				<div class="input-group mb-3">
					<input type="hidden" name="id" value="${id }" />
					<input type="hidden" name="item_num" value="${num }"/>
					<input type="text" name="comment" id="comment" class="form-control" placeholder="구매후기를 작성해주세요" aria-label="Recipient's username" aria-describedby="button-addon2">
					<button class="btn btn-outline-secondary" type="submit" id="button-addon2">작성</button>
				</div>
			</form>
		</div>
		
		<!-- 댓글 보여주는 리스트 -->
		<table class="table">
			<thead>
				<tr>
      				<th scope="col">no</th>
      				<th scope="col">작성자</th>
      				<th scope="col">내용</th>
      				<th scope="col">날짜</th>
    			</tr>
			</thead>
			<c:forEach var="tmp" items="${list }" step="1">
				<tr>
					<th scope="row">${tmp.num }</th>
					<td>${tmp.id }</td>
					<td>${tmp.comment }</td>
					<td>${tmp.regdate }</td>
				</tr>
			</c:forEach>
		</table>
		
		<!-- 페이징 처리하는 구간 -->
		
		<div id="pageId">
			<!-- 처음페이지로 이동 : 현재 페이지가 1보다 크면 [처음] 하이퍼링크를 화면에 출력 -->
			<ul class="pagination">
				<c:if test="${pageUtil.curBlock > 1}">
					<li class="page-item">
						<a class="page-link" href="${pageContext.request.contextPath}/items/iteminfo.do?curPage=1&num=${dto.item_num }">처음</a>
					</li>
				</c:if>
				<!-- 이전페이지 블록으로 이동 : 현재 페이지 블럭이 1보다 크면 [이전] 하이퍼링크를 화면에 출력-->
				<c:if test="${pageUtil.curBlock > 1 }">
					<li class="page-item">
						<a class="page-link" href="${pageContext.request.contextPath}/items/iteminfo.do?curPage=${pageUtil.prevPage}&num=${dto.item_num }">이전</a>
					</li>
				</c:if>
				<!-- 하나의 블럭에서 반복문 수행 시작페이지 부터 끝페이지까지 -->
				<c:forEach var="num" begin="${pageUtil.blockBegin }"
					end="${pageUtil.blockEnd }">
					<!-- 현재페이지이면 하이퍼링크 제거 -->
					
					<li class="page-item ${num == pageUtil.curPage ? 'active':''}">
						<a class="page-link" href="${pageContext.request.contextPath}/items/iteminfo.do?curPage=${num}&num=${dto.item_num }">${num }</a>
					</li>
					
				</c:forEach>
				<!-- 다음페이지 블록으로 이동 : 현재 페이지 블럭이 전체 페이지 블럭보다 작거나 같으면 [다음] 하이퍼링크를 화면에 출력-->
				<c:if
					test="${pageUtil.curBlock <= pageUtil.totBlock }">
					<li class="page-item">
						<a class="page-link" href="${pageContext.request.contextPath}/items/iteminfo.do?curPage=${pageUtil.nextPage}&num=${dto.item_num }">다음</a>
					</li>
				</c:if>
				<!-- 끝페이지 블록으로 이동 : 현재 페이지가 전체 페이지보다 작거나 같으면 [끝] 하이퍼링크를 화면에 출력-->
				<c:if
					test="${pageUtil.curPage < pageUtil.totPage }">
					<li class="page-item">
						<a class="page-link" href="${pageContext.request.contextPath}/items/iteminfo.do?curPage=${pageUtil.totPage}&num=${dto.item_num }">끝</a>					
					</li>
				</c:if>
			</ul>
		</div>
		
	</div>
   	<!-- 웹 하단부 info -->
   	<%@include file="/WEB-INF/views/include/footer.jsp" %>
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