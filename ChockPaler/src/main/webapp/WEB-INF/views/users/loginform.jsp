<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/users/loginform.jsp</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<style>
	html,
	body {
	  height: 100%;
	}
	
	body {
	  display: flex;
	  align-items: center;
	  padding-top: 40px;
	  padding-bottom: 40px;
	  background-color: #f5f5f5;
	}
	
	.form-signin {
	  max-width: 330px;
	  padding: 15px;
	}
	
	.form-signin .form-floating:focus-within {
	  z-index: 2;
	}
	
	.form-signin input[type="email"] {
	  margin-bottom: -1px;
	  border-bottom-right-radius: 0;
	  border-bottom-left-radius: 0;
	}
	
	.form-signin input[type="password"] {
	  margin-bottom: 10px;
	  border-top-left-radius: 0;
	  border-top-right-radius: 0;
	}	
</style>
</head>
<body class="text-center">
<jsp:include page="/WEB-INF/views/include/navbar.jsp"></jsp:include>
	<main class="form-signin w-100 m-auto">
		<form action="${pageContext.request.contextPath}/users/login.do" method="post">
			<c:choose>
				<c:when test="${ empty param.url }">
					<input type="hidden" name="url" value="${pageContext.request.contextPath}/"/>
				</c:when>
				<c:otherwise>
					<input type="hidden" name="url" value="${param.url }"/>
				</c:otherwise>
			</c:choose>   
	   
			<img class="mb-4" src="${pageContext.request.contextPath}/images/쿠키이미지.png" alt="" width="72" height="57">
			<h1 class="h3 mb-3 fw-normal">로그인</h1>
	
			<div class="form-floating">
				<input type="text" class="form-control" id="id" name="id" placeholder="아이디 입력...">
				<label for="floatingInput">아이디</label>
			</div>
			<div class="form-floating">
				<input type="password" class="form-control" id="pwd" name="pwd" placeholder="비밀번호 입력">
				<label for="floatingPassword">비밀번호</label>
			</div>
	
			<div class="checkbox mb-3">
				<label>
					<input type="checkbox" name="isSave"> 아이디 저장
				</label>
	    	</div>
		<button class="w-100 btn btn-lg btn-primary" type="submit">Sign in</button>
	    <p class="mt-5 mb-3 text-muted">&copy; 2017–2022</p>
		</form>
	</main>
</body>
</body>
</html>