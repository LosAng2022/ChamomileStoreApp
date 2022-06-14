
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product Add</title>
</head>
<body>
<link rel="stylesheet" href="style.css">

<h1 style="font-size:20px; color: white; margin: 20px;">Форма добавления продукта</h1>

<div>
    <form action="${pageContext.request.contextPath}/searchdairy" method="post">
        <label style="font-size:20px; color: gold; margin: 40px;" for="name">Имя продукта:</label><br>
        <input style="font-size:20px; color: black; margin: 40px; background: cornsilk;" type="text" id="name" name="name"><br>

        <label style="font-size:20px; color: gold; margin: 40px;" for="fatContent">Жирность:</label><br>
        <input style="font-size:20px; color: black; margin: 40px; background: cornsilk;" type="text" id="fatContent" name="fatContent"><br>

        <label style="font-size:20px; color: gold; margin: 40px;" for="volume">Объём:</label><br>
        <input style="font-size:20px; color: black; margin: 40px; background: cornsilk;" type="text" id="volume" name="volume"><br>

        <label style="font-size:20px; color: gold; margin: 40px;" for="manufacturer">Производитель:</label><br>
        <input style="font-size:20px; color: black; margin: 40px; background: cornsilk;" type="text" id="manufacturer" name="manufacturer"><br>

        <label style="font-size:20px; color: gold; margin: 40px;" for="countryOfOrigin">Страна происхождения:</label><br>
        <input style="font-size:20px; color: black; margin: 40px; background: cornsilk;" type="text" id="countryOfOrigin" name="countryOfOrigin"><br>

        <label style="font-size:20px; color: gold; margin: 40px;" for="price">Цена:</label><br>
        <input style="font-size:20px; color: black; margin: 40px; background: cornsilk;" type="text" id="price" name="price"><br>

        <br><br>
        <input type="submit" value="Submit">
    </form>
</div>

<div>
    <p><a style="font-size:20px; color: darkblue; margin: 50px;" href="/homeView.jsp">Главная страница</a></p>
</div>

</body>
</html>