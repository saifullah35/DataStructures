import java.util.Scanner;

/**
 * Evaluate expressions written in postfix notation.
 *
 * @author (Saif Ullah and Jonathan Masih)
 * 
 * @version (April 26, 2021)
 */
public class PostFixCalculator
{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a postfix expression or DONE to end: ");
        String input = keyboard.nextLine();
        while(!input.equalsIgnoreCase("done")){
            System.out.println("The expression: " + input + " evaluates to " + calculator(input));  
            System.out.println("Press Enter to contine"); 

            System.out.print("\nEnter a postfix expression or DONE to end: ");
            input = keyboard.nextLine();
        }
    }

    public static double calculator(String expression){
        Stack<Integer> newStack = new Stack<Integer>();
        String[] data =  expression.split(" ");

        for(int i = 0; i < data.length; i++){

            try{
                int a = Integer.parseInt(data[i]);
                newStack.push(a);
            }catch (NumberFormatException nfe ){
                //STRING IS NOT A NUMBER 
                int first = newStack.pop();
                int second = newStack.pop();
                if(data[i].equals( "+")){
                    newStack.push(second + first);
                } else if (data[i].equals( "-")){
                    newStack.push(second - first);
                } else if (data[i].equals("/")){
                    newStack.push(second / first);
                } else if (data[i].equals("*")){
                    newStack.push(second * first);
                }
            }

        }

        return newStack.pop();
    }
}
