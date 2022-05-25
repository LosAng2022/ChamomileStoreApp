package ru.storeone.product.dairy;

import ru.storeone.product.Product;

public class Dairy extends Product {
    private double fatContent, volume;

    public Dairy(String name, double fatContent, double volume, String manufacturer, String countryOfOrigin, double price) {
        super(name, manufacturer, countryOfOrigin, price);
        this.fatContent = fatContent;
        this.volume = volume;
    }

    public double getFatContent() {
        return fatContent;
    }

    public void setFatContent(double fatContent) {
        this.fatContent = fatContent;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    /*@Override
    public String toString() {
        return "Мололчный продукт : " + "название: " + getName() + ", жирность: " + getFatContent() + " % " +
                ", объём: " + getVolume() + " лит." + ", производитель: " + getManufacturer() +
                ", страна происхождения: " + getCountryOfOrigin() + ", цена: " + getPrice() + " руб.";*/

    @Override
    public String toString() {
        return "Dairy product : " + "name: " + getName() + ", fat content: " + getFatContent() + " % " +
                ", volume: " + getVolume() + " lit." + ", manufacturer: " + getManufacturer() +
                ", country of origin: " + getCountryOfOrigin() + ", price: " + getPrice() + " rub.";

    }

}
