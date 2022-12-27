<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav>
<a href="index.html">Home</a>
<a href="addBook.html">Add Book</a>
<a href="showBooks.html">List Of books</a>
</nav>

<h3>Books List</h3>

<ul>
<c:forEach items="${model.bookList}" var="book">
<li><c:out value="${book}"></c:out></li>
</c:forEach>
</ul>
</body>
</html>

<!-- for(model book : bookList){
syso(book) -->

