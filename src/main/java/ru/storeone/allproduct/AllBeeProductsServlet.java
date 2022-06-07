package ru.storeone.allproduct;

import ru.storeone.product.beeproducts.BeeProducts;
import ru.storeone.service.ProductService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static ru.storeone.constant.Param.*;

@WebServlet(urlPatterns = {"/beeinfo"})
public class AllBeeProductsServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    ProductService productService;
    public static final String TABLE_BEGIN = "<table style=\"style.css\">\n" +
            "  <tr>\n" +
            "    <th>Product name</th>\n" +
            "    <th>Fat content of the product</th> \n" +
            "    <th>Product weight</th>\n" +
            "    <th>Product manufacturer</th>\n" +
            "    <th>Country of origin</th>\n" +
            "    <th>Product price</th>\n" +
            "    <th>Choice</th>\n" +
            "  </tr>";
    public static final String TABLE_END = "</table>";

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().append(HTML_BODY_BEGIN);
        response.getWriter().append(VIEW_PRODUCTS_P);
        response.getWriter().append(TABLE_BEGIN);
        for (int i=0; i < ProductService.allBeeP().size(); i++) {
            BeeProducts bP = ProductService.allBeeP().get(i);
            request.setCharacterEncoding("UTF-8");
            response.getWriter().append("<tr>\n" +
                    "    <td>" + bP.getName() + "</td>\n" +
                    "    <td>" + bP.getCaloricContent() + "</td> \n" +
                    "    <td>" + bP.getWeight() + "</td>\n" +
                    "    <td>" + bP.getManufacturer() + "</td>\n" +
                    "    <td>" + bP.getCountryOfOrigin() + "</td>\n" +
                    "    <td>" + bP.getPrice() + "</td>\n" +
                    "    <td>" + "<p><a style=color:green href=\"./addToBasketBee?name=" + bP.getName() + "\">Add to basket</a></p>" +
                    "</td>\n" +
                    " </tr>");
        }
        response.getWriter().append(TABLE_END);

        response.getWriter().append(BEE_JSP_SEARCH_PAGE_A_P);
        response.getWriter().append(RETURN_BACK_A_P);
        response.getWriter().append(WELCOME_PAGE);
        response.getWriter().append(HTML_BODY_END);


    }

}
