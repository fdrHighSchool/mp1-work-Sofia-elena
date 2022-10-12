
/**
 * Write a description of class RNG here.
 *
 * @author Sofia Diaz
 * @version October 6, 2022
 */
import java.util.Random;
import java.util.Scanner;
public class RNG
{
    public static void main(String[] args) {
    // pick a random number
   Random random = new Random();
   Integer guess;
   Scanner s = new Scanner(System.in);
   System.out.println("What mode do you want? \nEasy \nMedium \nHard");
   String mode = s.nextLine();
   if (mode.equals("Easy")){
     
       int number = random.nextInt(10) + 1;
    System.out.println("I am thinking of a number between 1 and 10. Can you guess it?");
     guess = s.nextInt();
     System.out.println("Your guess was "+guess);
     if (guess == number){
        System.out.println("You are correct!");
    }
    else{
    Integer numberOff;
    numberOff = (guess-number);
    System.out.print("Your guess was "+Math.abs(numberOff)+" off");
    System.out.print("The number was "+number);
    }   
   }
   else if (mode.equals("Medium")){
      
       int number = random.nextInt(50) + 1; 
      System.out.println("I am thinking of a number between 1 and 50. Can you guess it?");
      guess = s.nextInt();
      System.out.println("Your guess was "+guess);
      if (guess == number){
        System.out.println("You are correct!");
    }
    else{
    Integer numberOff;
    numberOff = (guess-number);
    System.out.print("Your guess was "+Math.abs(numberOff)+" off");   
    System.out.print("The number was "+number);
    }   
   }
   else{
    
       int number = random.nextInt(100) + 1;
       System.out.println("I am thinking of a number between 1 and 100. Can you guess it?");
   guess = s.nextInt();
   System.out.println("Your guess was: "+guess);
   System.out.println("The number I was thinking of was: "+number);
    if (guess == number){
        System.out.println("You are correct!");
    }
    else{
    Integer numberOff;
    numberOff = (guess-number);
    System.out.print("Your guess was "+Math.abs(numberOff)+" off");    
    System.out.print("The number was "+number);
    }   
   }
  }
}
