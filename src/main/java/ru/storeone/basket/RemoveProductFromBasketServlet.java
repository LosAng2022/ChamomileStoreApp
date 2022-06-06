package ru.storeone.basket;

import ru.storeone.product.Product;

import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/remove")
public class RemoveProductFromBasketServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        Integer id = Integer.valueOf(request.getParameter("id"));

        Object myBasket = request.getSession().getAttribute("myBasket");

        BasketService.removeFromBasket((int) id, (List<Product>) myBasket);

        RequestDispatcher requestDispatcher =  request.getRequestDispatcher("/viewBasket");
        requestDispatcher.forward(request, response);

    }

}