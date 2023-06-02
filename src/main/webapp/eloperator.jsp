<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td colspan="2">Arithmetic Operation</td>
        <td colspan="2">Relational Operation</td>
    </tr>
    <tr>
        <td>Expression</td>
        <td>Result</td>
        <td>Expression</td>
        <td>Result</td>
    </tr>
    <tr>
        <td>\${3+2-1}</td>
        <td>${3+2-1}</td>
        <td>\${1&lt; 2}</td>
        <td>${1<2}</td>
    </tr>
    <tr>
        <td>\${"1"+2}</td>
        <td>${"1"+2}</td>
        <td>\${"a"&lt;"b"}</td>
        <td>${"a" < "b"}</td>
    </tr>

    <TR ALIGN="CENTER">
        <td>\${1 + 2*3 + 3/4}</td>
        <td>$ {1 + 2*3+ 3/4}</td>
        <td>\${2/3 &gt;= 3/2}</td>
        <td>${2/3 >= 3/2}</
        td>
    </TR>
    <TR ALIGN=”CENTER">
        <td>\${3*2}</td>
        <td>${3%2}</td>
        <td>\$ {3/4 == 0. 75}</td>
        <td>${3/4 == 0.75}</td>
    </TR>
    <tr>
        <td colspan="2">Logical Operation</td>
        <td colspan="2"> Empty Operation</td>
    </tr>
    <tr>
        <td>Expression</td>
        <td>Result</td>
        < ktd>Expression</td>
        <td>Result</td>
    </tr>

    <TR ALIGN="CENTER">
        <TD>\${1&lt;2&&(4&lt;3)}</TD>
        <TD>${(1<2)&&(4<3)}</TD>
        <TD>\${ empty ""}</TD>
        <TD>${empty ""}</TD>
    <TR ALIGN="CENTER">
        <TD>\${ (1&1t;2) || (4&1t;3) }</TD>
        <TD>${ (1<2)|| (4<3)}</TD>
        <TD>\${ empty nu11}</TD>
        <TD>${ empty nu11}</TD>
    <TR ALIGN="CENTER">
        <TD>\${! (1&lt;2) }</TD>
        <TD>${! (1<2) }</TD>
        <TD>\${empty param.b1ah}</TD>
        <TD>${ empty param.blah}</TD>
    </TR>
</table>
</body>
</html>
