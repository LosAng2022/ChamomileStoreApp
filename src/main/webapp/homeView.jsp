
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
    <title>Home Page</title>
</head>
<body>
<link rel="stylesheet" href="style.css">

<jsp:include page="_menu.jsp"></jsp:include>

<b><br></b>

<h1 align="center" style="font-size:70px; margin: 20px; color:orange;"><sub style="font-size:20px; color:white;">
  Интернет-Магазин</sub>Ромашка<sub style="font-size:20px; color:white;">Интернет-Магазин</sub></h1>
<p align="center" style="font-size:30px; color:green;">Вкусные и натуральные продукты со всей России!<b></b></p>
<p style="font-size:20px; margin: 30px; color:white;"><i>Представляем каталог товаров!</i></p>
<p style="font-size:20px; margin: 30px; color:white;"><b>Выбирайте на здоровье!</b></p>

<ul>
  <li><p><a href="/searchDairy.jsp" style="font-size:25px; color:orange;">Молочные продукты</a></p></li>
  <li><p><a href="/searchBakery.jsp" style="font-size:25px; color:orange;">Хлеб - всему голова</a></p></li>
  <li><p><a href="/searchBee.jsp" style="font-size:25px; color:orange;">Мёд от прямого поставщика - ПЧЁЛ</a></p></li>
  <li><p><a href="/searchCereal.jsp" style="font-size:25px; color:orange;">Крупы - для вкусной каши</a>  </p></li>

</ul>


<div>
  <br>
  <p><a style="font-size:25px; margin: 40px; color:white;" href="/сontact.jsp">Контактная информация</a></p>
</div>

<div>
  <br>
  <p><a style="font-size:25px; margin: 40px; color:white;" href="/сontact.jsp">Доставка</a></p>
</div>
</body>
</html>
