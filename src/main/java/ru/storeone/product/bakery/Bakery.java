package ru.storeone.product.bakery;

import ru.storeone.product.Product;



public class Bakery extends Product {

    private double caloricContent, weight;

    public Bakery(String name, double caloricContent, double weight, String manufacturer, String countryOfOrigin, double price) {
        super(name, manufacturer, countryOfOrigin, price);
        this.caloricContent = caloricContent;
        this.weight = weight;
    }

    public double getCaloricContent() {
        return caloricContent;
    }

    public void setCaloricContent(double caloricContent) {
        this.caloricContent = caloricContent;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

   /* @Override
    public String toString() {
        return "Выпечка : " + "название: " + getName() + ", калорийность: " + getCaloricContent() + " кДж " +
                ", вес: " + getWeight() + " кг." + ", производитель: " + getManufacturer() +
                ", страна происхождения: " + getCountryOfOrigin() + ", цена: " + getPrice() + " руб.";*/


    @Override
    public String toString() {
        return "Bakery : " + "name: " + getName() + ", calorie content: " + getCaloricContent() +
                ", weight: " + getWeight() + ", manufacturer: " + getManufacturer() +
                ", country of origin: " + getCountryOfOrigin() + ", price: " + getPrice();

}}

