<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Register</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        First name: <form:input path="firstName"/><br>
        Last name: <form:input path="lastName"/>
        <br><br>
        
        Country: 
        
        <form:select path="country">
            <form:option value="Brazil" label="Brazil" />
            <form:option value="France" label="France" />
            <form:option value="Germany" label="Germany" />
            <form:option value="Japan" label="Japan" />
            <form:option value="India" label="India" />
        </form:select>
        <input type="submit" value="Submit"/>
    </form:form>
</body>
</html>