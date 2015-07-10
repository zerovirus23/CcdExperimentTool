<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Define Date to Receive a Product</title>
</head>
<body>
<form action="">
	Define days are building a product: 
	<input type="text" name="product" value="1"/>
	<input type="submit" value="Calcular">
</form>


<c:if test="${empty dateReceive}">
Date to Receive a Product: <br/>
${dateReceive}
</c:if>

</body>
</html>