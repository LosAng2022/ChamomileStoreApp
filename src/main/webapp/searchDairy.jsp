<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Молочные продукты</title>
<body>
<link rel="stylesheet" href="style.css">

<form action="${pageContext.request.contextPath}/searchdairy" method="get"> <br><br>
  <label style="font-size:20px; color: gold; margin: 40px;" for="name" >Введите название продукта для поиска:</label><br>
  <input style="font-size:20px; color: black; margin: 40px; background: cornsilk;" type="text" id="name" name="name"><br>

  <label style="font-size:20px; color: gold; margin: 40px;" for="manufacturer" >Выбор производителя продукта:</label><br>
  <input style="font-size:20px; color:black; margin: 40px; background: cornsilk;" type="text" id="manufacturer" name="manufacturer"><br>

  <label style="font-size: 20px; color: gold; margin: 40px;" for="countryOfOrigin">Страна производитель:</label><br>
  <input style="font-size: 20px; color: black; margin: 40px; background: cornsilk;" type="text" id="countryOfOrigin" name="countryOfOrigin"><br>

  <label style="font-size: 20px; color: gold; margin: 40px;" for="fatContent">Жирность:</label><br>
  <input style="font-size: 20px; color: black; margin: 40px; background: cornsilk;" type="text" id="fatContent" name="fatContent"><br>

  <label style="font-size: 20px; color: gold; margin: 40px;" for="volume">Объём:</label><br>
  <input style="font-size: 20px; color: black; margin: 40px; background: cornsilk;" type="text" id="volume" name="volume"><br>

  <label style="font-size: 20px; color: gold; margin: 40px;" for="price">Цена:</label><br>
  <input style="font-size: 20px; color: black; margin: 40px; background: cornsilk;" type="text" id="price" name="price"><br>

  <input style="font-size:20px; color:black; margin: 40px; background: cornsilk" type="submit" value="Поиск">
</form>

<div>
  <p><a style="font-size:20px; color: goldenrod; margin: 50px;" href="./dairyinfo">Просмотр всех молочных продуктов</a></p>
</div>

<div>
  <p><a style="font-size:20px; color: darkblue; margin: 50px;" href="/homeView.jsp">Главная страница</a></p>
</div>

<div>
  <p><a style="font-size:20px; color: darkblue; margin: 50px;" href="./">Страница приветствия</a></p>
</div>


</body>
</html>