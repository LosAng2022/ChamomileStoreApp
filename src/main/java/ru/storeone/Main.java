package ru.storeone;

import ru.storeone.product.bakery.Bakery;
import ru.storeone.service.ProductService;

public class Main {

    public static void main(String[] args) {
        ProductService productService = new ProductService();

        productService.add(new Bakery("Village bread",270.0,1.0,"BreadFactoryA","Russia",80.0));
    }

}
