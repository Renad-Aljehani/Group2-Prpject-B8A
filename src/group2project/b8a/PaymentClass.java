
package group2project.b8a;


import java.io.File;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author shaima
 */

public class PaymentClass {


    String Customer_name;
    static int amount ;
    String Account_number;
    static int tax;
    static int total;
    static String result = null;

    public static String Payment(File outputFile, PrintWriter output, Scanner input, String Customer_name, String Account_number, String DesignerName) {

        char[] Acount = Account_number.toCharArray();
        int size = Acount.length;
        String lastFourNum = "";
        for (int i = size - 1; i > size - 5; i--) {
            lastFourNum = Acount[i] + lastFourNum;
            
            
        }
        
        output.print("\n");
        output.print("---------------------------------------------------------------");
        output.print("\n                       Payment Information                    ");
        output.print("\n---------------------------------------------------------------");
        output.print("\n");
        output.print("\n Customer Name : " + Customer_name);
        output.print("\n Card Number : ******" + lastFourNum);
        

        if (DesignerName.equalsIgnoreCase("Mohammed Ahmed")) {
            amount = 4670;
            tax = (int) (amount * 0.015);
            total = amount + tax;
            result = "\n Designer Name : " + DesignerName +"\n Sub Total: " + amount + "$" + "\n Tax Rate: 15% , " + tax + "$" + "\n Total: " + total + "$";
            output.print(result);
            
        } else if (DesignerName.equalsIgnoreCase("Joud Hani")) {
            amount = 5300;
            tax = (int) (amount * 0.015);
            total = amount + tax;
            result = "\n Designer Name : " + DesignerName +"\n Sub Total: " + amount + "$" + "\n Tax Rate: 15% , " + tax + "$" + "\n Total: " + total + "$";
            output.print(result);

        } else if (DesignerName.equalsIgnoreCase("Adam Khalid")) {
            amount = 2600;
            tax = (int) (amount * 0.015);
            total = amount + tax;
            result = "\n Designer Name : " + DesignerName +"\n Sub Total: " + amount + "$" + "\n Tax Rate: 15% , " + tax + "$" + "\n Total: " + total + "$";
            output.print(result);
            
        } 

        
        
        
        return result;

    }
    

}