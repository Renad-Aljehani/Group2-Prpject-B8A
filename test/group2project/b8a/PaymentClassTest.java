/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group2project.b8a;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shaima
 */
public class PaymentClassTest {
    
    public PaymentClassTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Payment method, of class PaymentClass.
     */
    @Test (timeout = 10)
    public void testPayment() throws IOException{
        System.out.println("Payment");
        File outputFile =  new File("output.txt");
        PrintWriter output = new PrintWriter(outputFile);
        Scanner input = new Scanner(System.in);
        String Customer_name = "Shaima";
        String Account_number = "1982736456";
        String DesignerName = "Mohammed Ahmed";
        PaymentClass instance = new PaymentClass();
        instance.Payment(outputFile, output, input, Customer_name, Account_number, DesignerName);
        
    }
    
    @Test
    public void testTotalPayment() {

        System.out.println("Total Payment");

        int amount = 1000;
        int tax = (int) (amount * 0.015) + amount;
        int expResult = 1015;

        assertEquals(expResult, tax);

    }

    
    
}
