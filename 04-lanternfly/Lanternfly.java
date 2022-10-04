
/**
 * Write a description of class Lanternfly here.
 *
 * @author Sofia Diaz
 * @version September 29th, 2022
 */
import java.util.Scanner;
public class Lanternfly
{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("The lanternfly is an invasive species and ");
        System.out.print("is a threat to our trees and plants.");
        
        System.out.print("How many did you squash this summer?");
        int num = input.nextInt();
        
        if (num < 25) {
            System.out.println("I honestly expected better from you.");
        }
        else {
            System.out.println("You have done your duty for our planet, thank you! <3");
        }
    }
    
    }
