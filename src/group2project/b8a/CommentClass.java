package group2project.b8a;

import java.io.*;
import java.util.*;

/**
 *
 * @author Renad Aljehani
 */
public class CommentClass {

    String designerName;
    String experience;
    int rate;

    public void writeComment(File outputFile, PrintWriter output, Scanner input, String designerName, String experience, int rate) {

        if (rate < 0 || rate > 5) {
            System.out.print(" Please try again!(rate from 0-5)");
            System.out.print("\n Rate the designer work: ");
            rate = input.nextInt();
            System.out.print("\n---------------------------------------------------------------");
            System.out.print("\n                    --Thanks for your comment--            ");
            System.out.print("\n---------------------------------------------------------------");
        }
        output.print("\n");
        output.print("\n");
        output.print("---------------------------------------------------------------");
        output.print("\n                       <<Clients Comments>>                    ");
        output.print("\n---------------------------------------------------------------");
        output.print("\n");
        output.print("\n Designer Name: " + designerName);
        output.print("\n How was your experience? " + experience);
        output.print("\n Rate the designer work: " + rate);
        output.print("\n---------------------------------------------------------------");
        output.print("\n                    --Thanks for your comment--            ");
        output.print("\n---------------------------------------------------------------");
    }
}
