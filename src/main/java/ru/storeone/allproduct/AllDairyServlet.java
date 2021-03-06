package ru.storeone.allproduct;

import ru.storeone.product.dairy.Dairy;
import ru.storeone.service.ProductService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static ru.storeone.constant.Param.*;

@WebServlet(urlPatterns = {"/dairyinfo"})
public class AllDairyServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;


    ProductService productService;
    public static final String TABLE_BEGIN = "<table style=\"style.css\">\n" +
            "  <tr>\n" +
            "    <th>Product name</th>\n" +
            "    <th>Fat content of the product</th> \n" +
            "    <th>Product volume</th>\n" +
            "    <th>Product manufacturer</th>\n" +
            "    <th>Country of origin</th>\n" +
            "    <th>Product price</th>\n" +
            "    <th>Choice</th>\n" +
            "  </tr>";
    public static final String TABLE_END = "</table>";

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.getWriter().append(HTML_BODY_BEGIN);
        response.getWriter().append(VIEW_PRODUCTS_P);
        response.getWriter().append(TABLE_BEGIN);

        for (int i = 0; i < ProductService.allDP().size(); i++) {
            Dairy dP = ProductService.allDP().get(i);

            response.getWriter().append("<tr>\n" +
                    "    <td>" + dP.getName() + "</td>\n" +
                    "    <td>" + dP.getFatContent() + "</td> \n" +
                    "    <td>" + dP.getVolume() + "</td>\n" +
                    "    <td>" + dP.getManufacturer() + "</td>\n" +
                    "    <td>" + dP.getCountryOfOrigin() + "</td>\n" +
                    "    <td>" + dP.getPrice() + "</td>\n" +
                    "    <td>" + "<p><a style=color:green href=\"./addToBasketDairy?name=" + dP.getName() + "\">Add to basket</a></p>" +
                    "</td>\n" +
                    " </tr>");
        }
        response.getWriter().append(TABLE_END);

        response.getWriter().append(DAIRY_JSP_SEARCH_PAGE_A_P);
        response.getWriter().append(RETURN_BACK_A_P);
        response.getWriter().append(WELCOME_PAGE);
        response.getWriter().append(HTML_BODY_END);
    }

}
