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
        function validate(param){
            var element = document.getElementById(param);
            var err = 0;
            if (element.value == '') {
                element.style.borderColor = '#FF0000';
                err ++;
            }else {
                element.style.borderColor = '#00FF00';
            }
            return err;
        }
        function validateNumber(param){
            var element = document.getElementById(param);
            var err = 0;
            if (/[^[0-9]/.test(element.value) || element.value == '') {
                element.style.borderColor = '#FF0000';
                err ++;
            }else {
                element.style.borderColor = '#00FF00';
            }
            return err;
        }
        function validateRecords() {
            var errorMessages = 0;
            errorMessages += validate("firstName");
            errorMessages += validate("lastName");
            errorMessages += validate("email");
            errorMessages += validate("city");
            errorMessages += validate("state");
            errorMessages += validate("street");
            errorMessages += validateNumber("phone");
            errorMessages += validate("password");
            return errorMessages == 0;
        }
        function back(param){
            document.location.href = param;
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
            <td><form:input path="email" /></td>
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
        <tr>
            <td>Password:</td>
            <td><form:password showPassword="false" path="password" /></td>
        </tr>
    </table>
    <input type="hidden" id="action" name="action" value="back"/>
    <button type="button"  onclick="submitRecords('save');">save</button>
    <input type="button" value="back" onclick="back('/users')">
</form:form>
</body>
</html>