package com.project;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by localadmin on 02/01/17.
 */
public class Portfolio {
    private String portfolioName;
    Map<String,Stock> stocks;

    public Portfolio(String portfolioName,Stock s ) {
        this.portfolioName = portfolioName;
        this.stocks = new HashMap<String, Stock>();
        this.stocks = stocks;
    }
}
