package ru.storeone.allproduct;
import ru.storeone.product.bakery.Bakery;
import ru.storeone.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static ru.storeone.constant.Param.*;

@WebServlet(urlPatterns = {"/bakeryinfo"})
public class AllBakeryServlet extends HttpServlet {

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
            throws ServletException, IOException {

        response.getWriter().append(HTML_BODY_BEGIN);
        response.getWriter().append(VIEW_PRODUCTS_P);
        response.getWriter().append(TABLE_BEGIN);

        for (int i = 0; i < ProductService.allBakery().size(); i++) {
            Bakery bK = ProductService.allBakery().get(i);

            response.getWriter().append("<tr>\n" +
                    "    <td>" + bK.getName() + "</td>\n" +
                    "    <td>" + bK.getCaloricContent() + "</td> \n" +
                    "    <td>" + bK.getWeight() + "</td>\n" +
                    "    <td>" + bK.getManufacturer() + "</td>\n" +
                    "    <td>" + bK.getCountryOfOrigin() + "</td>\n" +
                    "    <td>" + bK.getPrice() + "</td>\n" +
                    "    <td>" + "<p ><a style=color:red href=\"./addToBasket?name=" + bK.getName() + "\">Add to basket</a></p>" +
                    "</td>\n" +
                    " </tr>");
        }
        response.getWriter().append(TABLE_END);
        response.getWriter().append(BAKERY_JSP_SEARCH_PAGE_A_P);
        response.getWriter().append(RETURN_BACK_A_P);
        response.getWriter().append(HTML_BODY_END);

    }

}
