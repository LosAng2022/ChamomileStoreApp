package ru.storeone.search;

import ru.storeone.product.bakery.Bakery;
import ru.storeone.service.ProductService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serial;
import java.util.Objects;

import static ru.storeone.constant.Param.*;

@WebServlet(urlPatterns = {"/searchbakery"})
public class SearchBakeryServlet extends HttpServlet {

    @Serial
    private static final long serialVersionUID = 1L;
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

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        ProductService.allBakery();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String productName = request.getParameter(NAME);
        String productManufacturer = request.getParameter(MANUFACTURER);
        String productCountryOfOrigin = request.getParameter(COUNTRY_OF_ORIGIN);
        String productCaloricContent = request.getParameter(CALORIC_CONTENT);
        String productWeight = request.getParameter(WEIGHT);
        String productPrice = request.getParameter(PRICE);



        response.getWriter().append(HTML_BODY_BEGIN);
        for (int i = 0; i < ProductService.allBakery().size(); i++) {
            Bakery foundBakery = ProductService.allBakery().get(i);



            if (Objects.equals(productName, foundBakery.getName())) {

                response.getWriter().append(SEARCH_TABLE_STYLE +
                        "<tr>\n"  +
                        "    <td>" + foundBakery.getName() + "</td>\n" +
                        "    <td>" + foundBakery.getCaloricContent() + "</td>\n" +
                        "    <td>" + foundBakery.getWeight() + "</td>\n" +
                        "    <td>" + foundBakery.getManufacturer() + "</td>\n" +
                        "    <td>" + foundBakery.getCountryOfOrigin() + "</td>\n" +
                        "    <td>" + foundBakery.getPrice() + "</td>\n" +
                        "    <td>" + ADD_TO_BASKET_A_P + "</td>\n" +
                        "  </tr>\n" +
                        "</table>");

            }

            if (Objects.equals(productManufacturer, foundBakery.getManufacturer())) {

                response.getWriter().append(SEARCH_TABLE_STYLE +
                        "<tr>\n"  +
                        "    <td>" + foundBakery.getName() + "</td>\n" +
                        "    <td>" + foundBakery.getCaloricContent() + "</td>\n" +
                        "    <td>" + foundBakery.getWeight() + "</td>\n" +
                        "    <td>" + foundBakery.getManufacturer() + "</td>\n" +
                        "    <td>" + foundBakery.getCountryOfOrigin() + "</td>\n" +
                        "    <td>" + foundBakery.getPrice() + "</td>\n" +
                        "    <td>" + ADD_TO_BASKET_A_P + "</td>\n" +
                        "  </tr>\n" +
                        "</table>");
            }
            if (Objects.equals(productCountryOfOrigin, foundBakery.getCountryOfOrigin())) {

                response.getWriter().append(SEARCH_TABLE_STYLE +
                        "<tr>\n"  +
                        "    <td>" + foundBakery.getName() + "</td>\n" +
                        "    <td>" + foundBakery.getCaloricContent() + "</td>\n" +
                        "    <td>" + foundBakery.getWeight() + "</td>\n" +
                        "    <td>" + foundBakery.getManufacturer() + "</td>\n" +
                        "    <td>" + foundBakery.getCountryOfOrigin() + "</td>\n" +
                        "    <td>" + foundBakery.getPrice() + "</td>\n" +
                        "    <td>" + ADD_TO_BASKET_A_P + "</td>\n" +
                        "  </tr>\n" +
                        "</table>");
            }
            double cC = foundBakery.getCaloricContent();
            String calorie = Double.toString(cC);
            if (Objects.equals(productCaloricContent, calorie)) {
                response.getWriter().append(SEARCH_TABLE_STYLE +
                        "<tr>\n"  +
                        "    <td>" + foundBakery.getName() + "</td>\n" +
                        "    <td>" + foundBakery.getCaloricContent() + "</td>\n" +
                        "    <td>" + foundBakery.getWeight() + "</td>\n" +
                        "    <td>" + foundBakery.getManufacturer() + "</td>\n" +
                        "    <td>" + foundBakery.getCountryOfOrigin() + "</td>\n" +
                        "    <td>" + foundBakery.getPrice() + "</td>\n" +
                        "    <td>" + ADD_TO_BASKET_A_P + "</td>\n" +
                        "  </tr>\n" +
                        "</table>");
            }
            double wG = foundBakery.getWeight();
            String weight = Double.toString(wG);
            if (Objects.equals(productWeight, weight)) {
                response.getWriter().append(SEARCH_TABLE_STYLE +
                        "<tr>\n" +
                        "    <td>" + foundBakery.getName() + "</td>\n" +
                        "    <td>" + foundBakery.getCaloricContent() + "</td>\n" +
                        "    <td>" + foundBakery.getWeight() + "</td>\n" +
                        "    <td>" + foundBakery.getManufacturer() + "</td>\n" +
                        "    <td>" + foundBakery.getCountryOfOrigin() + "</td>\n" +
                        "    <td>" + foundBakery.getPrice() + "</td>\n" +
                        "    <td>" + ADD_TO_BASKET_A_P + "</td>\n" +
                        "  </tr>\n" +
                        "</table>");
            }
            double pR = foundBakery.getPrice();
            String price = Double.toString(pR);
            if (Objects.equals(productPrice, price)) {
                response.getWriter().append(SEARCH_TABLE_STYLE +
                        "<tr>\n"  +
                        "    <td>" + foundBakery.getName() + "</td>\n" +
                        "    <td>" + foundBakery.getCaloricContent() + "</td>\n" +
                        "    <td>" + foundBakery.getWeight() + "</td>\n" +
                        "    <td>" + foundBakery.getManufacturer() + "</td>\n" +
                        "    <td>" + foundBakery.getCountryOfOrigin() + "</td>\n" +
                        "    <td>" + foundBakery.getPrice() + "</td>\n" +
                        "    <td>" + ADD_TO_BASKET_A_P + "</td>\n" +
                        "  </tr>\n" +
                        "</table>");
            }

            response.getWriter().append(HTML_BODY_END);

        }

        response.getWriter().append(BAKERY_JSP_SEARCH_PAGE_A_P);
        response.getWriter().append(RETURN_BACK_A_P);

    }

}
