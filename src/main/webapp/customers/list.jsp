<%--
  Created by IntelliJ IDEA.
  User: luong
  Date: 1/19/2021
  Time: 6:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="id" value="${0}"/>
<table border="1">
<c:forEach var="customer" items="${customers}">
    <tr>
        <td>
            <c:out value="${id=id+1}"/>
        </td>
        <td>
            <a href="/show/${customer.getId()}">${customer.name}</a>
        </td>
        <td>
            <c:out value="${customer.email}"/>
        </td>
        <td>
            <c:out value="${customer.address}"/>
        </td>
    </tr>
</c:forEach>
</table>
</body>
</html>
