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
    ProductService productService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        ProductService.allBakery();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request, response);

        String productName = request.getParameter("name");
        String productManufacturer = request.getParameter("manufacturer");
        for (int i = 0; i < ProductService.allBakery().size(); i++) {
            Bakery foundBakery = ProductService.allBakery().get(i);
            response.getWriter().append("<html><head><link rel=\"stylesheet\" href=\"style.css\">\n</head><body>");

            if (Objects.equals(productName, foundBakery.getName()) && Objects.equals(productManufacturer, foundBakery.getManufacturer())) {

                response.getWriter().append("<p> Name: " + foundBakery.getName() +
                        ", calorie content: " + foundBakery.getCaloricContent() +
                        ", weight: " + foundBakery.getWeight() +
                        ", manufacturer: " + foundBakery.getManufacturer() +
                        ", country of origin: " + foundBakery.getCountryOfOrigin() +
                        ", price: " + foundBakery.getPrice() + "</p>");

            }else if (!Objects.equals(productName, foundBakery.getName())) {
                response.getWriter().append("<p>Other dairy product<p>");

            }

            response.getWriter().append("</body></html>");
        }
        response.getWriter().append("<p><a href=\"./\">Return back</a></p>");
        response.getWriter().append("<p><a href=\"./bakeryinfo></a></p>");

    }

}
