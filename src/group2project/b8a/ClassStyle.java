package group2project.b8a;

import java.io.*;
import java.util.*;

public class ClassStyle {

    public static String ChooseStyle(File outputFile,FileWriter fileWtitter, PrintWriter output, Scanner input, String Style) {

       String Result = null;
           switch (Style){
               case "Minimalist":
                Result="You have chosen the minimalist style";
                output.println(Result);
           break;
           case "Modren":
               Result="You have chosen the modren style";
                output.println(Result);
           break;
           case "Bonhomie":
                  Result="You have chosen the bonhomie style";
                 output.println(Result);
                break;
           }
        return Result;
       
    }
    }

