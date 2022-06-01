<%@ page import="ru.storeone.service.ProductService" %>
<%@ page import="ru.storeone.product.bakery.Bakery" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>

<head>
    <title>Выпечка</title>
<body>
<style>
    table, th, td {
        border:1px solid black;
    }
</style>

<table style="width:100%">
    <tr>
<%
    for (int i=0; i < ProductService.allBakery().size(); i++) {
        Bakery bK = ProductService.allBakery().get(i);
        out.print("<tr>\n" +
                "<td>" + bK.getName() + "</td>\n" +
                "<td>" + bK.getCaloricContent() + "</td>\n" +
                "<td>" + bK.getWeight() + "</td>\n" +
                "<td>" + bK.getManufacturer() + "</td>\n" +
                "<td>" + bK.getCountryOfOrigin() + "</td>\n" +
                "<td>" + bK.getPrice() + "</td>\n" +
                "<td>" + "ADD_TO_BASKET_A_P" + "</td>");
    }
%>
    </tr>
</table>
</body>
</html>
