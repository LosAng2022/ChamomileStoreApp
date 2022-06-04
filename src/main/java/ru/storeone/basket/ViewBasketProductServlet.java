package ru.storeone.basket;

import ru.storeone.product.Product;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

import static ru.storeone.constant.Param.*;


@WebServlet(urlPatterns = "/viewBasket")
public class ViewBasketProductServlet extends HttpServlet {

    public static final String TABLE_BEGIN = "<table style=\"style.css\">\n" +
            "  <tr>\n" +
            "    <th>Product name</th>\n" +
            "    <th>Product manufacturer</th>\n" +
            "    <th>Country of origin</th>\n" +
            "    <th>Product price</th>\n" +
            "    <th>Choice</th>\n" +
            "  </tr>";
    public static final String TABLE_END = "</table>";

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.getWriter().append(HTML_BODY_BEGIN);
        HttpSession httpSession = request.getSession();

        List<Product> myBasket = (List<Product>)httpSession.getAttribute("myBasket");

        if (myBasket!=null && myBasket.size() != 0) {
            response.getWriter().append("<p>View basket:</p>");

            for (int i=0; i < myBasket.size(); i++) {
                Product p = myBasket.get(i);

                response.getWriter().append(SEARCH_TABLE_STYLE +
                        "<tr>\n"  +
                        "    <td>" + p.getName() + "</td>\n" +
                        "    <td>" + p.getManufacturer() + "</td>\n" +
                        "    <td>" + p.getCountryOfOrigin() + "</td>\n" +
                        "    <td>" + p.getPrice() + "</td>\n" +
                        "  </tr>\n" +
                        "</table>");

            }

        } else {
            response.getWriter().append("<p>Our basket is Empty!</p>");
        }

        response.getWriter().append(HTML_BODY_END);
    }
}
