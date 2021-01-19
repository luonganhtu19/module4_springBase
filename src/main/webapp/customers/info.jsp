<%--
  Created by IntelliJ IDEA.
  User: luong
  Date: 1/19/2021
  Time: 8:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Information</title>
</head>
<body>
<a href="/customers"> Back List customer</a>
<table>
<tr>
    <td>Name:
        <input type="text" value="${customer.name}" disabled>
    </td>
    <td>Email:
        <input type="text" value="${customer.email}" disabled>
    </td>
    <td>Address:
        <input type="text" value="${customer.address}" disabled>
    </td>
</tr>
</table>
</body>
</html>
