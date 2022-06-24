<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/notice/list.jsp</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>NOTICE</h1>
		<table class="table table-striped">
			<colgroup>
				<col  class="col-1"/>
				<col  class="col-7"/>
				<col  class="col-4"/>
			</colgroup>
			<thead class="table-dark">
				<tr>
					<th>no</th>
					<th>제목</th>
					<th>날짜</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="tmp" items="${list }" step="1">
					<tr>
						<td>${tmp.num }</td>
						<th scope="row">
							<a href="${pageContext.request.contextPath }/notice/detail.do?num=${tmp.num}">${tmp.title }</a>
						</th>
						<td>${tmp.regdate }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<button type="button" class="btn btn-outline-info" onclick="location.href='${pageContext.request.contextPath }/notice/add.do';">등록</button>
	</div>
</body>
</html>