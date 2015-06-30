<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CCD Load Info</title>
</head>
<body>
<c:if test="${fromPage eq 'suppliers'}">
<form action="loadSuppliers">
	Load Suppliers:
	<input type="text" name="amount" value="${amountSuppliers}"/>
	<input type="submit" value="Load">
</form>
</c:if>

<c:if test="${fromPage eq 'categories'}">
<form action="loadCategories">
	Load Categories: 
	<input type="text" name="amount" value="${amountCategories}"/>
	<input type="submit" value="Load">
</form>
</c:if>

<c:if test="${fromPage eq 'products'}">
<form action="loadProducts">
	Load Products: 
	<input type="text" name="amount" value="${amountProducts}"/>
	<input type="submit" value="Load">
</form>
</c:if>
Items cargados: ${message}
</body>
</html>