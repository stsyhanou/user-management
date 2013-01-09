<%--
  Created by IntelliJ IDEA.
  User: stsyhanou
  Date: 22.12.12
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add User</title>
    <script type="text/javascript">
        function submitRecords(btnName) {

            if (!validateRecords()) {
                return;
            }
            document.getElementById("action").value = 'save';
            document.forms["user"].submit();
        }
        function validateRecords() {
            var errorMessages = 0;
            var nameElement = document.getElementById("firstName");
            if (nameElement.value == '') {
                nameElement.style.backgroundColor = '#FF0000';
                errorMessages ++;
            }else {
                nameElement.style.backgroundColor = '#FFFFFF';
            }

            var lastNameElement = document.getElementById("lastName");
            if (lastNameElement.value == '') {
                lastNameElement.style.backgroundColor = '#FF0000';
                errorMessages ++;
            }else {
                lastNameElement.style.backgroundColor = '#FFFFFF';
            }

            var mailElement = document.getElementById("mail");
            if (mailElement.value == '') {
                mailElement.style.backgroundColor = '#FF0000';
                errorMessages ++;
            }else {
                mailElement.style.backgroundColor = '#FFFFFF';
            }

            var cityElement = document.getElementById("city");
            if (cityElement.value == '') {
                cityElement.style.backgroundColor = '#FF0000';
                errorMessages ++;
            }else {
                cityElement.style.backgroundColor = '#FFFFFF';
            }

            var stateElement = document.getElementById("state");
            if (stateElement.value == '') {
                stateElement.style.backgroundColor = '#FF0000';
                errorMessages ++;
            }else {
                stateElement.style.backgroundColor = '#FFFFFF';
            }

            var streetElement = document.getElementById("street");
            if (streetElement.value == '') {
                streetElement.style.backgroundColor = '#FF0000';
                errorMessages ++;
            }else {
                streetElement.style.backgroundColor = '#FFFFFF';
            }

            var phoneElement = document.getElementById("phone");
            if (phoneElement.value == '') {
                phoneElement.style.backgroundColor = '#FF0000';
                errorMessages ++;
            }else {
                phoneElement.style.backgroundColor = '#FFFFFF';
            }
            return errorMessages == 0;
        }
    </script>
</head>
<body>
<form:form id="user" commandName="user" >
    <table>
        <tr>
            <td>First name:</td>
            <td><form:input path="firstName" /></td>
        <tr>
            <td>Last name:</td>
            <td><form:input path="lastName" /></td>
        </tr>
        <tr>
            <td>E-mail:</td>
            <td><form:input path="mail" /></td>
        </tr>
        <tr>
            <td>City:</td>
            <td><form:input path="city" /></td>
        </tr>
        <tr>
            <td>State:</td>
            <td><form:input path="state" /></td>
        </tr>
        <tr>
            <td>Street:</td>
            <td><form:input path="street" /></td>
        </tr>
        <tr>
            <td>Phone:</td>
            <td><form:input path="phone" /></td>
        </tr>
    </table>
    <input type="hidden" id="action" name="action" value="back"/>
    <button type="button"  onclick="submitRecords('save');">save</button>
    <button type="submit">back</button>
</form:form>
</body>
</html>