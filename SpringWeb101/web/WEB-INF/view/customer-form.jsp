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
        <br><br>
        Last name*: <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error"/>
        <input type="submit" value="Submit"/>
    </form:form>

</body>
</html>