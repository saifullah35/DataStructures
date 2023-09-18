
/**
 * Tests the Lab 5 implementation of the DoublyLinkedList class.
 * 
 * @author Prof. White
 * @version Fall 2019
 */
public class Driver
{    
    public static void testDoublyLinkedList()
    {
        DoublyLinkedList<Integer> myDLL = new DoublyLinkedList<Integer>();
        int score = 0;
        int maxScore = 0;

        if(myDLL.getSize() == 0) score++;
        if(myDLL.toString().equals("< >")) score++;
        if(myDLL.toStringReverse().equals("< >")) score++;
        myDLL.addAtStart(0);
        if(myDLL.getSize() == 1) score++;
        if(myDLL.elementAt(0) == 0) score++;
        if(myDLL.toString().equals("< 0 >")) score++;
        if(myDLL.toStringReverse().equals("< 0 >")) score++;
        maxScore += 7;

        myDLL.addAtStart(-1);
        myDLL.addAtStart(-2);
        if(myDLL.getSize() == 3) score++;
        if(myDLL.elementAt(0) == -2) score++;
        if(myDLL.elementAt(1) == -1) score++;
        if(myDLL.elementAt(2) == 0) score++;
        if(myDLL.toString().equals("< -2 -1 0 >")) score++;
        if(myDLL.toStringReverse().equals("< 0 -1 -2 >")) score++;
        maxScore += 6;

        myDLL.addAtEnd(1);
        myDLL.addAtEnd(2);
        if(myDLL.getSize() == 5) score++;
        if(myDLL.elementAt(3) == 1) score++;
        if(myDLL.elementAt(4) == 2) score++;
        if(myDLL.toString().equals("< -2 -1 0 1 2 >")) score++;
        if(myDLL.toStringReverse().equals("< 2 1 0 -1 -2 >")) score++;
        maxScore += 5;

        myDLL.deleteFromStart();
        if(myDLL.getSize() == 4) score++;
        if(myDLL.toString().equals("< -1 0 1 2 >")) score++;
        if(myDLL.toStringReverse().equals("< 2 1 0 -1 >")) score++;
        maxScore += 3;

        myDLL.deleteFromEnd();
        if(myDLL.getSize() == 3) score++;
        if(myDLL.toString().equals("< -1 0 1 >")) score++;
        if(myDLL.toStringReverse().equals("< 1 0 -1 >")) score++;
        maxScore += 3;

        myDLL.deleteAtIndex(1);
        if(myDLL.getSize() == 2) score++;
        if(myDLL.toString().equals("< -1 1 >")) score++;
        if(myDLL.toStringReverse().equals("< 1 -1 >")) score++;
        myDLL.deleteAtIndex(1);
        if(myDLL.getSize() == 1) score++;
        if(myDLL.toString().equals("< -1 >")) score++;
        if(myDLL.toStringReverse().equals("< -1 >")) score++;
        myDLL.deleteAtIndex(0);
        if(myDLL.getSize() == 0) score++;
        if(myDLL.toString().equals("< >")) score++;
        if(myDLL.toStringReverse().equals("< >")) score++;
        maxScore += 9;

        try{
            myDLL.deleteFromStart();
        } catch (java.util.NoSuchElementException nsee){
            score++;
        }
        try{
            myDLL.deleteFromEnd();
        } catch (java.util.NoSuchElementException nsee){
            score++;
        }
        try{
            myDLL.elementAt(0);
        } catch (java.util.NoSuchElementException nsee){
            score++;
        }
        try{
            myDLL.deleteAtIndex(0);
        } catch (java.util.NoSuchElementException nsee){
            score++;
        }
        maxScore += 4;

        for(int i = 1000; i > 0; i--)
        {
            myDLL.addAtStart(i);
        }
        try{
            myDLL.elementAt(-1);
        } catch (java.lang.IndexOutOfBoundsException iobe){
            score++;
        }
        try{
            myDLL.deleteAtIndex(-1);
        } catch (java.lang.IndexOutOfBoundsException iobe){
            score++;
        }
        try{
            myDLL.elementAt(1000);
        } catch (java.lang.IndexOutOfBoundsException iobe){
            score++;
        }
        try{
            myDLL.deleteAtIndex(1000);
        } catch (java.lang.IndexOutOfBoundsException iobe){
            score++;
        }
        maxScore += 4;
        
        if(maxScore == score) {
            System.out.println("Congratulations! You have passed all of the tests.");
        } else {
            System.out.println("Your score = " + score);
            System.out.println("Max score = " + maxScore);
            System.out.println("You still have some work to do.  You can do it!");
        }
    }
}