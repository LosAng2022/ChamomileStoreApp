<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
    <title>User Info</title>
</head>

<body>
<link rel="stylesheet" href="style.css">

<h3 style="font-size:30px; margin: 10px; color:white;">Hello: ${loginedUser.userName}</h3>

<p style="font-size:20px; margin: 10px; color:white;">User Name: <b>${loginedUser.userName}</b>
<br/>
<p style="font-size:20px; margin: 10px; color:white;">Gender: ${loginedUser.gender } <br/>

<div>
  <p><a style="font-size:20px; color: white; margin: 50px;" href="/homeView.jsp">Вернуться на главную</a></p>
</div>

</body>
</html>
