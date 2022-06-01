package ru.storeone.service;

import ru.storeone.product.bakery.Bakery;
import ru.storeone.product.bakery.Bread;
import ru.storeone.product.beeproducts.BeeProducts;
import ru.storeone.product.beeproducts.Honey;
import ru.storeone.product.cereal.Buckwheat;
import ru.storeone.product.cereal.Cereal;
import ru.storeone.product.dairy.Cream;
import ru.storeone.product.dairy.Dairy;
import ru.storeone.product.dairy.Kefir;
import ru.storeone.product.dairy.Milk;

import java.util.ArrayList;
public class ProductService {

    public static ArrayList<Dairy> allDP() {
        ArrayList<Dairy> dairyArrayList = new ArrayList();
        Cream cream = new Cream("Cream",10.0,0.5,"Sarafanovo","Russia",120.0);
        Cream cream1 = new Cream("Cream",15.0,0.5,"Sarafanovo","Russia",130.0);
        Cream cream2 = new Cream("Cream",20.0,0.5,"Sarafanovo","Russia",140.0);
        Cream cream3 = new Cream("Cream",10.0,0.5,"Vkusnoteevo","Russia",125.0);
        Cream cream4 = new Cream("Cream",15.0,0.5,"Vkusnoteevo","Russia",135.0);
        Cream cream5 = new Cream("Cream",20.0,0.5,"Vkusnoteevo","Russia",145.0);
        Kefir kefir = new Kefir("Kefir",1.5,1.0,"Sarafanovo","Russia",90.0);
        Kefir kefir1 = new Kefir("Kefir",2.5,1.0,"Sarafanovo","Russia",95.0);
        Kefir kefir2 = new Kefir("Kefir",3.2,1.0,"Sarafanovo","Russia",100.0);
        Kefir kefir3 = new Kefir("Kefir",1.5,1.0,"Vkusnoteevo","Russia",97.0);
        Kefir kefir4 = new Kefir("Kefir",2.5,1.0,"Vkusnoteevo","Russia",99.99);
        Kefir kefir5 = new Kefir("Kefir",3.2,1.0,"Vkusnoteevo","Russia",100.50);
        Milk milk = new Milk("Milk",1.5,1.0,"Sarafanovo","Russia",80.0);
        Milk milk1 = new Milk("Milk",2.5,1.0,"Sarafanovo","Russia",90.0);
        Milk milk2 = new Milk("Milk",3.2,1.0,"Sarafanovo","Russia",100.0);
        Milk milk3 = new Milk("Milk",1.5,1.0,"Vkusnoteevo","Russia",85.0);
        Milk milk4 = new Milk("Milk",2.5,1.0,"Vkusnoteevo","Russia",95.0);
        Milk milk5 = new Milk("Milk",3.2,1.0,"Vkusnoteevo","Russia",105.0);
        dairyArrayList.add(cream);
        dairyArrayList.add(cream1);
        dairyArrayList.add(cream2);
        dairyArrayList.add(cream3);
        dairyArrayList.add(cream4);
        dairyArrayList.add(cream5);
        dairyArrayList.add(kefir);
        dairyArrayList.add(kefir1);
        dairyArrayList.add(kefir2);
        dairyArrayList.add(kefir3);
        dairyArrayList.add(kefir4);
        dairyArrayList.add(kefir5);
        dairyArrayList.add(milk);
        dairyArrayList.add(milk1);
        dairyArrayList.add(milk2);
        dairyArrayList.add(milk3);
        dairyArrayList.add(milk4);
        dairyArrayList.add(milk5);
        return dairyArrayList;

    }

    public static synchronized ArrayList<Bakery> allBakery() {
        ArrayList<Bakery> bakeryArrayList = new ArrayList();
        Bread bread = new Bread("Bread",265.0,1.0,"BreadFactoryA","Russia",75.90);
        Bread bread1 = new Bread("Bread",275.0,1.0,"BreadFactoryA","Russia",80.0);
        Bread bread2 = new Bread("Bread",280.0,1.0,"BreadFactoryA","Russia",85.0);
        Bread bread3 = new Bread("Bread",265.0,0.5,"BreadFactoryB","Russia",90.0);
        Bread bread4 = new Bread("Bread",275.0,0.5,"BreadFactoryB","Russia",95.0);
        Bread bread5 = new Bread("Bread",280.0,0.5,"BreadFactoryB","Russia",105.0);
        bakeryArrayList.add(bread);
        bakeryArrayList.add(bread1);
        bakeryArrayList.add(bread2);
        bakeryArrayList.add(bread3);
        bakeryArrayList.add(bread4);
        bakeryArrayList.add(bread5);
        return bakeryArrayList;

    }

    public static ArrayList<Cereal> allCereal() {
        ArrayList<Cereal> cerealArrayList = new ArrayList();
        Buckwheat buckwheat = new Buckwheat("Buckwheat",343.0,1.0,"Mistral","Russia",100.90);
        Buckwheat buckwheat1 = new Buckwheat("Buckwheat",343.0,1.5,"Mistral","Russia",150.0);
        Buckwheat buckwheat2 = new Buckwheat("Buckwheat",343.0,2.0,"Mistral","Russia",290.0);
        Buckwheat buckwheat3 = new Buckwheat("Buckwheat",343.0,0.5,"Altai","Russia",55.0);
        Buckwheat buckwheat4 = new Buckwheat("Buckwheat",343.0,1.0,"Altai","Russia",100.0);
        Buckwheat buckwheat5 = new Buckwheat("Buckwheat",343.0,1.5,"Altai","Russia",150.50);
        cerealArrayList.add(buckwheat);
        cerealArrayList.add(buckwheat1);
        cerealArrayList.add(buckwheat2);
        cerealArrayList.add(buckwheat3);
        cerealArrayList.add(buckwheat4);
        cerealArrayList.add(buckwheat5);
        return cerealArrayList;

    }

    public static ArrayList<BeeProducts> allBeeP() {
        ArrayList<BeeProducts> beeProductsArrayList = new ArrayList();
        Honey honey = new Honey("Honey",329.0,1.0,"Beehive One","Russia",100.90);
        Honey honey1 = new Honey("Honey",329.0,2.0,"Beehive One","Russia",150.0);
        Honey honey2 = new Honey("Honey",329.0,3.0,"Beehive One","Russia",290.0);
        Honey honey3 = new Honey("Honey",329.0,1.0,"Beehive Two","Russia",55.0);
        Honey honey4 = new Honey("Honey",329.0,2.0,"Beehive Two","Russia",100.0);
        Honey honey5 = new Honey("Honey",329.0,3.0,"Beehive Two","Russia",150.50);
        beeProductsArrayList.add(honey);
        beeProductsArrayList.add(honey1);
        beeProductsArrayList.add(honey2);
        beeProductsArrayList.add(honey3);
        beeProductsArrayList.add(honey4);
        beeProductsArrayList.add(honey5);
        return beeProductsArrayList;
    }
}