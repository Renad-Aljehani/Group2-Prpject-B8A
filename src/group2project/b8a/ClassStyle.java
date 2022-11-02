package group2project.b8a;

import java.io.*;
import java.util.*;

public class ClassStyle {

    public void ChooseStyle(File outputFile, PrintWriter output, Scanner input, String Style) {

        switch (Style) {

            case "Minimalist":
                output.println("You have chosen the minimalist style");
                break;

            case "Modren":
                output.println("You have chosen the modren style");
                break;

            case "Bonhomie":
                output.println("You have chosen the bonhomie style");
                break;
        }
    }
}
