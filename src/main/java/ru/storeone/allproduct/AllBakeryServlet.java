package ru.storeone.allproduct;
import ru.storeone.product.bakery.Bakery;
import ru.storeone.service.ProductService;

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
    public static final String TABLE_BEGIN = "<table style=\"border: 1px solid white; border-collapse: collapse;\">\n" +
            "  <tr>\n" +
            "    <th>Product name</th>\n" +
            "    <th>Fat content of the product</th> \n" +
            "    <th>Product weight</th>\n" +
            "    <th>Product manufacturer</th>\n" +
            "    <th>Country of origin</th>\n" +
            "    <th>Product price</th>\n" +
            "  </tr>";
    public static final String TABLE_END = "</table>";
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        for (int i=0; i < ProductService.allBakery().size(); i++) {
            Bakery bK = ProductService.allBakery().get(i);

            request.setAttribute("Name", bK.getName());
            request.setAttribute("CaloricContent", bK.getCaloricContent());
            request.setAttribute("Weight", bK.getWeight());
            request.setAttribute("Manufacturer", bK.getManufacturer());
            request.setAttribute("name", bK.getName());
            request.setAttribute("name", bK.getName());

    }}}


        /*response.getWriter().append(HTML_BODY_BEGIN);
        response.getWriter().append(VIEW_PRODUCTS_P);
        response.getWriter().append(TABLE_BEGIN);

        for (int i=0; i < ProductService.allBakery().size(); i++) {
            Bakery bK = ProductService.allBakery().get(i);

            response.getWriter().append("<tr>\n" +
                    "    <td>" + bK.getName() + "</td>\n" +
                    "    <td>" + bK.getCaloricContent() + "</td> \n" +
                    "    <td>" + bK.getWeight() + "</td>\n" +
                    "    <td>" + bK.getManufacturer() + "</td>\n" +
                    "    <td>" + bK.getCountryOfOrigin() + "</td>\n" +
                    "    <td>" + bK.getPrice() + "</td>\n" +
                    "    <td>" + ADD_TO_BASKET_A_P + "</td>\n" +
                    " </tr>");
        }
        response.getWriter().append(TABLE_END);

        response.getWriter().append(HTML_BODY_END);

        response.getWriter().append(BAKERY_JSP_SEARCH_PAGE_A_P);
        response.getWriter().append(RETURN_BACK_A_P);
    }


}
*/