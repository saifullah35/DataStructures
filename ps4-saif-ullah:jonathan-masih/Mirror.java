import java.util.Scanner;

/**
 * This program prompts the user for a line of
 * input and then prints the input mirrored.
 * For example, if the input is
 * 
 * ABCD
 * 
 * the output would be
 * 
 * ABCDDCBA
 * 
 * For credit, this program must use a stack to accomplish
 * its task.
 *
 * @author Saif Ullah and Jonathan Masih
 * @version Spring 2021
 */
public class Mirror
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter an input: ");
        String input = keyboard.nextLine();

        Stack<Character> newStack = new Stack<Character>(input.length() * 2);
        for(int i = 0 ;  i < input.length() ; i++){
            newStack.push(input.charAt(i));
        }

        for(int i = input.length() - 1  ;  i >= 0 ; i--){
            newStack.push(input.charAt(i));
        }

        System.out.println("after the mirror:  \n" + newStack.toString());

    }
}
