package ru.storeone.search;


import ru.storeone.product.cereal.Cereal;
import ru.storeone.service.ProductService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serial;
import java.util.Objects;

import static ru.storeone.constant.Param.*;
@WebServlet(urlPatterns = {"/searchcereal"})
public class SearchCerealServlet extends HttpServlet {

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        ProductService.allCereal();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String productName = request.getParameter(NAME);
        String productManufacturer = request.getParameter(MANUFACTURER);
        String productCountryOfOrigin = request.getParameter(COUNTRY_OF_ORIGIN);
        String productCaloricContent = request.getParameter(CALORIC_CONTENT);
        String productWeight = request.getParameter(WEIGHT);
        String productPrice = request.getParameter(PRICE);

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=windows-1251");

        for (int i = 0; i < ProductService.allCereal().size(); i++) {
            Cereal foundCereal = ProductService.allCereal().get(i);

            response.getWriter().append(HTML_BODY_BEGIN);

            if (Objects.equals(productName, foundCereal.getName())) {

                response.getWriter().append(TABLE_BEGIN +
                        "  <tr>\n" +
                        "    <td>" + foundCereal.getName() + "</td>\n" +
                        "    <td>" + foundCereal.getCaloricContent() + "</td>\n" +
                        "    <td>" + foundCereal.getWeight() + "</td>\n" +
                        "    <td>" + foundCereal.getManufacturer() + "</td>\n" +
                        "    <td>" + foundCereal.getCountryOfOrigin() + "</td>\n" +
                        "    <td>" + foundCereal.getPrice() + "</td>\n" +
                        "    <td>" + ADD_TO_BASKET_A_P + "</td>\n" +
                        "  </tr>\n" +
                        "</table>");

            }
            if (Objects.equals(productManufacturer, foundCereal.getManufacturer())) {

                response.getWriter().append(TABLE_BEGIN +
                        "  <tr>\n" +
                        "    <td>" + foundCereal.getName() + "</td>\n" +
                        "    <td>" + foundCereal.getCaloricContent() + "</td>\n" +
                        "    <td>" + foundCereal.getWeight() + "</td>\n" +
                        "    <td>" + foundCereal.getManufacturer() + "</td>\n" +
                        "    <td>" + foundCereal.getCountryOfOrigin() + "</td>\n" +
                        "    <td>" + foundCereal.getPrice() + "</td>\n" +
                        "    <td>" + ADD_TO_BASKET_A_P + "</td>\n" +
                        "  </tr>\n" +
                        "</table>");
            }
            if (Objects.equals(productCountryOfOrigin, foundCereal.getCountryOfOrigin())) {

                response.getWriter().append(TABLE_BEGIN +
                        "  <tr>\n" +
                        "    <td>" + foundCereal.getName() + "</td>\n" +
                        "    <td>" + foundCereal.getCaloricContent() + "</td>\n" +
                        "    <td>" + foundCereal.getWeight() + "</td>\n" +
                        "    <td>" + foundCereal.getManufacturer() + "</td>\n" +
                        "    <td>" + foundCereal.getCountryOfOrigin() + "</td>\n" +
                        "    <td>" + foundCereal.getPrice() + "</td>\n" +
                        "    <td>" + ADD_TO_BASKET_A_P + "</td>\n" +
                        "  </tr>\n" +
                        "</table>");
            }
            double cC = foundCereal.getCaloricContent();
            String calorie = Double.toString(cC);
            if (Objects.equals(productCaloricContent, calorie)) {
                response.getWriter().append(TABLE_BEGIN +
                        "  <tr>\n" +
                        "    <td>" + foundCereal.getName() + "</td>\n" +
                        "    <td>" + foundCereal.getCaloricContent() + "</td>\n" +
                        "    <td>" + foundCereal.getWeight() + "</td>\n" +
                        "    <td>" + foundCereal.getManufacturer() + "</td>\n" +
                        "    <td>" + foundCereal.getCountryOfOrigin() + "</td>\n" +
                        "    <td>" + foundCereal.getPrice() + "</td>\n" +
                        "    <td>" + ADD_TO_BASKET_A_P + "</td>\n" +
                        "  </tr>\n" +
                        "</table>");

            }
            double wG = foundCereal.getWeight();
            String weight = Double.toString(wG);
            if (Objects.equals(productWeight, weight)) {
                response.getWriter().append(TABLE_BEGIN +
                        "  <tr>\n" +
                        "    <td>" + foundCereal.getName() + "</td>\n" +
                        "    <td>" + foundCereal.getCaloricContent() + "</td>\n" +
                        "    <td>" + foundCereal.getWeight() + "</td>\n" +
                        "    <td>" + foundCereal.getManufacturer() + "</td>\n" +
                        "    <td>" + foundCereal.getCountryOfOrigin() + "</td>\n" +
                        "    <td>" + foundCereal.getPrice() + "</td>\n" +
                        "    <td>" + ADD_TO_BASKET_A_P + "</td>\n" +
                        "  </tr>\n" +
                        "</table>");

            }
            double pR = foundCereal.getPrice();
            String price = Double.toString(pR);
            if (Objects.equals(productPrice, price)) {
                response.getWriter().append(TABLE_BEGIN +
                        "  <tr>\n" +
                        "    <td>" + foundCereal.getName() + "</td>\n" +
                        "    <td>" + foundCereal.getCaloricContent() + "</td>\n" +
                        "    <td>" + foundCereal.getWeight() + "</td>\n" +
                        "    <td>" + foundCereal.getManufacturer() + "</td>\n" +
                        "    <td>" + foundCereal.getCountryOfOrigin() + "</td>\n" +
                        "    <td>" + foundCereal.getPrice() + "</td>\n" +
                        "    <td>" + ADD_TO_BASKET_A_P + "</td>\n" +
                        "  </tr>\n" +
                        "</table>");

            }

            response.getWriter().append(HTML_BODY_END);

        }

        response.getWriter().append(CEREAL_JSP_SEARCH_PAGE_A_P);
        response.getWriter().append(RETURN_BACK_A_P);

    }

}
