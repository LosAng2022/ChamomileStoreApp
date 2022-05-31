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
        String productName = request.getParameter("name");
        String productManufacturer = request.getParameter("manufacturer");

        for (int i = 0; i < ProductService.allDP().size(); i++) {
            Dairy foundDairy = ProductService.allDP().get(i);
            response.getWriter().append(HTML_BODY_BEGIN);
            if (Objects.equals(productName,foundDairy.getName()) || Objects.equals(productManufacturer, foundDairy.getManufacturer())) {

                response.getWriter().append("<p style=font-size:15px;color:white> Name: " + foundDairy.getName() +
                        ", fat content: " + foundDairy.getFatContent() +
                        ", volume: " + foundDairy.getVolume() +
                        ", manufacturer: " + foundDairy.getManufacturer() +
                        ", country of origin: " + foundDairy.getCountryOfOrigin() +
                        ", price: " + foundDairy.getPrice() + "</p>");
                }

                response.getWriter().append(HTML_BODY_END);
            }

            response.getWriter().append(DAIRYINFO_SEARCH_PAGE_A_P);
            response.getWriter().append(RETURN_BACK_A_P);

        }

    }