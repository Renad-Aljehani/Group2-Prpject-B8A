package group2project.b8a;

import java.io.*;
import java.util.*;

public class Group2ProjectB8A {

    public static void main(String[] args) throws FileNotFoundException , IOException{
    
    //Creat output file
        File outputFile = new File("output.txt");
     //Creat a filewritter object called fileWtitter
        FileWriter fileWtitter= new FileWriter(outputFile);    
    //Creat a printwritter object called output
        PrintWriter output= new PrintWriter(fileWtitter);
     //Creat scanner to get input from consol called scan
     Scanner scan = new Scanner (System.in);
     
    //Style menu    
        output.println("                      wellcome");
        output.println("---------------------------------------------------");
        output.println("Style Menu:");
        output.println("- Minimalist ");
        output.println("- Modren ");
        output.println("- Bonhomie ");
        output.println("--------------------------------------------------");
          System.out.println("Your Style:");
          String Style = scan.next();
       
    //Calling ChooseStyle method
        ClassStyle Object1= new ClassStyle();
        Object1.ChooseStyle(outputFile, output, scan, Style);
       
      
    //closing the files
       
        output.flush();
        output.close();
     
  
       
    }
    }
    

