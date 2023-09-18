/**
 * Tests the Queue<E> class.
 * 
 * @author Prof. White
 * @version Spring 2018
 */
public class TestQueue
{
    public static void main(String[] args)
    {
        int score = 0;
        int maxScore = 0;
        Queue<String> queue = new Queue<String>();
        
        if(queue.getFront() == null) score++;
        if(queue.isEmpty()) score++;
        queue.enqueue("A");
        if(!queue.isEmpty()) score++;
        if(queue.getFront().equals("A")) score++;
        if(queue.dequeue().equals("A")) score++;
        if(queue.isEmpty()) score++;
        if(queue.getFront() == null) score++;
        maxScore += 7;
        
        for(int i = 1; i < 11; i++){
            queue.enqueue(i + "");
        }        
        if(queue.toString().equals("1 2 3 4 5 6 7 8 9 10")) score++;
        for(int i = 1; i < 11; i++){
            if(queue.dequeue().equals(i + ""))score++;
        }
        if(queue.toString().equals("")) score++;
        for(int i = 1; i < 11; i++){
            queue.enqueue(i + "");
        }     
        queue.clear();
        if(queue.isEmpty()) score++;
        if(queue.toString().equals("")) score++;
        maxScore += 14;
        
        if(maxScore == score){
            System.out.println("Congratulations!");
        } else {
            System.out.println("You have more work to do.  You can do it!");
        }
    }
}
