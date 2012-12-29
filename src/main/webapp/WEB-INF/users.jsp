<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
  Created by IntelliJ IDEA.
  User: stsyhanou
  Date: 22.12.12
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
</head>
<body>
<div align="center"><h1>Users</h1></div>
<sec:authorize access="hasRole('ROLE_SUPERVISOR')">
<table border="2" align="center" width="100%">
    <tr>
        <td>First name</td>
        <td>Last name</td>
        <td>E-mail</td>
        <td>City</td>
        <td>State</td>
        <td>Street</td>
        <td>Phone</td>
    </tr>
    <tr><!--data here--></tr>
</table>
</sec:authorize>

<a href="<c:url value="/j_spring_security_logout" />" > Logout</a>

</body>
</html>