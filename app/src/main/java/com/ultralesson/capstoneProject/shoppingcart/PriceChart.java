package com.ultralesson.capstoneProject.shoppingcart;

import java.util.HashMap;

public class PriceChart {
    private static PriceChart instance;
    private HashMap<String, Double> priceTable=new HashMap<>();

    private PriceChart(){
        priceTable.put("apple",100.0);
        priceTable.put("milk",30.0);
        priceTable.put("news paper",5.0);
    }

    public static PriceChart getInstance() {
        if(instance==null)
            instance=new PriceChart();
        return instance;
    }

    public Double getPrice(String name) {
        return priceTable.get(name);
    }

    private void setPrice(String name,Double price) {
        PriceChart.getInstance().priceTable.put(name, price);
    }
}
