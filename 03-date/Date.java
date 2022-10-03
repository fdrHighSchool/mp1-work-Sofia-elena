
/**
 * Write a description of class Date here.
 *
 * @author: Sofia Diaz
 * @version: September 28th, 2022
 */
import java.util.Scanner;//Import the scanner class
class Date{
public static void main(String[]args) {
   Scanner s = new Scanner(System.in);
   
   System.out.print("What day of the week is it?");
   String weekDay = s.nextLine(); 
   
   System.out.print("What month is it?");
   String month = s.nextLine();
   
   System.out.print("What year is it?");
   String year = s.nextLine();
   
   System.out.print("What is the day of the month?");
   String date = s.nextLine();
   
   System.out.println("American format: The date is "+weekDay+", "+month+" "+date+", "+year);
   System.out.println("European format: The date is "+weekDay+" "+date+" "+month+" "+year);
}// end of main method//
}// end of Date class//
