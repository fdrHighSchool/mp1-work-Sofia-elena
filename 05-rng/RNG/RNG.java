
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
   int number = random.nextInt(100) + 1;
   Integer guess;
   Scanner s = new Scanner(System.in);
   System.out.println("What mode do you want?\nEasy \nMedium \nHard");
   String mode = s.nextLine();
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
    }
   
  
    
  }
}
