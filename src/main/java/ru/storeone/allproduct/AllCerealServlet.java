package ru.storeone.allproduct;

import ru.storeone.product.cereal.Cereal;
import ru.storeone.service.ProductService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static ru.storeone.constant.Param.*;

@WebServlet(urlPatterns = {"/cerealinfo"})
public class AllCerealServlet extends HttpServlet {

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
        for (int i=0; i < ProductService.allCereal().size(); i++) {
            Cereal cR = ProductService.allCereal().get(i);
            request.setCharacterEncoding("UTF-8");
            response.getWriter().append("<tr>\n" +
                    "    <td>" + cR.getName() + "</td>\n" +
                    "    <td>" + cR.getCaloricContent() + "</td> \n" +
                    "    <td>" + cR.getWeight() + "</td>\n" +
                    "    <td>" + cR.getManufacturer() + "</td>\n" +
                    "    <td>" + cR.getCountryOfOrigin() + "</td>\n" +
                    "    <td>" + cR.getPrice() + "</td>\n" +
                    "    <td>" + ADD_TO_BASKET_A_P + "</td>\n" +
                    " </tr>");
        }
        response.getWriter().append(TABLE_END);
        response.getWriter().append(CEREAL_JSP_SEARCH_PAGE_A_P);
        response.getWriter().append(RETURN_BACK_A_P);
        response.getWriter().append(HTML_BODY_END);
    }

}
