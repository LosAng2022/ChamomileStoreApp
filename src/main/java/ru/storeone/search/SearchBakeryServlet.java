package ru.storeone.search;

import ru.storeone.product.bakery.Bakery;
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


@WebServlet(urlPatterns = {"/searchbakery"})
public class SearchBakeryServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    ProductService productService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        ProductService.allBakery();

    }

}