package com.ultralesson.capstoneProject.shoppingcart;

import java.util.HashMap;

public class PriceChart {
    private static HashMap<String, Double> priceTable=new HashMap<>();
    public Double getPrice(String name) {
        return priceTable.get(name);
    }

    public void setPrice(String name,Double price) {
        PriceChart.priceTable.put(name, price);
    }
}
