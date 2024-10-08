<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    <%@ include file= "menue.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body{
background-color:gold;
text-align:center;
}
table{
text-align:center;
}
</style>
<body>
 
<h1>ALL STUDENTS</h1>
<table border="1" ,style="text-align:center;"  >
<tr>
<th>Id</th>
<th>Name</th>
<th>College</th>
<th>Cource</th>
</tr> 
<c:forEach var="students" items="${student}">
<tr>
<td>${students.id}</td>
<td>${students.name }</td>
<td>${students.college }</td>
<td>${students.cource }</td>
<td><a href="delete?id=${students.id}">delete</a></td>
<td><a href="update?id=${students.id}">update</a></td>
 </tr>
 </c:forEach>
</table>
 

</body>
</html>