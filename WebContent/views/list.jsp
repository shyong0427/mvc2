<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>취미 결과</title>
</head>
<body>
	* 선택 결과 *<br>
	<c:forEach var="h" items="${data }">
		${h }<br>
	</c:forEach>


</body>
</html>