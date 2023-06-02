<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 5/20/2023
  Time: 3:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<h1>User Registration</h1>
<form method="post" action="register.jsp"><!--action to link jsp  to servlet -->
    Username <input type="text" name="username"/><br/>
    password <input type="password" name="password"/><br/>
    Email <input type="text" name="email"/><br/>

    Gender <input type="radio" name="gender" value="male">male <input type="radio" name="gender" value="female">Female
    <br/>
    Birth Date <input type="text" name="birthDate"/>(yyyy-mm-dd)<br/>
    <input type="submit" value="Register"/>

</form>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%--建立连接--%>
<sql:setDataSource var="myDS" driver="com.mysql.cj.jdbc.Driver"
                   url="jdbc:mysql://127.0.0.1:3306/user_db"
                   user="root"
                   password="1234"/>
<%--插入--%>
<c:if test="${!empty param.username}">
    <sql:update var="newUser" dataSource="${myDS}">
        insert into usertable values(?,?,?,?,?);
<%--        <sql:param value="${param.ID}"/>--%>
        <sql:param value="${param.UserName}"/>
        <sql:param value="${param.Password}"/>
        <sql:param value="${param.Email}"/>
        <sql:param value="${param.Gender}"/>
        <sql:param value="${param.BirthDate}"/>
        </sql:update>
</c:if>
<sql:query var="selectUsers" dataSource="${myDS}">
    Select * from user
</sql:query>
<table>
    <tr>

    </tr>
    <c:forEach var="row" items="${selectUsers.rows}">
        <tr>

            <td><c:out value="${row.id}"/></td>
            <td><c:out value="${row.UserName}"/></td>
            <td><c:out value="${row.Password}"/></td>
            <td><c:out value="${row.Email}"/></td>
            <td><c:out value="${row.Gender}"/></td>
            <td><c:out value="${row.BirthDate}"/></td>

        </tr>
    </c:forEach>
    <tr>


    </tr>
</table>
</body>
</html>
