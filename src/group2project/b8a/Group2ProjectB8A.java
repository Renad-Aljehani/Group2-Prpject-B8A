package group2project.b8a;

import java.io.*;
import java.util.*;

public class Group2ProjectB8A {

    public static void main(String[] args) throws FileNotFoundException {
        
    //Creat input file 
        File InputFile = new File("input.txt"); 
    //init input streams
        Scanner input= new Scanner(InputFile);
        
    //Creat output file
        File outputFile = new File("output.txt");
    //Creat a printwritter to write to the output file
        PrintWriter output= new PrintWriter(outputFile);
       
    //Style menu    
        output.println("                      wellcome");
        output.println("---------------------------------------------------");
        output.println("Choose Your Style:");
        output.println("- Minimalist ");
        output.println("- Modren ");
        output.println("- Bonhomie ");
        output.println("--------------------------------------------------");
         
    //Calling ChooseStyle method
        ClassStyle Style= new ClassStyle();
        Style.ChooseStyle(outputFile, InputFile, output, input);
       
       
        
    //closing the files
        input.close();
        output.flush();
        output.close();
     
  
       
    }
    }
    

