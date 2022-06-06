
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
<link rel="stylesheet" href="style.css">

<h3 align="center" style="font-size:30px; color:green;">Login Page</h3>
<p style="font-size:20px; margin: 10px; color:white;">Введите пожалуйста логин и пароль</p><br>
<p style="color: red;">${errorString}</p>

<form method="POST" action="${pageContext.request.contextPath}/login">
    <input type="hidden" name="redirectId" value="${param.redirectId}" />
    <table>
        <tr>
            <td>User Name</td>
            <td><input type="text" name="userName" value= "${user.userName}"/> </td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="password" value= "${user.password}" /> </td>
        </tr>

        <tr>
            <td colspan ="2">
                <input type="submit" value= "Submit" />
                <a href="${pageContext.request.contextPath}/">Cancel</a>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
