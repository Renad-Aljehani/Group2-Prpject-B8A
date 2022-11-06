package group2project.b8a;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Jumanah nagro
 */

class ClassBookingDesigner {
    //contact numbers 
    static String contactMohammed = "+966 545105041";
    static String contactJoud = "+966 545129041";
    static String contactAdam = "+966 548106661";
    
    static int randomNum;
    //Date Object
    static Date theDate=new Date();
    public static String  BookDesigner(File outputFile,PrintWriter output, Scanner input, String DesignerName) {
      
        String Result = null;
        //Generate Random Numbers between 1 and 10 
        randomNum= (int) (Math.random() * 10) + 1;
        //conditions
        if (DesignerName.equalsIgnoreCase("Mohammed Ahmed")) {
            Result="-You have successful booking with Mohaamed Ahmed- To contact " + contactMohammed ;
            output.print(Result);

        }  
        if (DesignerName.equalsIgnoreCase("Joud Hani")) {
            Result="-You have successful booking with Joud Hani- To contact " + contactJoud ;
            output.print(Result);
        }  
        if (DesignerName.equalsIgnoreCase("Adam Khalid")) {
            Result=("-You have successful booking with Adam Khalid- To contact " + contactAdam);
            output.print(Result);

        } 
        output.print("\n\n order number #" + randomNum + ",Date of order: <" + theDate + ">");
        
        return Result;

    }

}
