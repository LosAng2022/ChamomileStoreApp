package ru.storeone.basket;

import ru.storeone.product.Product;
import ru.storeone.product.dairy.Dairy;
import ru.storeone.service.ProductService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static ru.storeone.constant.Param.*;

@WebServlet(urlPatterns = "/addToBasketDairy")
public class AddBasketDairyServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    ProductService productService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        ProductService.allDP();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        String pName = request.getParameter(NAME);

        for (int i = 0; i < ProductService.allDP().size(); i++) {
            Dairy selectDairy = ProductService.allDP().get(i);

            response.getWriter().append(HTML_BODY_BEGIN);

            if (Objects.equals(pName, selectDairy.getName())) {

                Object myBasket = request.getSession().getAttribute("myBasket");
                if (myBasket != null) {
                    List<Product> list = (List<Product>) myBasket;
                    list.add(selectDairy);


                } else {
                    List<Product> list = new ArrayList();
                    list.add(selectDairy);

                    request.getSession().setAttribute("myBasket", list);
                }

            }

        }
        response.getWriter().append(PRODUCT_ADDED_TO_BASKET_P);
        response.getWriter().append(ALL_DAIRY);
        response.getWriter().append(DAIRY_JSP_SEARCH_PAGE_A_P);
        response.getWriter().append(RETURN_BACK_A_P);
        response.getWriter().append(HTML_BODY_END);

    }
}