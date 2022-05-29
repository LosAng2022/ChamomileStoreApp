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

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=windows-1251");

        for (int i = 0; i < ProductService.allBakery().size(); i++) {
            Bakery foundBakery = ProductService.allBakery().get(i);

            response.getWriter().append(HTML_BODY_BEGIN);

            if (Objects.equals(productName, foundBakery.getName())) {

                response.getWriter().append("<p " + SEARCH_OUTPUT_OTHER + "> Name: " + foundBakery.getName() +
                        ", calorie content: " + foundBakery.getCaloricContent() +
                        ", weight: " + foundBakery.getWeight() +
                        ", manufacturer: " + foundBakery.getManufacturer() +
                        ", country of origin: " + foundBakery.getCountryOfOrigin() +
                        ", price: " + foundBakery.getPrice() + "</p>");

            }
            if (Objects.equals(productManufacturer, foundBakery.getManufacturer())) {

                response.getWriter().append("<p " + SEARCH_OUTPUT_OTHER + "> Name: " + foundBakery.getName() +
                        ", calorie content: " + foundBakery.getCaloricContent() +
                        ", weight: " + foundBakery.getWeight() +
                        ", manufacturer: " + foundBakery.getManufacturer() +
                        ", country of origin: " + foundBakery.getCountryOfOrigin() +
                        ", price: " + foundBakery.getPrice() + "</p>");
            }
            if (Objects.equals(productCountryOfOrigin, foundBakery.getCountryOfOrigin())) {

                response.getWriter().append("<p " + SEARCH_OUTPUT_OTHER + "> Name: " + foundBakery.getName() +
                        ", calorie content: " + foundBakery.getCaloricContent() +
                        ", weight: " + foundBakery.getWeight() +
                        ", manufacturer: " + foundBakery.getManufacturer() +
                        ", country of origin: " + foundBakery.getCountryOfOrigin() +
                        ", price: " + foundBakery.getPrice() + "</p>");
            }
            double cC = foundBakery.getCaloricContent();
            String calorie = Double.toString(cC);
            if (Objects.equals(productCaloricContent, calorie)) {
                response.getWriter().append("<p " + SEARCH_OUTPUT_OTHER + "> Name: " + foundBakery.getName() +
                        ", calorie content: " + foundBakery.getCaloricContent() +
                        ", weight: " + foundBakery.getWeight() +
                        ", manufacturer: " + foundBakery.getManufacturer() +
                        ", country of origin: " + foundBakery.getCountryOfOrigin() +
                        ", price: " + foundBakery.getPrice() + "</p>");

            }
            double wG = foundBakery.getWeight();
            String weight = Double.toString(wG);
            if (Objects.equals(productWeight, weight)) {
                response.getWriter().append("<p " + SEARCH_OUTPUT_OTHER + "> Name: " + foundBakery.getName() +
                        ", calorie content: " + foundBakery.getCaloricContent() +
                        ", weight: " + foundBakery.getWeight() +
                        ", manufacturer: " + foundBakery.getManufacturer() +
                        ", country of origin: " + foundBakery.getCountryOfOrigin() +
                        ", price: " + foundBakery.getPrice() + "</p>");

            }
            double pR = foundBakery.getPrice();
            String price = Double.toString(pR);
            if (Objects.equals(productPrice, price)) {
                response.getWriter().append("<p " + SEARCH_OUTPUT_OTHER + "> Name: " + foundBakery.getName() +
                        ", calorie content: " + foundBakery.getCaloricContent() +
                        ", weight: " + foundBakery.getWeight() +
                        ", manufacturer: " + foundBakery.getManufacturer() +
                        ", country of origin: " + foundBakery.getCountryOfOrigin() +
                        ", price: " + foundBakery.getPrice() + "</p>");

            }

            response.getWriter().append(HTML_BODY_END);

        }

        response.getWriter().append("<p><a href=\"./searchBakery.jsp\">Search page</a></p>");
        response.getWriter().append(RETURN_BACK_A_P);

    }

}
