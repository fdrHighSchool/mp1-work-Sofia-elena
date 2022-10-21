import java.util.Scanner;
import java.util.Random;
public class UserName {
  //beginning of main method//
    public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);
     
    // get personal info from user//
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("Enter your favorite number:");
    String favNum = s.nextLine();
    System.out.print("Are you a teacher? Enter yes or no:");
    String studentTeacher = s.nextLine().toLowerCase();
    //student or teacher//
    if (studentTeacher.equals("yes")){
    System.out.println("Hello " + initialize(firstName) + lastName +favNum+"@schools.nyc.gov");
    }
    else{
      System.out.println("Hello " + firstName + initialize(lastName) +favNum+"@nycstudents.net");  
     }
     System.out.println("How long would you like your password to be? Type the number:");
     int length = s.nextInt();
    createPassword(length);
    s.close();
 }
    public static String createPassword(int length){
       String password = "";
       
        for (int i = 0; i<length; i++){
           int capital= (char)(int)(Math.random()*(122-33+1)+ 33);
           char c = (char)(capital);
           password+= c;
        }
       System.out.println("Your password is " + password);
    //purpose: send back a random string of numbers, upper/lowercase letters//
    //convert to char = character c = (char)i;
    // add char to password string
    //Input: length of password (int)//
    //generate random number
    //65-90 capital letters
    //97-122 lowercase
    //33-47 special symbols
    //Return: String 
        
        
       return password; 
    }//end of createPassword method//
     
    public static String initialize(String n) {
    return n.substring(0, 1);
  } // end initialize method
  } // end main method//