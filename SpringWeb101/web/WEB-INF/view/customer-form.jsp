<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Customer</title>
    <style>
        .error {color: red}
    </style>
</head>
<body>
    User data: <br><br>
    <form:form action="processForm" modelAttribute="customer">
        First name: <form:input path="firstName"/>
        <form:errors path="firstName" cssClass="error"/>
        <br><br>
        Last name*: <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error"/>
        <br><br>
        Free passes: <form:input path="freePasses"/>
        <form:errors path="freePasses" cssClass="error"/>
        <br><br>
        <td><button type="submit">Submit</button></td>
    </form:form>
</body>
</html>