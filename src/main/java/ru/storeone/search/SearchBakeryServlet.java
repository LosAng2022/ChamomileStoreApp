package ru.storeone.search;

import ru.storeone.product.bakery.Bakery;
import ru.storeone.service.ProductService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet(urlPatterns = {"/searchbakery"})
public class SearchBakeryServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        ProductService.allBakery();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String productName = request.getParameter("name");
        String productManufacturer = request.getParameter("manufacturer");
        String productCountryOfOrigin = request.getParameter("countryOfOrigin");
        String productCaloricContent = request.getParameter("caloricContent");
        String productWeight = request.getParameter("weight");
        String productPrice = request.getParameter("price");

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=windows-1251");

        for (int i = 0; i < ProductService.allBakery().size(); i++) {
            Bakery foundBakery = ProductService.allBakery().get(i);
            response.getWriter().append("<html><head><link rel=\"stylesheet\" href=\"style.css\">\n</head><body>");

            if (Objects.equals(productName, foundBakery.getName())) {

                response.getWriter().append("<p style=font-size:15px;color:white> Name: " + foundBakery.getName() +
                        ", calorie content: " + foundBakery.getCaloricContent() +
                        ", weight: " + foundBakery.getWeight() +
                        ", manufacturer: " + foundBakery.getManufacturer() +
                        ", country of origin: " + foundBakery.getCountryOfOrigin() +
                        ", price: " + foundBakery.getPrice() + "</p>");
            }
            if (Objects.equals(productManufacturer, foundBakery.getManufacturer())) {

                response.getWriter().append("<p> Name: " + foundBakery.getName() +
                        ", calorie content: " + foundBakery.getCaloricContent() +
                        ", weight: " + foundBakery.getWeight() +
                        ", manufacturer: " + foundBakery.getManufacturer() +
                        ", country of origin: " + foundBakery.getCountryOfOrigin() +
                        ", price: " + foundBakery.getPrice() + "</p>");
            }
            if (Objects.equals(productCountryOfOrigin, foundBakery.getCountryOfOrigin())) {

                response.getWriter().append("<p> Name: " + foundBakery.getName() +
                        ", calorie content: " + foundBakery.getCaloricContent() +
                        ", weight: " + foundBakery.getWeight() +
                        ", manufacturer: " + foundBakery.getManufacturer() +
                        ", country of origin: " + foundBakery.getCountryOfOrigin() +
                        ", price: " + foundBakery.getPrice() + "</p>");
            }
            double cC = foundBakery.getCaloricContent();
            String calorie = Double.toString(cC);
            if (Objects.equals(productCaloricContent, calorie)) {
                response.getWriter().append("<p> Name: " + foundBakery.getName() +
                        ", calorie content: " + foundBakery.getCaloricContent() +
                        ", weight: " + foundBakery.getWeight() +
                        ", manufacturer: " + foundBakery.getManufacturer() +
                        ", country of origin: " + foundBakery.getCountryOfOrigin() +
                        ", price: " + foundBakery.getPrice() + "</p>");

            }
            double wG = foundBakery.getWeight();
            String weight = Double.toString(wG);
            if (Objects.equals(productWeight, weight)) {
                response.getWriter().append("<p> Name: " + foundBakery.getName() +
                        ", calorie content: " + foundBakery.getCaloricContent() +
                        ", weight: " + foundBakery.getWeight() +
                        ", manufacturer: " + foundBakery.getManufacturer() +
                        ", country of origin: " + foundBakery.getCountryOfOrigin() +
                        ", price: " + foundBakery.getPrice() + "</p>");

            }
            double pR = foundBakery.getPrice();
            String price = Double.toString(pR);
            if (Objects.equals(productPrice, price)) {
                response.getWriter().append("<p> Name: " + foundBakery.getName() +
                        ", calorie content: " + foundBakery.getCaloricContent() +
                        ", weight: " + foundBakery.getWeight() +
                        ", manufacturer: " + foundBakery.getManufacturer() +
                        ", country of origin: " + foundBakery.getCountryOfOrigin() +
                        ", price: " + foundBakery.getPrice() + "</p>");

            }

            response.getWriter().append("</body></html>");

        }

        response.getWriter().append("<p><a href=\"./searchBakery.jsp\">Search page</a></p>");
        response.getWriter().append("<p><a href=\"./\">Return back</a></p>");
        response.getWriter().append("<p><a href=\"./bakeryinfo></a></p>");
    }


}
