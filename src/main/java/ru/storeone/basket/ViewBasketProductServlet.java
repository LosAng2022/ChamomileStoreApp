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

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
double sum = 0;
int product = 0;
        response.getWriter().append(HTML_BODY_BEGIN);
        HttpSession httpSession = request.getSession();

        List<Product> myBasket = (List<Product>) httpSession.getAttribute("myBasket");

        if (myBasket != null && myBasket.size() != 0) {
            response.getWriter().append(VIEW_BASKET_P);

            // подсчёт цены TODO (-1 product)
            for (int i = 0; i < myBasket.size(); i++) {
                Product p = myBasket.get(i);
                sum = sum + p.getPrice() + i;

            // количество продуктов
                while (product == i) {
                    product++;
                }

                response.getWriter().append(SEARCH_TABLE_STYLE +
                        "<tr>\n"  +
                        "    <td>" + p.getName() + "</td>\n" +
                        "    <td>" + p.getManufacturer() + "</td>\n" +
                        "    <td>" + p.getCountryOfOrigin() + "</td>\n" +
                        "    <td>" + p.getPrice() + "</td>\n" +
                        "    <td>" + "<p><a style=color:red href= \"./remove?id=" + i + "\">Remove</a></td>\n" + "</td>\n" +
                        "  </tr>\n" + "</table>");

            }
            response.getWriter().append("<p style=font-size:25px;color:white>" + "Total products: " + product + " products, for the sum: " +
                    sum + " RUB" + "</p>");
            response.getWriter().append("<p><a style=\"font-size:25px; color: goldenrod; margin: 20px;\" href=\"./buy.jsp\">BUY</a></p>");

        } else {
            response.getWriter().append("<p style=font-size:25px;color:white>Our basket is Empty!</p>");
        }

        response.getWriter().append(RETURN_BACK_A_P);
        response.getWriter().append(WELCOME_PAGE);
        response.getWriter().append(HTML_BODY_END);
            }
        }
