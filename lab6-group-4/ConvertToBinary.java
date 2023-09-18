import java.util.Scanner;
/**
 * Convert a positive decimal integer to its binary equivalent using the division method.
 *
 * @author (Saif Ullah and Jonathan Masih)
 * @version (April 26, 2021)
 */
public class ConvertToBinary
{
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter an integer in [0 , 2147483647] or done to end:");
        String input = keyboard.nextLine();
        while(!input.equalsIgnoreCase("done")){
            System.out.println("The equivalent binary number is:  " + binaryCon(Integer.parseInt(input)));  
            System.out.println("Press Enter to contine");

            System.out.print("\nEnter an integer in [0 , 2147483647] or done to end: ");
            input = keyboard.nextLine();
        }
    }

    public static Stack binaryCon(int num){
        Stack<Integer> newStack = new Stack<Integer>();
        while(num > 0){
           newStack.push(num % 2);
           num = num / 2;
        
        }
        return newStack;
    }
}
