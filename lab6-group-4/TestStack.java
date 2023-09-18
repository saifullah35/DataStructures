/**
 * Tests the Stack<E> class.
 * 
 * @author Prof. White
 * @version Spring 2018
 */
public class TestStack
{
    public static void main(String[] args)
    {
        int score = 0;
        int maxScore = 0;
        Stack<String> stack = new Stack<String>();
        
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
        for(int i = 1; i < 11; i++){
            if(stack.search(i + "") == i) 
                score++;
        }
        maxScore += 10;
        
        if(stack.toString().equals("1 2 3 4 5 6 7 8 9 10")) score++;
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
