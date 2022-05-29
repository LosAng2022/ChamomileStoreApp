<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Выпечка</title>
    <body>
            <link rel="stylesheet" href="style.css">

    <form action="${pageContext.request.contextPath}/searchbakery" method="get"> <br><br>
        <label style="font-size:20px; color: gold; margin: 40px;" for="name" >Введите название продукта для поиска:</label><br>
        <input style="font-size:20px; color: black; margin: 40px; background: cornsilk;" type="text" id="name" name="name"><br>

        <label style="font-size:20px; color:gold; margin: 40px;" for="manufacturer" >Выбор производителя продукта:</label><br>
        <input style="font-size:20px; color:black; margin: 40px; background: cornsilk;" type="text" id="manufacturer" name="manufacturer"><br>

        <label style="font-size: 20px; color: gold; margin: 40px;" for="countryOfOrigin">Страна производитель:</label><br>
        <input style="font-size: 20px; color: black; margin: 40px; background: cornsilk;" type="text" id="countryOfOrigin" name="countryOfOrigin"><br>

        <label style="font-size: 20px; color: gold; margin: 40px;" for="caloricContent">Каллории:</label><br>
        <input style="font-size: 20px; color: black; margin: 40px; background: cornsilk;" type="text" id="caloricContent" name="caloricContent"><br>

        <label style="font-size: 20px; color: gold; margin: 40px;" for="weight">Вес:</label><br>
        <input style="font-size: 20px; color: black; margin: 40px; background: cornsilk;" type="text" id="weight" name="weight"><br>

        <label style="font-size: 20px; color: gold; margin: 40px;" for="price">Цена:</label><br>
        <input style="font-size: 20px; color: black; margin: 40px; background: cornsilk;" type="text" id="price" name="price"><br>

        <input style="font-size:20px; color:black; margin: 40px; background: cornsilk" type="submit" value="Поиск">
    </form>

<div>
    <p><a style="font-size:20px; color: goldenrod; margin: 50px;" href="./bakeryinfo">Просмотр всей выпечки</a></p>
</div>

<div>
    <p><a style="font-size:20px; color: darkblue; margin: 50px;" href="./">Вернуться на главную</a></p>
</div>


</body>
</html>
