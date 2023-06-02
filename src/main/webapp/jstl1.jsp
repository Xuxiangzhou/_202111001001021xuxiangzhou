<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 17251
  Date: 2023/5/25
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My jsp page</title>
</head>
<body>
    This is my JSP page. <br>
<h2>The "if" Tag</h2>
<ul>
  <c:forEach var="i" begin="1" end="10">
    <li>${i}
      <c:if test="${i>7}">
      (greater than 7)
      </c:if>
  </c:forEach>
</ul>
    <h2>The "choose" Tag</h2>
    <ul>
      <c:forEach var="i" begin="1" end="10">
      <li>${i}

        <c:choose>
        <c:when test="${i<4}">
        (small)
        </c:when>
        <c:when test="${i<8}">
        (medium)
        </c:when>
        <c:otherwise>(large)</c:otherwise>
        </c:choose>

        </c:forEach>
    </ul>
</body>
</html>
