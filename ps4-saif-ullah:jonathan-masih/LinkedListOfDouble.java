/**
 * This class stores double values in a singly linked list.  
 * 
 * Note:  The add method adds elements to the END of the list.
 * 
 * Complete the methods that have the comment "YOUR CODE HERE."
 * You must implement recursive solutions for credit.
 * 
 * @author (Saif Ullah and Jonathan Masih)
 * @version (May 3, 2021)
 */
public class LinkedListOfDouble 
{
    // first node in linked list, null if list is empty
    private Node first;

    // last node in linked list, null if list is empty
    private Node last;

    // number of elements in list
    private int currentSize; 

    /**
     * Inner class Node
     * 
     * All instance variables of an inner class can be accessed directly in 
     * the outer class.
     */
    private class Node 
    {
        // data stored at the node
        private double data; 

        // link to next node, null if last node in list
        private Node next; 
    }

    /**
     * Initializes an empty list. 
     */
    public LinkedListOfDouble() 
    {
        currentSize = 0;
        first = last = null;
    }

    /**
     * Mutates the list by multiplying all of the values in the list
     * by the input value.
     * 
     * @param mult The multiplier.
     */
    public void recursiveMultiply(int mult)
    {
        recursiveMultiply(first, mult);
    }

    /**
     * Mutates the list by multiplying all of the values in the list
     * starting at node n by the input value.
     * 
     * @param n The first node to mutate.
     * @param mult The multiplier.
     */
    private void recursiveMultiply(Node n, int mult)
    {
        if(n == null){
            
        }else{
            n.data = n.data * mult;
            recursiveMultiply(n.next, mult);
        }
    }
    
    /**
     * Returns the count of the number of elements in the linked sequence
     * whose value is larger than the input value.
     * 
     * @param num The value the node must be larger than to be counted.
     * @return The count of the number of elements in the linked sequence
     * whose value is larger than the input value.
     */ 
    public int recursiveCountLarger(double num)
    {
        int c = recursiveCountLarger(first, num);
        return c;
    }

    /**
     * Returns the count of the number of elements in the linked 
     * sequence whose value is larger than the input value, beginning
     * with node n.
     * 
     * @param n The first node to consider.
     * @param num The value the node must be larger than to be counted.
     * @return The count of the number of elements in the linked sequence
     * whose value is larger than the input value beginning with node n.
     */  
    private int recursiveCountLarger(Node n, double num) 
    {
        if(n == null){
            return 0;  
        } else{
            if(n.data > num){
                return 1 + recursiveCountLarger(n.next, num);
            } else{
                return recursiveCountLarger(n.next, num);
            }
        }
    }

    /** 
     * Adds the element to the end of the list.
     * 
     * @param element The element to be added.
     */
    public void add (double element) 
    {
        Node n = new Node( );
        n.data = element;
        if (currentSize == 0) { 
            first = last = n;
        } else {              
            last.next = n;
            last = n;
        }
        currentSize++;
    }

    /** 
     * Returns the element at position pos in the list.
     * pos must be in the range [0...currentSize-1]. 
     * 
     * If it is not, then the IndexOutOfBounds exception
     * is thrown.
     * 
     * @param pos the position of the desired element
     * @return the indicated element.
     * @throws IndexOutOfBoundsException if pos < 0 or pos >= currentSize. 
     */
    public double get(int pos) 
    {
        if ((pos < 0) || (pos >= size())){
            throw new IllegalArgumentException("Valid range of pos is 0 <= pos < size()");
        }

        Node c = first;
        for (int i = 1; i <= pos; i++){
            c = c.next;
        }

        return c.data;
    }

    /**
     * Returns the number of elements in the list
     * @return the number of list elements
     */
    public int size() {
        return currentSize;
    }

    /** 
     * Valid positions for elements in the list range from 0 to currentSize-1. This method checks
     * that pos is valid. If pos is not in this range, then it throws the IndexOutOfBounds 
     * exception. Otherwise, it does nothing. 
     * 
     * @param pos a position in the list
     * @throws IndexOutOfBoundsException if pos < 0 or pos >= currentSize
     */
    private void checkBounds(int pos) {
        if ((pos < 0) || (pos >= currentSize))
            throw new IndexOutOfBoundsException();
    }

    //other methods omitted for this assignment
}
