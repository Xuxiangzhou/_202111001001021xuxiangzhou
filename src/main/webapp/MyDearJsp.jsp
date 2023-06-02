<%--
  Created by IntelliJ IDEA.
  User: 17251
  Date: 2023/5/9
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Get request parameter using EL</h1>
Name:${param.name}<br>
ID:${param.id}<br>
Subject:${paramValues.subject[0]},${paramValues.subject[1]},${paramValues.subject[2]}
<h1>Get request header using El</h1>
Host: ${header.host}
<h1>Get cookies using El</h1>
JSESSIONID:${cookie.JSESSIONID.value}
<h1>Get context init parameters El</h1>
Driver:${initParam.driver}<br>
Url:${initParam.url}<br>
Username:${initParam.username}<br>
Password:${initParam.password}<br>
<%
    pageContext.setAttribute("attName", "in page");
    request.setAttribute("request", "in request");
    session.setAttribute("session", "in session");
    application.setAttribute("application", "in application");
%>
<h1>Get 4 scope variables--page,request.........</h1>
Att Value in page:${pageScope.attName}<br>
Att Value in request:${pageScope.request}<br>
Att Value in session:${pageScope.session}<br>
Att Value in application:${pageScope.application}<br>
</body>
</html>
