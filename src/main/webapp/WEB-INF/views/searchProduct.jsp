<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CCD Search Product</title>
</head>
<body>
<form action="">
	Search Product: 
	<input type="text" name="name" value="${name}"/>
	<input type="submit" value="Buscar">
</form>

<c:forEach items="${products}" var="product">
	${product.id} - ${product.name}
</c:forEach>

</body>
</html>