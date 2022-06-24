<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8" />
<meta name="google-signin-scope" content="profile email">
<meta name="google-signin-client_id" content="840345488051-t7d9q5tg8he8kt3om4dmlovpjom64m3q.apps.googleusercontent.com">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>



</head>
<style>
* {
  margin: 0;
  padding: 0;
}

body {
  font-family: 'Open Sans', sans-serif;
}

a {
  text-decoration: none;
  color: #666;
  
}

a:hover {
  /* background-color: yellow; */
}



.wrapper {
/*   background-color: pink; */
  max-width: 1000px;
  height: 40px;
  margin: 0 auto;
  position: relative;
}

.search-bar {
  position: absolute;
  top: 5px;
}

.search-bar input {
  background-color: transparent;
  border-bottom: 1px solid #000;
  border-right: 0;
  border-top: 0;
  border-left: 0;
}

.blog {
  position: absolute;
  top: 5px;
  right: 200px;
}

.store {
  position: absolute;
  top: 5px;
  right: 0;
}

.wrapper2 {
  max-width: 1200px;
  margin: 0 auto;
}

h1 {
  text-align: center;
  padding: 50px 0;
  font-weight: normal;
  font-size: 4em;
  letter-spacing: 10px;
}

li {
  list-style: none;
  float: left;
  
}

.bar {
  height: 1.5px;
  width: 100%;
  background-color: #DCDCDC;
}

.flex-menu {
  display: flex;
  
}

.flex-menu li {
  width: 100%;
}

nav-item{
	color : gray;
}

</style>
<body>
<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-white">
    <div class="container-fluid">
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarCollapse">
        <ul class="navbar-nav me-auto mb-2 mb-md-0">
                <li class="nav-item">
            		<a class="nav-link active" aria-current="page" href="#">Home</a>
          		</li>
          		<li class="nav-item">
           			 <a class="nav-link" href="#">Link</a>
          		</li>
        </ul>
        <form class="d-flex" role="search">
          <input class="form-control me-2" type="search" placeholder="검색.." aria-label="Search">
          <button class="btn btn-outline-success" type="submit">Search</button>
        </form>
      </div>
    </div>
  </nav>

<!-- 메뉴 -->
<div class="pagemid">
  <div class="wrapper2">
   <I><h1><a href="#">ChokPaler</a></h1></I>
    <ul class="flex-menu">
      <li>&nbsp;</li>
      <li><a href="#">BEST</a></li>
      <li><a href="#">COOKIE</a></li>
      <li><a href="#">COFFEE</a></li>
      <li><a href="#">GOODS</a></li>
      <li><a href="#">EVENT</a></li>  
    </ul>
  </div>
</div>


</body>
</html>