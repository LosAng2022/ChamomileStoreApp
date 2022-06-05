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
        Cream cream = new Cream("Cream",20.0,0.5,"Vkusnoteevo","Russia",145.0);
        Kefir kefir = new Kefir("Kefir",1.5,1.0,"Sarafanovo","Russia",90.0);
        Milk milk = new Milk("Pasteurized milk",1.5,1.0,"Sarafanovo","Russia",80.0);
        Milk milk1 = new Milk("Milk ultra-pasteurized",2.5,1.0,"Sarafanovo","Russia",90.0);
        Milk milk2 = new Milk("Baked milk",3.2,1.0,"Sarafanovo","Russia",100.0);
        Milk milk3 = new Milk("Goat's milk",1.5,1.0,"Vkusnoteevo","Russia",85.0);
        Milk milk4 = new Milk("Kumys",2.5,1.0,"Vkusnoteevo","Russia",95.0);
        Milk milk5 = new Milk("Fresh milk",3.2,1.0,"Vkusnoteevo","Russia",105.0);
        dairyArrayList.add(cream);
        dairyArrayList.add(kefir);
        dairyArrayList.add(milk);
        dairyArrayList.add(milk1);
        dairyArrayList.add(milk2);
        dairyArrayList.add(milk3);
        dairyArrayList.add(milk4);
        dairyArrayList.add(milk5);
        return dairyArrayList;

    }

    public static ArrayList<Bakery> allBakery() {
        ArrayList<Bakery> bakeryArrayList = new ArrayList();
        Bread bread = new Bread("Borodino bread",260.0,1.0,"BreadFactoryA","Russia",70.0);
        Bread bread1 = new Bread("Unleavened bread",265.0,1.0,"BreadFactoryA","Russia",75.0);
        Bread bread2 = new Bread("Village bread",270.0,1.0,"BreadFactoryA","Russia",80.0);
        Bread bread3 = new Bread("Baguette",275.0,0.5,"BreadFactoryB","Russia",85.0);
        Bread bread4 = new Bread("Ciabatta",280.0,0.5,"BreadFactoryB","Russia",90.0);
        Bread bread5 = new Bread("Corn tortilla",285.0,0.5,"BreadFactoryB","Russia",95.0);
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
        Buckwheat buckwheat = new Buckwheat("Oat",343.0,1.0,"Mistral","Russia",100.0);
        Buckwheat buckwheat1 = new Buckwheat("Rice",343.0,1.5,"Mistral","Russia",105.0);
        Buckwheat buckwheat2 = new Buckwheat("Millet",343.0,2.0,"Mistral","Russia",110.0);
        Buckwheat buckwheat3 = new Buckwheat("Spelled",343.0,0.5,"Altai","Russia",120.0);
        Buckwheat buckwheat4 = new Buckwheat("Pearl barley",343.0,1.0,"Altai","Russia",130.0);
        Buckwheat buckwheat5 = new Buckwheat("Buckwheat",343.0,1.5,"Altai","Russia",140.0);
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
        Honey honey = new Honey("Linden Honey",329.0,1.0,"Beehive One","Russia",200.0);
        Honey honey1 = new Honey("Buckwheat Honey",329.0,2.0,"Beehive One","Russia",250.0);
        Honey honey2 = new Honey("Acacia Honey",329.0,3.0,"Beehive One","Russia",300.0);
        Honey honey3 = new Honey("Clover Honey",329.0,1.0,"Beehive Two","Russia",200.0);
        Honey honey4 = new Honey("Sunflower Honey",329.0,2.0,"Beehive Two","Russia",250.0);
        Honey honey5 = new Honey("Flower Honey",329.0,3.0,"Beehive Two","Russia",300.0);
        beeProductsArrayList.add(honey);
        beeProductsArrayList.add(honey1);
        beeProductsArrayList.add(honey2);
        beeProductsArrayList.add(honey3);
        beeProductsArrayList.add(honey4);
        beeProductsArrayList.add(honey5);
        return beeProductsArrayList;
    }
}