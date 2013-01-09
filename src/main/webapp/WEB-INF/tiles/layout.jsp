<%--
  Created by IntelliJ IDEA.
  User: Tsyhanou Siarhei
  Date: 09.01.13
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title></title>
</head>

<body>
<h1 align="center"><tiles:insertAttribute name="head" /></h1>
<table cellpadding="2" cellspacing="2" width="100%">
    <tr>
        <td valign="top" width="20%" style="background-color: #d3d3d3">
            <tiles:insertAttribute name="menu"/>
        </td>
        <td width="80%">
            <tiles:insertAttribute name="body"/>
        </td>
    </tr>
</table>
</body>

</html>