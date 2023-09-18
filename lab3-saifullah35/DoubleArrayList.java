/**
 * Objects of this class type store a list of double values,
 * each having a position in the list. 
 * 
 * You may not import the ArrayList class!
 * 
 * @author (your names)
 * @version (date)
 */
public class DoubleArrayList 
{

    //array storing the elements in positions 0...currentSize-1
    private double[] elements; 

    //number of elements in the list
    private int currentSize;  

    //the initial size of the list
    final int INITIAL_SIZE = 10;

    /**
     * Initializes an empty list with an initial capacity.
     */
    public DoubleArrayList() 
    {    
        elements = new double[INITIAL_SIZE];
        currentSize = 0;
    }

    /**
     * Initializes an empty list with the specified initial
     * capacity. initialCapacity must be > 0. If initialCapacity
     * is <= 0, then it initializes an empty list with INITIAL_SIZE.
     * 
     * @param initialCapacity initial capacity of list
     */
    public DoubleArrayList(int initialCapacity) 
    {
        if ( initialCapacity <= 0 )
        {
            elements = new double[INITIAL_SIZE];
        }
        else
        { 
            elements = new double[initialCapacity];
        }
        currentSize = 0;
    }

    /** 
     * Valid positions for elements in the list range
     * from 0 to currentSize-1. This method checks
     * that pos is valid. If pos is not in this
     * range, then it throws the IndexOutOfBounds 
     * exception. Otherwise, it does nothing.
     * 
     * @param pos A position in the list
     * @throws IndexOutOfBoundsException 
     *         if pos < 0 or pos >= currentSize
     */
    private void checkBounds(int pos) 
    {
        if ((pos < 0) || (pos >= currentSize))
        {
            throw new IndexOutOfBoundsException();
        }
    }

    /** 
     * Returns the element at position pos in the list.
     * pos must be in the range [0...currentSize-1]. 
     * If it is not, then the IndexOutOfBounds exception
     * is thrown.
     * 
     * @param pos The position of the desired element.
     * @return The indicated element.
     * @throws IndexOutOfBoundsException if pos < 0 or pos >= currentSize. 
     */
    public double get( int pos ) 
    {
        checkBounds(pos);
        return elements[pos];
    }

    /** 
     * A simplistic add method that adds the element to the end 
     * of the list, if there is room for it.  However, if the 
     * list is at its maximum capacity, then this method does 
     * not add the element. It just returns false.
     * 
     * @param element The element to be added.
     * @return true if the element is sucessfully added, false otherwise
     */
    public boolean addSimple(double element) 
    {
        if (elements == null || currentSize >= elements.length) 
        {
            return false; 
        }
        elements[ currentSize ] = element;
        currentSize++;
        return true;
    }

    /**
     * Returns the number of elements in the list
     * 
     * @return The number of list elements
     */
    public int size() 
    {
        //Your code here.
        return -1;
    }

    /**
     * Sets the element at position pos to element. 
     * 
     * @param pos The position of the element to be replaced
     * @param element The element that will replace the 
     *                one at the indicated position        
     * @throws IndexOutOfBoundsException if pos < 0 or pos >= currentSize. 
     */
    public void set(int pos, double element ) 
    {
        //Your code here.
    }

    /** 
     * Removes the element at position pos from the list
     * and returns it. Entries originally at positions 
     * higher than the given position are at the next 
     * lower position within the list, and the list size 
     * is decreased by 1.
     * 
     * @param pos Position of the element to be removed
     * @return The removed element
     * @throws IndexOutOfBoundsException 
     *         if pos < 0 or pos >= currentSize
     */
    public double remove( int pos ) 
    {
        //Your code here.
        return -1;
    }

    /** 
     * Clears all elements from the list, resulting in a empty list.
     * You may NOT call any other method in your implementation
     * of this!
     */
    public void clear() 
    {
        //Your code here.
    }

    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    //
    // STOP HERE! REFER TO THE LAB INSTRUCTIONS BEFORE CONTINUING
    //
    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    /**
     * Returns a reference to a new DoubleArrayList object that is a copy
     * of this DoubleArrayList. The copy contains the same
     * ordered list of elements as the list and has the same capacity.
     * 
     * Make sure the elements array of the copy is distinct from 
     * that of this list. In other words, this list and the copy 
     * must each have their own, separate elements arrays. 
     * 
     * @return A reference to a new DoubleArrayList object that is a copy
     * of this DoubleArrayList.  I.e., returns a copy of the list.
     */
    public DoubleArrayList getCopy() 
    {
        //Your code here.
        return null;
    }

    /**
     * Returns the capacity of the list, which is the largest number
     * of elements the array elements[] is capable of holding. In other 
     * words, it is the size of array elements[].
     * 
     * @return The capacity of the list.
     */
    public int getCapacity() 
    {
        //Your code here.
        return -1;
    }

    /**
     * Ensures that the capacity of the list is at least
     * the specified amount minCapacity. If it is not,
     * it increases the capacity of the list to minCapacity.
     * If the list capacity is already >= minCapacity, then 
     * no action is taken.
     * 
     * @param minCapacity the desired minimum capacity
     */
    public void ensureCapacity( int minCapacity ) 
    {
        //Your code here.
    }

    /** 
     * This is a smart add method (unlike the previous
     * addSimple method that was provided for you.)
     * 
     * This method adds the element to the end of the list.
     * If the list is at its maximum capacity, its
     * capacity is doubled to make room for the element.
     * 
     * You may call ensureCapacity in this method, but you
     * may NOT CALL ANY OTHER METHODS HERE.
     * 
     * @param element the new element to be added
     */
    public void add(double element) 
    {
        //Your code here.
    }

    /** 
     * Adds a new element at a specified position within the list.
     * If the list is at its maximum capacity, its
     * capacity is first doubled to make room for the new element.
     * 
     * Entries originally at and above the specified position
     * are moved to the next higher position within the list.
     * The list size is increased by 1. 
     * 
     * Note that pos must be in the range [0...currentSize]. It is 
     * okay if pos is equal to currentSize -- in this case it merely 
     * adds the new element as the last item in the list.
     * 
     * You may call ensureCapacity in this method, but you
     * may NOT CALL ANY OTHER METHODS HERE.
     * 
     * @param pos The desired position of the new element
     * @param element The element to be added 
     * @throws IndexOutOfBoundsException 
     *               if pos < 0 or pos > currentSize.        
     */
    public void add(int pos, double element) 
    {
        //Your code here.
    }
}
