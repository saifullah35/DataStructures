/**
 * 
 * 
 * @author Saif Ullah and Jonathan Masih
 * @version Spring 2021
 */
public class DoubleArrayList 
{

    private double[] elements; 
    private int currentSize;  

    /**
     * Initializes an empty list with a capacity of 10.
     */
    public DoubleArrayList() 
    {
        final int INITIAL_SIZE = 10;
        elements = new double[ INITIAL_SIZE ];
        currentSize = 0;
    }

    /**
     * Initializes an empty list with the specified initial
     * capacity. initialCapacity must be > 0. If initialCapacity
     * is <= 0, then it should initialize an empty list with
     * capacity 10.
     * @param initialCapacity initial capacity of list
     */
    public DoubleArrayList(int initialCapacity) 
    {
        if ( initialCapacity <= 0 )
            elements = new double[10];
        else 
            elements = new double[initialCapacity];
        currentSize = 0;
    }

    /** 
     * Valid positions for elements in the list range
     * from 0 to currentSize-1. This method checks
     * that pos is valid. If pos is not in this
     * range, then it throws the IndexOutOfBounds 
     * exception. Otherwise, it does nothing.
     * @param pos a position in the list
     * @throws IndexOutOfBoundsException 
     *         if pos < 0 or pos >= currentSize
     */
    private void checkBounds( int pos ) 
    {
        if ((pos < 0) || (pos >= currentSize))
            throw new IndexOutOfBoundsException();
    }

    /** 
     * Returns the element at position pos in the list.
     * pos must be in the range [0...currentSize-1]. 
     * If it is not, then the IndexOutOfBounds exception
     * is thrown.
     * @param pos the position of the desired element
     * @return the indicated element.
     * @throws IndexOutOfBoundsException if pos < 0 or pos >= currentSize. 
     */
    public double get( int pos ) 
    {
        checkBounds(pos);
        return elements[pos];
    }

    /** 
     * A simplistic add method that adds the 
     * element to the end of the list, if there is room for it.
     * However, if the list is at its maximum capacity, then this
     * method does not add the element. It just returns false.
     * @param element the element to be added
     * @return true if the element is sucessfully added, false otherwise
     */
    public boolean addSimple(double element) 
    {
        if (elements == null) return false; // helps with test program
        if ( currentSize >= elements.length ) 
            return false; // no room

        elements[ currentSize ] = element;
        currentSize++;
        return true;
    }

    /**
     * Returns the number of elements in the list
     * @return the number of list elements
     */
    public int size() 
    {
        return currentSize;
    }

    /**
     * Sets the element at position pos to element. 
     * @param pos the position of the element to be replaced
     * @param element the element that will replace the 
     *    one at the indicated position        
     * @throws IndexOutOfBoundsException if pos < 0 or pos >= currentSize. 
     */
    public void set(int pos, double element ) 
    {
        checkBounds(pos);
        elements[pos] = element;
    }

    /** 
     * Removes the element at position pos from the list
     * and returns it. Entries originally at positions 
     * higher than the given position are at the next 
     * lower position within the list, and the list size 
     * is decreased by 1.
     * @param pos position of the element to be removed
     * @return the removed element
     * @throws IndexOutOfBoundsException 
     *         if pos < 0 or pos >= currentSize
     */
    public double remove( int pos ) 
    {
        checkBounds(pos);

        double r = elements[pos];
        // shift left
        for (int i = pos+1; i < currentSize; i++)
            elements[i-1] = elements[i];
        currentSize--;
        return r;
    }

    /** 
     * Clears all elements from the list, resulting in a empty list.
     * You may NOT call any other method in your implementation
     * of this!
     */
    public void clear() 
    {
        currentSize = 0;
    }

    /**
     * Returns true if the list contains the element and false otherwise.
     * 
     * @param val The value we are searching for in the list.
     * @return true if the list contains the element and false otherwise.
     */
    public boolean contains(double val)
    {
        int index = 0;
        while (index < currentSize)
        {
            if(elements[index] == val){
                return true;
            }
            index++;
        }

        return false;
    }

    /**
     * Returns a reference to a new DoubleArrayList object that is a copy
     * of this DoubleArrayList. The copy contains the same
     * ordered list of elements as the list and has the same capacity. 
     * Make sure the elements array of the copy is distinct from 
     * that of this list. In other words, this list and the copy 
     * must each have their own, separate elements arrays. 
     * @return a copy of the list
     */
    public DoubleArrayList getCopy() 
    {
        DoubleArrayList c = new DoubleArrayList();
        for(int i = 0; i < currentSize; i++)
        {
            c.addSimple(elements[i]);
        }
        return c;
    }

    /**
     * Returns the capacity of the list, which is the largest number
     * of elements the array elements[] is capable of holding.
     * In other words, it is the size of array elements[].
     * @return the capacity of the list
     */
    public int getCapacity() 
    {
        return elements.length;
    }

    /**
     * Ensures that the capacity of the list is at least
     * the specified amount minCapacity. If the list 
     * capacity is already >= minCapacity, then no 
     * action is taken.
     * @param minCapacity the desired minimum capacity
     */
    public void ensureCapacity( int minCapacity ) {
        if ( elements.length < minCapacity ) {
            // create bigger array
            double[] bigarray = new double[minCapacity];
            // copy elements from elements into bigger array
            for (int i = 0; i < currentSize; i++ )
                bigarray[i] = elements[i];
            // make elements refer to the bigger array
            elements = bigarray;
        }
    }

    /** 
     * This is a smart add method (unlike the previous
     * addSimple method that was provided for you.)
     * This method adds the element to the end of the list.
     * If the list is at its maximum capacity, its
     * capacity is doubled to make room for the element.
     * @param element the new element to be added
     * 
     * You may call ensureCapacity in this method, but you
     * may NOT CALL ANY OTHER METHODS HERE.
     */
    public void add(double element) 
    {

        if ( elements.length == currentSize ) 
        {
            ensureCapacity( elements.length*2 );
        }
        elements[currentSize] = element;
        currentSize++;
    }

    /** 
     * Adds a new element at a specified position within the list.
     * If the list is at its maximum capacity, its
     * capacity is first doubled to make room for the new element.
     * Entries originally at and above the specified position
     * are moved to the next higher position within the list.
     * The list size is increased by 1. Note that pos must
     * be in the range [0...currentSize]. It is ok if pos is
     * equal to currentSize -- in this case it merely adds 
     * the new element as the last item in the list.
     * @param pos the desired position of the new element
     * @param element the element to be added 
     * @throws IndexOutOfBoundsException 
     *               if pos < 0 or pos > currentSize. 
     *               
     * You may call ensureCapacity in this method, but you
     * may NOT CALL ANY OTHER METHODS HERE.     *
     */
    public void add(int pos, double element) 
    {
        if ((pos < 0) || (pos > currentSize))
            throw new IndexOutOfBoundsException();

        if ( elements.length == currentSize )
            ensureCapacity( elements.length*2 );
        for (int i = currentSize; i > pos; i-- )
            elements[i] = elements[i-1];
        elements[pos] = element;
        currentSize++;
    }

    /**
     * Adds all elements in addend to the end of this list, in
     * the order in which they occur in addend.
     * If this list's capacity is insufficient to hold all the new
     * elements, its capacity is first increased to 
     * this.size() + addend.size(). 
     * 
     * You may call ensureCapacity in this method, but you
     * may NOT CALL ANY OTHER METHODS HERE.
     *
     * @param addend The list containing the elements to add.
     */
    public void addAll(DoubleArrayList addend )
    { 

        ensureCapacity(this.size() + addend.size());

        for(int i = 0; i < addend.size(); i++){ 
            elements[currentSize] = addend.get(i); 
            currentSize++;

        }

    }

    /** 
     * Adds all elements in addpos into this list at the specified
     * position, in the order in which they occur in addpos.
     * If this list's capacity is insufficient to hold all the new
     * elements, its capacity is first increased to 
     * this.size() + addpos.size(). 
     *
     * For example, if list A contains {0, 10, 20, 30} and
     * list B contains {5, 15, 25} and A.addAll( 2, B )
     * is called, then after the call A would contain
     * {0, 10, 5, 15, 25, 20, 30}.
     *
     * You may call ensureCapacity in this method, but you
     * may NOT CALL ANY OTHER METHODS HERE.
     *
     * @param pos The position into which the first element 
     * should be added.
     * @param addPos The list containing the elements to add.
     */
    public void addAll( int pos, DoubleArrayList addpos )
    {
        double [] array = new double [elements.length];
        for(int i = 0; i < elements.length; i ++){
         array[i] = elements[i];
        
        }
        ensureCapacity(this.size() + addpos.size());

        for(int i = 0; i < addpos.size();i++){
          elements[pos + i] = addpos.get(i);
          currentSize++;
        }
       
        int temp = 0;
        for(int i = pos + addpos.size()  ; i < currentSize  ; i++){ 
           elements [i] = array[pos + temp];
            temp++;

        }
        

        
    }
}