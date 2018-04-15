<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css"/ >

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="${pageContext.request.contextPath}/loginentry">

<table class="formtable">

<tr><td class="labe">Name: </td><td><input class="control" name= "E_name" type="text"></td></tr>
<tr><td class="labe">Password: </td><td><input class="control" name= "E_password" type="password"/></td></tr>
<tr><td class="labe">Type: </td><td><input class="control" name="E_type" rows="10" cols="10"/></td></tr>
<tr><td class="labe"></td><td><input class="control" value= "Enter" type="submit"/></td></tr>
</table>

</form>

</body>
</html>