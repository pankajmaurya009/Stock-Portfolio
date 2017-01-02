package com.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by localadmin on 02/01/17.
 */
public class Brokerage {
    private String name ;
    Map<String, Client> clients;

    public Brokerage(String name){
        this.name = name;
        this.clients = new HashMap<String, Client>();
    }

    public String getName() {
        return name;
    }

    public Client getClient(String name) {
        return this.clients.get(name);
    }
    public void addClient(Client c){
        this.clients.put(c.getName(), c);
    }

}
