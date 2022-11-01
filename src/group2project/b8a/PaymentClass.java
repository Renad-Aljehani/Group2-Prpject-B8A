
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
    int amount = (int) (Math.random() * 10000) + 1;
    String Account_number;
    int tax = (int) (amount * 0.015);
    int total = amount + tax;
    
    public void Payment(File outputFile, PrintWriter output, Scanner input, String Customer_name, String Account_number, String DesignerName){
        
       
         
         
         
         char [] Acount = Account_number.toCharArray();
         int size = Acount.length;
         String lastFourNum = "";
         for(int i = size-1; i > size - 5 ; i--){
             lastFourNum = Acount[i] + lastFourNum ;
         }
         
         
         output.print("\n");
         output.print("\n");
         output.print("---------------------------------------------------------------");
         output.print("\n                       Payment Information                    ");
         output.print("\n---------------------------------------------------------------");
         output.print("\n");
         output.print("\n Customer Name : " + Customer_name);
         output.print("\n Card Number : ******" + lastFourNum);
         output.print("\n Designer Name : " + DesignerName);
         output.print("\n Sub Total: " + amount + "$");
         output.print("\n Tax Rate: 15% , " + tax + "$");
         output.print("\n Total: " + total + "$");
         
         
         
        
        
        
    }
    
    
    
}
