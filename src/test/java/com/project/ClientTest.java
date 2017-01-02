package com.project;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by localadmin on 02/01/17.
 */
public class ClientTest {
    @Test
    public void TestClientNameInfo(){

        Client c1 = new Client("Pankaj" , 24 , "Male");
        assertEquals("Pankaj",c1.getName());
        assertEquals( 24 ,c1.getAge());
        assertEquals("Male",c1.getGender());
    }

    @Test
    public void TestDepositAndWithdraw(){

        Client c2 = new Client("Pankaj" , 24 , "Male");
        c2.deposit(12000);
        assertEquals(12000,c2.getCashBalance());
        c2.deposit(2000);
        assertEquals(14000,c2.getCashBalance());
        c2.withdraw(4000);
        assertEquals(10000,c2.getCashBalance());

    }

}