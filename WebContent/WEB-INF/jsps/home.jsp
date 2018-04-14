<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
hi there

Session: <%= session.getAttribute("name") %> <p/>
Request <%= request.getAttribute("name") %> <p/>

Request (using EL): ${name } <p/>


<c:forEach var="row" items="${login}">
    ID: ${row.E_ID}<br/> 
    NAME: ${row.E_name}<br/>
    type: ${row.E_type}<br/>
    password: ${row.E_password}<br/>
</c:forEach>

</body>
</html>