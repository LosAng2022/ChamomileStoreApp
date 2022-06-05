package ru.storeone.search;

import ru.storeone.product.beeproducts.BeeProducts;
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

@WebServlet(urlPatterns = {"/searchbee"})
public class SearchBeeProductsServlet extends HttpServlet {

    @Serial
    private static final long serialVersionUID = 1L;


    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        ProductService.allBeeP();
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

        for (int i = 0; i < ProductService.allBeeP().size(); i++) {
            BeeProducts foundBee = ProductService.allBeeP().get(i);

            response.getWriter().append(HTML_BODY_BEGIN);

            if (Objects.equals(productName, foundBee.getName())) {

                response.getWriter().append(SEARCH_TABLE_STYLE +
                        "  <tr>\n" +
                        "    <td>" + foundBee.getName() + "</td>\n" +
                        "    <td>" + foundBee.getCaloricContent() + "</td>\n" +
                        "    <td>" + foundBee.getWeight() + "</td>\n" +
                        "    <td>" + foundBee.getManufacturer() + "</td>\n" +
                        "    <td>" + foundBee.getCountryOfOrigin() + "</td>\n" +
                        "    <td>" + foundBee.getPrice() + "</td>\n" +
                        "    <td>" + ADD_TO_BASKET_A_P + "</td>\n" +
                        "  </tr>\n" +
                        "</table>");

            }
            if (Objects.equals(productManufacturer, foundBee.getManufacturer())) {

                response.getWriter().append(SEARCH_TABLE_STYLE +
                        "  <tr>\n" +
                        "    <td>" + foundBee.getName() + "</td>\n" +
                        "    <td>" + foundBee.getCaloricContent() + "</td>\n" +
                        "    <td>" + foundBee.getWeight() + "</td>\n" +
                        "    <td>" + foundBee.getManufacturer() + "</td>\n" +
                        "    <td>" + foundBee.getCountryOfOrigin() + "</td>\n" +
                        "    <td>" + foundBee.getPrice() + "</td>\n" +
                        "    <td>" + ADD_TO_BASKET_A_P + "</td>\n" +
                        "  </tr>\n" +
                        "</table>");
            }
            if (Objects.equals(productCountryOfOrigin, foundBee.getCountryOfOrigin())) {

                response.getWriter().append(SEARCH_TABLE_STYLE +
                        "  <tr>\n" +
                        "    <td>" + foundBee.getName() + "</td>\n" +
                        "    <td>" + foundBee.getCaloricContent() + "</td>\n" +
                        "    <td>" + foundBee.getWeight() + "</td>\n" +
                        "    <td>" + foundBee.getManufacturer() + "</td>\n" +
                        "    <td>" + foundBee.getCountryOfOrigin() + "</td>\n" +
                        "    <td>" + foundBee.getPrice() + "</td>\n" +
                        "    <td>" + ADD_TO_BASKET_A_P + "</td>\n" +
                        "  </tr>\n" +
                        "</table>");
            }
            double cC = foundBee.getCaloricContent();
            String calorie = Double.toString(cC);
            if (Objects.equals(productCaloricContent, calorie)) {
                response.getWriter().append(SEARCH_TABLE_STYLE +
                        "  <tr>\n" +
                        "    <td>" + foundBee.getName() + "</td>\n" +
                        "    <td>" + foundBee.getCaloricContent() + "</td>\n" +
                        "    <td>" + foundBee.getWeight() + "</td>\n" +
                        "    <td>" + foundBee.getManufacturer() + "</td>\n" +
                        "    <td>" + foundBee.getCountryOfOrigin() + "</td>\n" +
                        "    <td>" + foundBee.getPrice() + "</td>\n" +
                        "    <td>" + ADD_TO_BASKET_A_P + "</td>\n" +
                        "  </tr>\n" +
                        "</table>");
            }
            double wG = foundBee.getWeight();
            String weight = Double.toString(wG);
            if (Objects.equals(productWeight, weight)) {
                response.getWriter().append(SEARCH_TABLE_STYLE +
                        "  <tr>\n" +
                        "    <td>" + foundBee.getName() + "</td>\n" +
                        "    <td>" + foundBee.getCaloricContent() + "</td>\n" +
                        "    <td>" + foundBee.getWeight() + "</td>\n" +
                        "    <td>" + foundBee.getManufacturer() + "</td>\n" +
                        "    <td>" + foundBee.getCountryOfOrigin() + "</td>\n" +
                        "    <td>" + foundBee.getPrice() + "</td>\n" +
                        "    <td>" + ADD_TO_BASKET_A_P + "</td>\n" +
                        "  </tr>\n" +
                        "</table>");
            }
            double pR = foundBee.getPrice();
            String price = Double.toString(pR);
            if (Objects.equals(productPrice, price)) {
                response.getWriter().append(SEARCH_TABLE_STYLE +
                        "  <tr>\n" +
                        "    <td>" + foundBee.getName() + "</td>\n" +
                        "    <td>" + foundBee.getCaloricContent() + "</td>\n" +
                        "    <td>" + foundBee.getWeight() + "</td>\n" +
                        "    <td>" + foundBee.getManufacturer() + "</td>\n" +
                        "    <td>" + foundBee.getCountryOfOrigin() + "</td>\n" +
                        "    <td>" + foundBee.getPrice() + "</td>\n" +
                        "    <td>" + ADD_TO_BASKET_A_P + "</td>\n" +
                        "  </tr>\n" +
                        "</table>");
            }

            response.getWriter().append(HTML_BODY_END);

        }

        response.getWriter().append(All_BEE);
        response.getWriter().append(BEE_JSP_SEARCH_PAGE_A_P);
        response.getWriter().append(RETURN_BACK_A_P);

    }

}

