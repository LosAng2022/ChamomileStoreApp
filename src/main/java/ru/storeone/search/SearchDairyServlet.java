package ru.storeone.search;

import ru.storeone.product.dairy.Dairy;
import ru.storeone.service.ProductService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

import static ru.storeone.constant.Param.*;

@WebServlet(urlPatterns = {"/searchdairy"})
public class SearchDairyServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        ProductService.allDP();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String productName = request.getParameter(NAME);
        String productManufacturer = request.getParameter(MANUFACTURER);
        String productCountryOfOrigin = request.getParameter(COUNTRY_OF_ORIGIN);
        String productFatContent = request.getParameter(FAT_CONTENT);
        String productVolume = request.getParameter(VOLUME);
        String productPrice = request.getParameter(PRICE);


        for (int i = 0; i < ProductService.allDP().size(); i++) {
            Dairy foundDairy = ProductService.allDP().get(i);

            response.getWriter().append(HTML_BODY_BEGIN);

            if (Objects.equals(productName, foundDairy.getName())) {

                response.getWriter().append(SEARCH_TABLE_STYLE +
                        "  <tr>\n" +
                        "    <td>" + foundDairy.getName() + "</td>\n" +
                        "    <td>" + foundDairy.getFatContent() + "</td>\n" +
                        "    <td>" + foundDairy.getVolume() + "</td>\n" +
                        "    <td>" + foundDairy.getManufacturer() + "</td>\n" +
                        "    <td>" + foundDairy.getCountryOfOrigin() + "</td>\n" +
                        "    <td>" + foundDairy.getPrice() + "</td>\n" +
                        "    <td>" + ADD_TO_BASKET_A_P + "</td>\n" +
                        "  </tr>\n" +
                        "</table>");

            }
            if (Objects.equals(productManufacturer, foundDairy.getManufacturer())) {

                response.getWriter().append(SEARCH_TABLE_STYLE +
                        "  <tr>\n" +
                        "    <td>" + foundDairy.getName() + "</td>\n" +
                        "    <td>" + foundDairy.getFatContent() + "</td>\n" +
                        "    <td>" + foundDairy.getVolume() + "</td>\n" +
                        "    <td>" + foundDairy.getManufacturer() + "</td>\n" +
                        "    <td>" + foundDairy.getCountryOfOrigin() + "</td>\n" +
                        "    <td>" + foundDairy.getPrice() + "</td>\n" +
                        "    <td>" + ADD_TO_BASKET_A_P + "</td>\n" +
                        "  </tr>\n" +
                        "</table>");
            }
            if (Objects.equals(productCountryOfOrigin, foundDairy.getCountryOfOrigin())) {

                response.getWriter().append(SEARCH_TABLE_STYLE +
                        "  <tr>\n" +
                        "    <td>" + foundDairy.getName() + "</td>\n" +
                        "    <td>" + foundDairy.getFatContent() + "</td>\n" +
                        "    <td>" + foundDairy.getVolume() + "</td>\n" +
                        "    <td>" + foundDairy.getManufacturer() + "</td>\n" +
                        "    <td>" + foundDairy.getCountryOfOrigin() + "</td>\n" +
                        "    <td>" + foundDairy.getPrice() + "</td>\n" +
                        "    <td>" + ADD_TO_BASKET_A_P + "</td>\n" +
                        "  </tr>\n" +
                        "</table>");
            }
            double cC = foundDairy.getFatContent();
            String fat = Double.toString(cC);
            if (Objects.equals(productFatContent, fat)) {
                response.getWriter().append(SEARCH_TABLE_STYLE +
                        "  <tr>\n" +
                        "    <td>" + foundDairy.getName() + "</td>\n" +
                        "    <td>" + foundDairy.getFatContent() + "</td>\n" +
                        "    <td>" + foundDairy.getVolume() + "</td>\n" +
                        "    <td>" + foundDairy.getManufacturer() + "</td>\n" +
                        "    <td>" + foundDairy.getCountryOfOrigin() + "</td>\n" +
                        "    <td>" + foundDairy.getPrice() + "</td>\n" +
                        "    <td>" + ADD_TO_BASKET_A_P + "</td>\n" +
                        "  </tr>\n" +
                        "</table>");
            }
            double wG = foundDairy.getVolume();
            String volume = Double.toString(wG);
            if (Objects.equals(productVolume, volume)) {
                response.getWriter().append(SEARCH_TABLE_STYLE +
                        "  <tr>\n" +
                        "    <td>" + foundDairy.getName() + "</td>\n" +
                        "    <td>" + foundDairy.getFatContent() + "</td>\n" +
                        "    <td>" + foundDairy.getVolume() + "</td>\n" +
                        "    <td>" + foundDairy.getManufacturer() + "</td>\n" +
                        "    <td>" + foundDairy.getCountryOfOrigin() + "</td>\n" +
                        "    <td>" + foundDairy.getPrice() + "</td>\n" +
                        "    <td>" + ADD_TO_BASKET_A_P + "</td>\n" +
                        "  </tr>\n" +
                        "</table>");
            }
            double pR = foundDairy.getPrice();
            String price = Double.toString(pR);
            if (Objects.equals(productPrice, price)) {
                response.getWriter().append(SEARCH_TABLE_STYLE +
                        "  <tr>\n" +
                        "    <td>" + foundDairy.getName() + "</td>\n" +
                        "    <td>" + foundDairy.getFatContent() + "</td>\n" +
                        "    <td>" + foundDairy.getVolume() + "</td>\n" +
                        "    <td>" + foundDairy.getManufacturer() + "</td>\n" +
                        "    <td>" + foundDairy.getCountryOfOrigin() + "</td>\n" +
                        "    <td>" + foundDairy.getPrice() + "</td>\n" +
                        "    <td>" + ADD_TO_BASKET_A_P + "</td>\n" +
                        "  </tr>\n" +
                        "</table>");
            }

            response.getWriter().append(HTML_BODY_END);

        }

        response.getWriter().append(ALL_DAIRY);
        response.getWriter().append(DAIRY_JSP_SEARCH_PAGE_A_P);
        response.getWriter().append(RETURN_BACK_A_P);

    }

}