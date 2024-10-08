<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@ include file="menue.jsp"%>>
    
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
 
 Id<input type="text" name="id"></br>
 Name<input type="text" name="name"></br>
 College<select name="college">
 <option value="shivamogga">shivamogga</option>
 <option value="bengaluru">bengaluru</option>
 <option value="mysuru">mysuru</optioin>
 </select></br>
 Cource<select name="cource">
 <option value="davanagere">MCA</option>
 <option vlaue="chitradurga">MSC</option>
 <option value="mangaluru">BSC</option>
  <option value="mangaluru">MBA</option>
 </select></br>
 <input type="submit" value="book">   
 </form>
 
 ${msg}

</body>
</html>