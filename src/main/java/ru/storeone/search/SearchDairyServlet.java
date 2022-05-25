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

        String productName = request.getParameter("name");
        String productManufacturer = request.getParameter("manufacturer");
        for (int i = 0; i < ProductService.allDP().size(); i++) {
            Dairy foundDairy = ProductService.allDP().get(i);

            response.getWriter().append("<html><head><link rel=\"stylesheet\" href=\"style.css\">\n</head><body>");

            if (Objects.equals(productName, foundDairy.getName()) && Objects.equals(productManufacturer, foundDairy.getManufacturer())) {

                response.getWriter().append("<p> Name: " + foundDairy.getName() +
                        ", fat content: " + foundDairy.getFatContent() +
                        ", volume: " + foundDairy.getVolume() +
                        ", manufacturer: " + foundDairy.getManufacturer() +
                        ", country of origin: " + foundDairy.getCountryOfOrigin() +
                        ", price: " + foundDairy.getPrice() + "</p>");

            }else if (!Objects.equals(productName, foundDairy.getName())) {
                response.getWriter().append("<p>Other dairy product<p>");

            }

            response.getWriter().append("</body></html>");
        }
        response.getWriter().append("<p><a href=\"./\">Return back</a></p>");
        response.getWriter().append("<p><a href=\"./dairyinfo></a></p>");

    }

        }

