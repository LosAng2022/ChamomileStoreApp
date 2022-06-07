package ru.storeone.basket;


import ru.storeone.product.Product;
import ru.storeone.product.cereal.Cereal;
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

@WebServlet(urlPatterns = "/addToBasketCereal")
public class AddBasketCerealServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    ProductService productService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        ProductService.allCereal();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        String pName = request.getParameter(NAME);

        for (int i = 0; i < ProductService.allCereal().size(); i++) {
            Cereal selectCereal = ProductService.allCereal().get(i);

            response.getWriter().append(HTML_BODY_BEGIN);

            if (Objects.equals(pName, selectCereal.getName())) {

                Object myBasket = request.getSession().getAttribute("myBasket");
                if (myBasket != null) {
                    List<Product> list = (List<Product>) myBasket;
                    list.add(selectCereal);


                } else {
                    List<Product> list = new ArrayList();
                    list.add(selectCereal);

                    request.getSession().setAttribute("myBasket", list);
                }

            }
        }
        response.getWriter().append(PRODUCT_ADDED_TO_BASKET_P);
        response.getWriter().append(ALL_CEREAL);
        response.getWriter().append(CEREAL_JSP_SEARCH_PAGE_A_P);
        response.getWriter().append(RETURN_BACK_A_P);
        response.getWriter().append(WELCOME_PAGE);
        response.getWriter().append(HTML_BODY_END);

    }
}