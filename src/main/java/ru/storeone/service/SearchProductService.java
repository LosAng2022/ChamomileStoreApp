package ru.storeone.service;

import ru.storeone.product.dairy.Dairy;

import java.util.HashMap;
import java.util.Map;

public class SearchProductService {

    private static Map<String, Dairy> dairyMap = new HashMap<>();

    static {


        }
        public static synchronized Map<String, Dairy> getAll() {
            return dairyMap;
        }
    }
