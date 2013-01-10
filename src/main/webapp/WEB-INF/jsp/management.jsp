<%--
  Created by IntelliJ IDEA.
  User: Tsyhanou Siarhei
  Date: 05.01.13
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Management</title></head>
<body>
<table border="2" align="center" width="100%">
    <tr>
        <td>User Name</td>
        <td>Token Type</td>
        <td>Token Value</td>
        <td>Creation Time</td>
        <td>Expire Time</td>
    </tr>
    <c:forEach items="${tokens}" var="record">
        <tr>
            <td rowspan="2"><c:out value="${record.name}"/></td>
            <c:forEach items="${record.tokens}" var="data">
                <td><c:out value="${data.token}"/></td>
                <td><c:out value="${data.value}"/></td>
                <td><c:out value="${data.creationTime}"/></td>
                <td><c:out value="${data.expireTime}"/></td>
                </tr>
            </c:forEach>

    </c:forEach>
</table>
</body>
</html>