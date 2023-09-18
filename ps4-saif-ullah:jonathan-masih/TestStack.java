/**
 * This program tests the Stack<E> class.
 * 
 * DO NOT EDIT THIS PROGRAM.
 * 
 * @author Prof. White
 * @version Spring 2019
 */
public class TestStack
{
    public static void main(String[] args)
    {
        int score = 0;
        int maxScore = 0;
        Stack<String> stack = new Stack<String>(10);

        if(stack.peek() == null) score++;
        if(stack.isEmpty()) score++;
        stack.push("A");
        if(!stack.isEmpty()) score++;
        if(stack.peek().equals("A")) score++;
        if(stack.pop().equals("A")) score++;
        if(stack.isEmpty()) score++;
        if(stack.peek() == null) score++;
        maxScore += 7;

        for(int i = 10; i > 0; i--){
            stack.push(i + "");
        }
        for(int i = 10; i > 0; i--){
            if(stack.search(i + "") == 10 - i) 
                score++;
        }
        maxScore += 10;

        if(stack.toString().equals("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n")) score++;
        stack.clear();
        if(stack.isEmpty()) score++;
        if(stack.toString().equals("")) score++;
        maxScore += 3;

        if(maxScore == score){
            System.out.println("Congratulations!");
        } else {
            System.out.println("You have more work to do.  You can do it!");
        }
    }
}
