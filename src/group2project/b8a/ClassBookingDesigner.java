
package group2project.b8a;

import java.io.File;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

class ClassBookingDesigner {
    //Date Object
    Date theDate=new Date();
    //contact numbers 
    String contactMohammed="+966 545105041";
    String contactJoud="+966 545129041";
    String contactAdam="+966 548106661";
    
    public void BookDesigner(File outputFile,PrintWriter output, Scanner input,String DesignerName){
        //Generate Random Numbers between 1 and 10 
        int random=(int)(Math.random()*10)+1;
        //conditions
        if(DesignerName.equalsIgnoreCase("Mohammed Ahmed")){
           output.print("-You have sucsscfual booking with Mohaamed Ahmed-\n To contact "+contactMohammed+"\n\n order number #"+random+",Date of order: <"+theDate+">");
      
        
        }
        else if(DesignerName.equalsIgnoreCase("Joud Hani")){
           output.print("-You have sucsscfual booking with Joud Hani-\n To contact "+contactJoud+"\n\n order number #"+random+",Date of order: <"+theDate+">");
        
        }
         else if(DesignerName.equalsIgnoreCase("Adam Khalid")){
           output.print("-You have sucsscfual booking with Adam Khalid-\n To contact "+contactAdam+"\n\n order number #"+random+",Date of order: <"+theDate+">");
         
         }
        else{
           output.print("Sorry we do not have this designer!");
        
        }
    
    }
    
    
    
    
}
