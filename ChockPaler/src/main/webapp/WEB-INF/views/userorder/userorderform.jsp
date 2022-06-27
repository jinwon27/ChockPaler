<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/userorder/userorder.jsp</title>
	<script>
		$(function()){
			$("#btnDelete").click(function(){
				if(alret("장바구니를 비우겠습니까?")){
					location.href="${pageContext.request.contextPath }/userorder/deleteAll.do";
				}
			});
			
		};
	</script>
</head>
<body>

	<h1>장바구니</h1>
	<c:choose>
		<c:when test="${map.count==0 }">
		장바구니가 비었습니다.
		</c:when>
		<c:otherwise>
		<form id="form1" name="form1" method="post"
        action="${pageContext.request.contextPath }/userorder/update.do">
        		<table border="1" width="400px">
	        		<tr>
	                    <th>상품명</th>
	                    <th>단가</th>
	                    <th>수량</th>
	                    <th>금액</th>
	                    
	                </tr>
	             <c:forEach var="row" items="${map.list }" >
	             	<tr align="center">
	             		<td>${row.name }</td>
	             		<td>${row.price }</td>
	             		<td><input type="number" name="count" style="width:30px;" value="${row.count }"/><input type="hidden" name="NUM" value="${row.NUM }" /></td>
	             		<td><a href="${pageContext.request.contextPath }/userorder/delete.do?NUM=${row.NUM}">[삭제]</a></td>
	             	</tr>
	             </c:forEach>
	             <tr>
	             	<td colspan="5" align="right">
	             		장바구니 금액 합계: ${map.sumPrice }
	             	</td>
	             </tr>
        		</table>
        		<button type="submit" id="btnUpdate">수정</button>
        		<button type="button" id="btnDelete">장바구니 비우기</button>
        </form>
		</c:otherwise>
	</c:choose>
	<button type="button" id="btnList">상품목록</button>
   	<!-- 웹 하단부 info -->
   	<%@include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>