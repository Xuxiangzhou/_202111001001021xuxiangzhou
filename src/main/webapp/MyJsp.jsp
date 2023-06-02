<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 02-03-2022
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
āā
<body>
<a href="">Click here </a><!-- what  is method ?  GET-->
<form method="get" action="MyDearJsp.jsp"><!-- u need to write -->
    name:<input type="text" name="name"/><br/>
    Id: <input type="text" name="id"/><br/>
    Subject:
    <input type="checkbox" name="subject" value="C">C
    <input type="checkbox" name="subject" value="C++">C++
    <input type="checkbox" name="subject" value="java">java<br>
    <input type="submit" value="Submit"><!-- what  is method ? GET Why? default is GET
    we need to change to post - now its post
    -->
</form>

</body>
</html>
