<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <meta charset="UTF-8">
  <title>Menu</title>
</head>
<body>
<link rel="stylesheet" href="style.css">

<a style="font-size:15px; margin: 10px; color:green;" href="./customer">ЛК Покупатель</a>
<a style="font-size:15px; color:green;">||</a>
<a style="font-size:15px; margin: 10px; color:green;" href="./managerTask">ЛК Менеджер</a>
<a style="font-size:15px; color:green;">||</a>
<a style="font-size:15px; margin: 10px; color:green;" href="./userInfo">Сессия</a>
<a style="font-size:15px; color:green;">||</a>
<a style="font-size:15px; margin: 10px; color:green;" href="./login">Авторизация</a>
<a style="font-size:15px; color:green;">||</a>
<a style="font-size:15px; margin: 10px; color:green;" href="./logout">Выход</a>

<a style="font-size:15px; margin: 10px; color:green;" href="./viewBasket">Корзина</a>
&nbsp;
<span style="color:red">[ ${loginedUser.userName} ]</span>

</body>
</html>




