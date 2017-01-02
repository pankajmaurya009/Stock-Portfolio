package com.project;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by localadmin on 02/01/17.
 */
public class Brokerage_test {
    @Test
    public void TestBrokerageNameInfo(){
        String expectedValue = "zeroDHA";
        Brokerage b1 = new Brokerage(expectedValue);
        assertEquals(expectedValue,b1.getName());
    }
    @Test
    public void TestAddClientIntoBrokerageInfo(){
        Brokerage b1 = new Brokerage("zeroDHA");
        Client c1 = new Client("Bob", 20, "Male");
        b1.addClient(c1);
        Client findClient = b1.getClient("Bob");
        assertEquals("Bob", findClient.getName());

        Client c2 = new Client("Allena", 20, "female");
        b1.addClient(c2);
        Client findClient2 = b1.getClient("Allena");
        assertEquals("Allena", findClient2.getName());
        assertEquals(2,b1.clients.size());
    }

}


