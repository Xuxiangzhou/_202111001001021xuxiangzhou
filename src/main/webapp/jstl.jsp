<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 17251
  Date: 2023/5/19
  Time: 8:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Use c:forEach</h1>
<c:forEach var="i" begin="1" end="5" step="2">
    <ul>
        <li>${i}</li>
    </ul>
</c:forEach>
<%--<c:forEach var="i" begin="1" end="9" step="2">--%>
<%--    <ul>--%>
<%--        <li>${i}</li>--%>
<%--    </ul>--%>
<%--</c:forEach>--%>
<h1>Use c:forEach to get items from an Array</h1>
<%
    String[] firstName = {"Tom", "Bill", "Poll"};
    request.setAttribute("firstName", firstName);
    ArrayList<String> lastName = new ArrayList<>();
    lastName.add("Bing");
    lastName.add("Lee");
    lastName.add("zhang");
    request.setAttribute("lastName", lastName);
//    request.setAttribute("userName","Admin");
%>
<c:set var="userName" value="admin" scope="session"></c:set>

<h1>Welcome,<c:out default="Guest" value="${userName}"></c:out></h1>
<c:forEach var="n" items="${firstName}">
    <ul>
        <li>${n}</li>
    </ul>

</c:forEach>
<c:forEach var="n" items="${lastName}">
    <ul>
        <li>${n}</li>
    </ul>

</c:forEach>
<h1>use c:forToken</h1>
<c:forTokens var="w" items="one,two,three,four.five.six" delims=",.">
    <ul>
        <li>${w}</li>
    </ul>

</c:forTokens>


</body>
</html>
