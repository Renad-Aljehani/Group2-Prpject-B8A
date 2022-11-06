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
 * @author Jumma
 */
public class ClassBookingDesignerTest {
    
    public ClassBookingDesignerTest() {
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
     * Test of BookDesigner method, of class ClassBookingDesigner.
     */
    @Test
    public void testBookDesigner() throws IOException  {
        System.out.println("BookDesigner");
        File outputFile = new File("output.txt");
        FileWriter fileWtitter = new FileWriter(outputFile);
        PrintWriter output = new PrintWriter(fileWtitter);
        Scanner input = new Scanner(System.in);
        String DesignerName = "Joud Hani";
        String expResult = "-You have successful booking with Joud Hani-\n To contact " + ClassBookingDesigner.contactJoud ;
        String result = ClassBookingDesigner.BookDesigner(outputFile, output, input, DesignerName);
        assertEquals(expResult, result);
  
    }
        @Test(timeout = 90)
         public void testNotSame() {
 
         System.out.println("NotSameDesigner");
 
          String ms1 = new String ("Joud Hani");
     
          String ms2 = "Joud Hani";
 
          assertNotSame(ms1, ms2);
         }
    
}
