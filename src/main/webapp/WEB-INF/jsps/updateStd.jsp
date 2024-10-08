<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ include file="menue.jsp" %>>
    
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
</style>
<body>

 <form action="saveStd" method="post">
 
 <!--  <input type="hidden" name="id" value="${students.id }">-->
 Id<input type="text" name="id" value="${students.id }"></br>
 Name<input type="text" name="name" value="${students.name }"></br>
 College<select name="college" value="${students.college }">
 <option value="shivamogga">shivamogga</option>
 <option value="bengaluru">bengaluru</option>
 <option value="mysuru">mysuru</optioin>
 </select></br>
 Cource<select name="cource" value="${students.cource }">
 <option value="davanagere">MCA</option>
 <option vlaue="chitradurga">MSC</option>
 <option value="mangaluru">BSC</option>
  <option value="mangaluru">MBA</option>
 </select></br>
 <input type="submit" value="update">   
 </form>
 
 ${msg}

</body>
</html>