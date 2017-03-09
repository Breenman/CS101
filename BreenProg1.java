//Name:                    David Breen
//filename:                DisplayWindow.java
//Due Date:                1/30/2017
//Program description      it makes a blank window
//Input                    
//Output:
//Errors:
//-----------------------------------------------------------------------------------------------------

//---------------------Import Statements--------------------------------------------------------

import javax.swing.*;         //package for JFrame class - javax.swing.JFrame
import java.util.*;           //package for Scanner class - java.util.Scanner
import java.text.*;           //package for DecimalFormat calss - 
//---------------------------------------------------------------------------------------------
//Class Name: DisplayWindow
//Description: Leaving blank for now
//----------------------------------------------------------------------------------------------

public class BreenProg1       //name of the file, and name of the class
{
   //--------------------------------------------------------------------------------------------
   //Method Name: main
   //Description: Leaving blank for now
   //--------------------------------------------------------------------------------------------
   
   public static void main(String[] args)    //the main method
   {
      //-----------local Constants---------------------------------------------------------------
      
      /*these are the local constants for the object these will be used throughout
      the program and their value is meant not to change*/
      
      String dash = new String("-");      //this is the constant for a dash carachter
      
      String tab = new String("\t");      //this is the constant for a tab
     
      String newl = new String("\n");     //this is the constant for a new line
      
      double Ftax = 0.3;                  //this is the constant for the precentage that federal
                                          // tax takes out of the paycheck
     
      double Stax = 0.05;                 //this is the constant for the social security tax
     
      DecimalFormat pattern = new DecimalFormat("0.00");    //this is the format that will be 
                                                            //used for returning a value in the
                                                            // print line
      
      //-----------Local Variables---------------------------------------------------------------
      
      String lastname = new String();           //this line creates an instance for the string
                                                //"lastname" and initializes it
      
      int social ;                              // this line creates a variable for an integer
                                                //that is used to hold the social security tax
      
      double hoursw ;                           //this creates a double that is used to store 
                                                //the number of hours worked by the employee 
                                                //(this is mainly used for calculations)
      
      double payrate ;                          //this creates a double that is used to store the
                                                //payrate that the user input (this is mainly 
                                                //used for calculations)
      
      Scanner scanner = new Scanner(System.in);
      
      double socialtax ;
      
      String strlastname = new String();        //this is the string that holds the last name 
                                                //information of the input from the user that 
                                                //was collected from the user
      
      String strsocial = new String ();         //this is the string that holds the social security number
                                                // information of the input from the user that was collected 
                                                //from the user
      
      String strhoursw = new String();          //this is the string that holds the hours worked information
                                                //of the input from the user that was collected from the user
      
      String strpayrate = new String();         //this is the string that holds the payrate information of the 
                                                //input from the user that was collected from the scanner
      
      String socialform = new String();         //this is the string that holds the value for the formatted
                                                //social security tax value
      
      double netpay ;                           //this creates a doubble that stores the value of the netpay
                                                //of the employee
      
      double federaltax ;                       //this creates a doubble that stores the federal tax ammount
                                                //that is deducted from the employee
      
      double grosspay ;                         //this creates a doubble that stores the gross pay that the
                                                //employee made that time period
      
      //-----------Objects------------------------------------------------------------------------------
      
      System.out.print("Employee #1 please enter your last name: ");
      
      strlastname = scanner.next();
      
     // System.out.print(lastname);
     
     System.out.print("please enter your SS#: ");
      
      strsocial = scanner.next();
      
     // System.out.print(lastname);
     
     System.out.print("please enter the number of hours you worked: ");
      
      strhoursw = scanner.next();
      
     // System.out.print(lastname);
     
     System.out.print("please enter your hourly rate of pay: ");
      
      strpayrate = scanner.next();
      
     // System.out.print(hoursw);
     
     social = Integer.parseInt(strsocial);
     
     hoursw = Double.parseDouble(strhoursw);
     
     payrate = Double.parseDouble(strpayrate);
     
     socialform = strsocial.substring(0,3) + dash + strsocial.substring(3,5) + dash + strsocial.substring(5,9);
     
     
     
     
     
     grosspay = payrate * hoursw ;
     
   //  System.out.println(grosspay);
     
     socialtax = grosspay * Stax ;
     
     federaltax = grosspay * Ftax ;
     
     netpay = (grosspay - federaltax) - socialtax ;
     
    // System.out.println(netpay);
    
    
    System.out.println(tab + tab + tab + "Monroe Community College" + newl + tab + tab + tab + "  1000 E. Henriett Rd." + newl + tab + tab + tab + "Rochester, New York 14623");
   
    
    System.out.println(newl +"Employee SS#: " + socialform + tab + tab + "Employee Name: " + strlastname);
    
    System.out.println(newl + "Rate of Pay:" + tab + tab + tab + tab + tab + tab + "Hours Worked:");
    
    System.out.println("$" + pattern.format(payrate) + tab + tab + tab + tab + tab + tab + tab + tab + pattern.format(hoursw));
    
    System.out.println(newl + "Social Security Tax:" + tab + tab + tab + tab + "Federal Tax:");
    
    System.out.println("$" + pattern.format(socialtax) + tab + tab + tab + tab + tab + tab + tab + tab + tab + pattern.format(federaltax));
    
    System.out.println(newl +"Gross Pay: $" + pattern.format(grosspay) + tab + tab + tab + tab + "Net Pay: $" + pattern.format(netpay));
    
    System.out.println(" ***********************************************************");
    
//-------------------------------------------------------------------------------------------------------------------------------------------------

System.out.print("Employee #2 please enter your last name: ");
      
      strlastname = scanner.next();
      
     // System.out.print(lastname);
     
     System.out.print("please enter your SS#: ");
      
      strsocial = scanner.next();
      
     // System.out.print(lastname);
     
     System.out.print("please enter the number of hours you worked: ");
      
      strhoursw = scanner.next();
      
     // System.out.print(lastname);
     
     System.out.print("please enter your hourly rate of pay: ");
      
      strpayrate = scanner.next();
      
     // System.out.print(hoursw);
     
     social = Integer.parseInt(strsocial);
     
     hoursw = Double.parseDouble(strhoursw);
     
     payrate = Double.parseDouble(strpayrate);
     
     socialform = strsocial.substring(0,3) + dash + strsocial.substring(3,5) + dash + strsocial.substring(5,9);
     
     
     
     
     
     grosspay = payrate * hoursw ;
     
   //  System.out.println(grosspay);
     
     socialtax = grosspay * Stax ;
     
     federaltax = grosspay * Ftax ;
     
     netpay = (grosspay - federaltax) - socialtax ;
     
    // System.out.println(netpay);
    
    
    System.out.println(tab + tab + tab + "Monroe Community College" + newl + tab + tab + tab + "  1000 E. Henriett Rd." + newl + tab + tab + tab + "Rochester, New York 14623");
   
    
    System.out.println(newl +"Employee SS#: " + socialform + tab + tab + "Employee Name: " + strlastname);
    
    System.out.println(newl + "Rate of Pay:" + tab + tab + tab + tab + tab + tab + "Hours Worked:");
    
    System.out.println("$" + pattern.format(payrate) + tab + tab + tab + tab + tab + tab + tab + tab + pattern.format(hoursw));
    
    System.out.println(newl + "Social Security Tax:" + tab + tab + tab + tab + "Federal Tax:");
    
    System.out.println("$" + pattern.format(socialtax) + tab + tab + tab + tab + tab + tab + tab + tab + tab + pattern.format(federaltax));
    
    System.out.println(newl +"Gross Pay: $" + pattern.format(grosspay) + tab + tab + tab + tab + "Net Pay: $" + pattern.format(netpay));
    
   
    
      
      
      
      
  
                                 
      //----------------------------------method body---------------------------------------------------------------
      
     
  
   }//End Main method
   
}//End class DisplayWindow
      
                                      
                                 
