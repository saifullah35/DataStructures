/**
 * CSIS-210 Lab 0
 * 
 * Complete each of the following methods according to the method comments.
 * DO NOT CHANGE THE METHOD HEADERS.
 *
 * @author Saif Ullah and Jonathan Masih
 * @version Feb 22, 2021
 */
public class ArrayPractice
{
    /**
     * Return the sum of the elements in the array.
     * 
     * @param arr[] The input array of Double objects.
     * @return The sum of the elements in the array.
     */
    public static double sum(Double arr[])
    {
        double sum = 0;
        for (double i : arr){
            sum += i;
        }
        return sum;
    }

    /**
     * Return the sum of the elements in the array.
     * 
     * @param arr[] The input array of Integer objects.
     * @return The sum of the elements in the array.
     */
    public static int sum(Integer arr[])
    {
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        return sum;
    }
    
    /**
     * Return the largest value in the array.
     * 
     * @param arr[] The input array of Integer objects.
     * @return The largest value in the array.
     */
    public static int largest(Integer arr[])
    {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    
    /**
     * Return the number of elements in the input array that are
     * strictly larger than the input value.
     * 
     * @param arr[] The input array of Integer objects.
     * @param value The value to which the elements will be compared.
     * @return The number of elements in the input array that are
     *         strictly larger than the input value.
     */
    public static int countLarger(Integer arr[], int value)
    {
        int count = 0;
        for (int i = 0; i < value; i++){
            if (arr[i] > value){
                count++;  
            }
        }
        return count;
    }
    
    /**
     * Return the number of elements in the array that have
     * a value of TRUE.
     * 
     * @param arr[] The input array of Boolean values.
     * @return The number of elements in the array that have
     *         a value of TRUE.
     */
    public static int countTrue(Boolean arr[])
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == true){
                count++;
            }    
        }
        return count;
    }
    
    /**
     * Return an array of values that represent the lengths of
     * the string values in the input array.  For example, if
     * the input array is {"I", "love", "CS"}, then the returned
     * array would be {1, 4, 2}.
     * 
     * @param arr[] The input array of String objects.
     * @return The array representing the lengths of the Strings in
     *         the input array.
     */
    public static Integer[] stringLengths(String arr[])
    {
        Integer[] newArray = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++){
            newArray[i] = arr[i].length();
        }
        return newArray;
    }
    
}
