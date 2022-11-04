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
 * @author mtbtr
 */
public class ClassStyleTest {
    
    public ClassStyleTest() {
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
     * Test of ChooseStyle method, of class ClassStyle.
     */
    @Test
    public void testChooseStyle() throws IOException {
        System.out.println("ChooseStyle");
        File outputFile = new File("output.txt");
        FileWriter fileWtitter = new FileWriter(outputFile);
        PrintWriter output = new PrintWriter(fileWtitter);
        Scanner input = new Scanner(System.in);
        String Style = "Modren";
        String expResult = "You have chosen the modren style";
        String result = ClassStyle.ChooseStyle(outputFile, fileWtitter, output, input, Style);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
       @Test  (timeout=10)
       public void  testSameReference(){
        String expresult = "You have chosen the modren style";
         String result ="You have chosen the modren style";
         assertSame(expresult,result);
     }
}
