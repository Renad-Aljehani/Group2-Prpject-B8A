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
    Double rate;

    public CommentClass() {

    }

    public CommentClass(String designerName, String experience, double rate) {
        this.designerName = designerName;
        this.experience = experience;
        this.rate = rate;
    }

    public Double getRate() {
        return rate;
    }

    public void writeComment(File outputFile, PrintWriter output, Scanner input, String designerName, String experience, Double rate) {

        if (rate < 0.0 || rate > 5.0) {
            System.out.print(" Please try again!(rate from 0-5)");
            System.out.print("\n Rate the designer work: ");
            rate = input.nextDouble();
            System.out.print("\n---------------------------------------------------------------");
            System.out.print("\n                    --Thank you--            ");
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
        output.print("\n                    --Thank you--            ");
        output.print("\n---------------------------------------------------------------");
    }
}
