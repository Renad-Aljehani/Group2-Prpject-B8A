package group2project.b8a;

import java.io.*;
import java.util.*;

public class Group2ProjectB8A {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //Creat output file
        File outputFile = new File("output.txt");
        //Creat a filewritter object called fileWtitter
        FileWriter fileWtitter = new FileWriter(outputFile);
        //Creat a printwritter object called output
        PrintWriter output = new PrintWriter(fileWtitter);
        //Creat scanner to get input from consol called scan
        Scanner scan = new Scanner(System.in);

        /////////////////////////////////////////////////////////////////////////////
        
        //Style menu  
        output.print("---------------------------------------------------------------");
        output.print("\n                    <<Welcome to IDESIGN>>                        ");
        output.print("\n---------------------------------------------------------------\n");
        output.println("Style Menu:");
        output.println("- Minimalist ");
        output.println("- Modern ");
        output.println("- Bonhomie ");
        output.println("---------------------------------------------------------------");
        System.out.print("Enter Your Style:");
        String Style = scan.next();
       
        //Calling ChooseStyle method
        ClassStyle Object1 = new ClassStyle();
        Object1.ChooseStyle(outputFile, fileWtitter, output, scan, Style);
        
        /////////////////////////////////////////////////////////////////////////////
        
        //Designer Menu   
        output.print("\n---------------------------------------------------------------");
        output.print("\n                         Our Designers                         \n");
        output.println("---------------------------------------------------------------");
        output.println("Choose One Of The Designers:");
        output.print(" -Mohammed Ahmed\n");
        output.print(" -Joud Hani \n");
        output.print(" -Adam Khalid \n");
        output.println("---------------------------------------------------------------");
        System.out.print("please enter your designer choise: ");
        
        //Get user whole inputs 
        String DesignerName = scan.next();
        DesignerName = DesignerName + scan.nextLine();
        
        //Calling BookDesigner method 
        ClassBookingDesigner Book = new ClassBookingDesigner();
        Book.BookDesigner(outputFile,output, scan, DesignerName);

        
        output.print("\n");
        ///////////////////////////////////////////////////////////////////////////////
        
        // payment method 
        System.out.print("\n ");
        System.out.print("---------------------------------------------------------------");
        System.out.print("\n                       Fill the Information to Pay              ");
        System.out.print("\n---------------------------------------------------------------");
        System.out.print("\n please write your name: ");
        String userName = scan.nextLine();
        System.out.print("\n please write your Card Number: ");
        String userCard = scan.nextLine();

        //Calling payment method 
        PaymentClass pay = new PaymentClass();
        pay.Payment(outputFile, output, scan, userName, userCard, DesignerName);

        ///////////////////////////////////////////////////////////////////////////////
         
        //Writing Comment method
        System.out.print("\n ");
        System.out.print("---------------------------------------------------------------");
        System.out.print("\n                       <<Clients Comments>>             ");
        System.out.print("\n---------------------------------------------------------------");
        System.out.print("\n The designer you worked with is " + DesignerName);
        System.out.print("\n How was your experience? ");
        String experience = scan.nextLine();
        System.out.print(" Rate the designer work: ");
        Double rate = scan.nextDouble();

        //Calling writeComment method
        CommentClass comment = new CommentClass();
        comment.writeComment(outputFile, output, scan, DesignerName, experience, rate);
        
        output.print("\n");
        ///////////////////////////////////////////////////////////////////////////////
         
        //closing the files
        output.flush();
        output.close();

    }
}
