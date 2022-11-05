package group2project.b8a;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

/**
 *
 * @author Renad Aljehani
 */
public class CommentClassTest {

    public CommentClassTest() {
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
     * Test of writeComment method, of class CommentClass.
     *
     * @throws java.io.FileNotFoundException
     */
    
    @Test(timeout = 10)
    public void testWriteComment() throws IOException {//Check if WriteComment() method is working
        System.out.println("Test writeComment method");
        File outputFile = new File("output.txt");
        FileWriter fileWtitter = new FileWriter(outputFile);
        PrintWriter output = new PrintWriter(fileWtitter);
        Scanner input = new Scanner(System.in);
        String designerName = "Mohammed Ahmed";
        String experience = "Very good!";
        Double rate = 3.5;
        CommentClass instance = new CommentClass();
        instance.writeComment(outputFile, output, input, designerName, experience, rate);
    }

    @Test(timeout = 10)
    public void testGetRate() {//Check if entered rate same as expected
        System.out.println("Test rate");
        CommentClass instance = new CommentClass("Mohammed Ahmed", "Very good!", 3.5);
        Double expResult = 3.5;
        Double result = instance.getRate();
        assertEquals(expResult, result, 0.0);
    }

    @Test(timeout = 10)
    public void testSameType() {//Check if the two variables had the same input
        System.out.println("Test same type");
        String designerName = "Mohammed Ahmed";
        String experience = "Very good!";
        CommentClass instance = new CommentClass(designerName, experience, 3.5);
        assertNotSame(instance, experience);
    }

}
