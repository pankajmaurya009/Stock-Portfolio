package com.project;

import java.util.Map;

/**
 * Created by localadmin on 02/01/17.
 */
public class Stock {
    private String stockName;
    private int share;
    Map<String,Integer> stocks;
     public Stock(String stockName, int share){
         this.stockName = stockName;
         this.share = share ;
         stocks.put(stockName,share);

     }
}
