/**
 * In this class, an array is used to keep track of
 * integer values.  The length of the array is determined
 * upon construction of the ArrayManager object.  The
 * location of the next available index to hold an array
 * value is tracked.  Elements of the array that are not 
 * used have a value of -999.
 * 
 * For example, if an ArrayManager object is constructed with 
 * 3 elements, once constructed its elements are {-999, -999, -999}
 * and the nextAvailable element that can hold a value is
 * located at index 0.  If the value 3 is added, the elements
 * are {3, -999, -999} and nextAvailable = 1.
 * 
 * Debug (DO NOT WRITE YOUR OWN) the methods so they work as required.  
 * Bugs may include logic errors, syntax errors, and/or runtime errors.
 *
 * @author Prof. White, Dr. Liu modified by (your names)
 * @version Lab 0, Spring 2021
 */
public class ArrayManager
{
    //DO NOT MODIFY THE INSTANCE VARIABLES.

    //The integer array.
    private int iArr[];

    //The location in the array where the next value
    //placed in the array should be stored.
    private int nextAvailable;

    /**
     * Constructs an ArrayManager object with the
     * input number of elements in and integer array.
     * 
     * @param numElements - The number of elements that
     * the array will contain after construction.  Each
     * array element will have a value of -999.
     */
    public ArrayManager(int numElements)
    {
        iArr = new int [numElements];
        for (int i=0; i < iArr.length;i++){
            iArr[i] = -999;
        }
    }

    /**
     * Adds the input value in the next available location
     * in the array.  If there are no available locations, 
     * the value is not added.
     * 
     * @param value The value to add in the next available
     * location in the array.
     */
    public void addElement(int value)
    {
        if (iArr[nextAvailable] == -999){
            iArr[nextAvailable] = value;
            nextAvailable++;
        }
    }

    /**
     * Inserts the input value in the input location in the
     * array.  Values to the right of the input location
     * are shifted to the right.  If there is not at least
     * one avaialble location in the array, the input value
     * is not added to the array.
     * 
     * Precondition:  0 <= location < length of the array
     * 
     * @param value The value to be inserted into the array.
     * @param location The location in the array where the
     * value should be inserted.
     */
    public void insertElement(int value, int location)
    {
        // Hint: there are two errors in the for loop header
        if(nextAvailable < iArr.length && location <= nextAvailable)
        {
            for(int i = iArr.length - 1; i > location; i--)
            {
                iArr[i] = iArr[i - 1];
            }
            iArr[location] = value;
            nextAvailable++;
        }
    }

    /**
     * Removes and returns the value at the location in the array.  If the 
     * input location is to the left of the next available location in the 
     * array, the value is removed and all elements to the right of the 
     * input location are shifted to the left.  Otherwise, the value is not 
     * removed.
     * 
     * Precondition:  0 <= location < length of the array
     * 
     * @param location The location of the value in the array to be removed.
     * @return The value that is removed.  If no value is removed, -999 is
     * returned.
     */
    public int removeElement(int location)
    {
        // Hint: there are 2 errors in this method. One of the errors is in the for loop body.
        int value = -999;

        if(location < nextAvailable)
        {
            value = iArr[location];
            for(int i = location; i < nextAvailable - 1; i++)
            {
                iArr[i] = iArr[i + 1];
            }
            nextAvailable--;
            iArr[nextAvailable] = -999;
        }

        return value;
    }

    /**
     * Accessor method returning the array instance variable.
     * 
     * @return The the array instance variable.
     */
    public int[] getArray()
    {
        return iArr;
    }

}
