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
 * @author Jumanah nagro
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
    @Test(timeout=10)
    public void testBookDesigner() throws IOException {
        System.out.println("BookDesigner");
       
        File outputFile = new File("output.txt");
        FileWriter fileWtitter = new FileWriter(outputFile);
        PrintWriter output = new PrintWriter(fileWtitter);
        Scanner input = new Scanner(System.in);
        
        String DesignerName = "Joud Hani";
        ClassBookingDesigner instance = new ClassBookingDesigner();
        instance.BookDesigner(outputFile, output, input, DesignerName);
      
    }
   
         @Test(timeout = 90)
 
         public void testNotSame() {
 
         System.out.println("NotSameDesigner");
 
          String ms1 = new String ("Joud Hani");
     
          String ms2 = "Joud Hani";
 
          assertNotSame(ms1, ms2);
 
}

 
 
 


    
}
