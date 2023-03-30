<%--
  Created by IntelliJ IDEA.
  User: 17251
  Date: 2023/3/25
  Time: 15:35
  To change this template use File | Settings | File Templates.
<%--&ndash;%&gt;--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>week3_task2</title>--%>
<%--</head>--%>
<%--<body>--%>
<%@include file="header.jsp"%>
<form action="/jdbc" method="post">
<input type="text" name="username">
<input type="text" name="password">
<input type="text" name="email">
<input type="text" name="BirthDay">
<input type="submit" value="Register">
</form>
<%@include file="footer.jsp"%>
<%--</body>--%>
<%--</html>--%>
