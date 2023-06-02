<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 5/15/2021
  Time: 11:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<h2>Welcome,
    <%-- todo 4.2.1 use c:out to print username from parammeter --%>
    <c:out value="${username}"/>

    <form>
        <br> <input type="submit" value="Logout" name="logout"/>
    </form>
    <c:if test="${ ! empty param.logout and param.logout eq 'Logout'}">
        ${pageContext.session.invalidate()}
        <c:redirect url="login.jsp"/>
    </c:if>
</h2>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <h1>Session info</h1>
    Session ID :${pageContext.session.id}      <br>
    Creation Time:<fmt:formatDate type="both" dateStyle="long" timeStyle="long" value="<%=new Date(session.getCreationTime())%>"/>
<%--    Creation Time:${pageContext.session.creationTime}<br>--%><br>
    Last Accessed Time:<fmt:formatDate dateStyle="long" type="both" timeStyle="long" value="<%=new Date(session.getLastAccessedTime())%>"/>
<%--${pageContext.session.lastAccessedTime}<br>--%><br>
    Max Inactive Interval:${pageContext.session.maxInactiveInterval/60}(min)  <br>
<%--${pageContext.session.maxInactiveInterval}<br>--%>

</body>
</html>
