
import java.util.NoSuchElementException;
/**
 * RecursionPractice 
 *
 * @author (Jonathan Masih & saif Ullah)
 * @version April 13, 2021
 */
public class RecursionPractice
{
    /**
     * This method takes a string as input and returns a new string, 
     * generated recursively.  The new string contains all of the same
     * characters in the same order, except all vowels are in uppercase.
     * 
     * This method should throw an illegal argument exception with an 
     * appropriate message if the input string is null.
     * 
     * @param str The input string.
     * @return A new string with all of the same characters in the same
     * order, except all vowels are in upper case.
     */
    public String vowelToUpperCase(String str)
    {

        //METHOD WITH RECURSION
        if(str == null || str.length() == 0){

            return str;
        }else {
            char a = str.charAt(0);

            if(str.charAt(0) == 'a' ||str.charAt(0) ==  'e' || str.charAt(0) ==  'i'
            || str.charAt(0) == 'o' ||  str.charAt(0) == 'u' && str.length() > 1)   {
                a = Character.toUpperCase(str.charAt(0));
                return a + vowelToUpperCase(str.substring(1));
            }
            return a + vowelToUpperCase(str.substring(1));

        }
    }

    private String vowelToUpperCase2(String str)
    {
        //METHOD WITH RECURSION
        if(str == null || str.length() == 0){

            return str;
        }else {
            char a = str.charAt(0);

            if(str.charAt(0) == 'a' ||str.charAt(0) ==  'e' || str.charAt(0) ==  'i'
            || str.charAt(0) == 'o' ||  str.charAt(0) == 'u' && str.length() > 1)   {
                a = Character.toUpperCase(str.charAt(0));
                return a + vowelToUpperCase(str.substring(1));
            }
            return a + vowelToUpperCase(str.substring(1));

        }
    }

    /**
     * This method take an integer as input an returns an integer such that the
     * order of the digits is reversed and all odd digits are replaced with 0.
     * 
     * @param number An integer.
     * @return An integer such that the order of the digits is reversed and all
     * odd digits are replaced with 0.
     */
    public int evenOdd(int number)
    {
        String stringNum;
       
        if( number == 0){
            return number;    
        } else {
            stringNum = number + "";
            char a = stringNum.charAt(0);
            int digit = Integer.parseInt(String.valueOf(a));
            if( digit % 2 != 0){
                a = '0';
            } 
            return 10 * evenOdd(Integer.parseInt(stringNum.substring(1))) + a  ;
        } 

    }

    private int evenOdd2(int number){
          String stringNum;
       
        if( number == 0){
            return number;    
        } else {
            stringNum = number + "";
            char a = stringNum.charAt(0);
            int digit = Integer.parseInt(String.valueOf(a));
            if( digit % 2 != 0){
                a = '0';
            } 
            return 10 * evenOdd(Integer.parseInt(stringNum.substring(1))) + a  ;
        } 
    }

    /**
     * This method sums all the values in [array[begin], array[end]] that are greater
     * than the input value greaterThan.
     * 
     * Preconditions:  
     * (1) The array is not null 
     * (2) -1 < begin <= end < the number of elements in the array
     * 
     * This method should throw an illegal argument exception with an 
     * appropriate message if any of the preconditions are violated.
     * 
     * @param array The inter array.
     * @param begin The index into the array in which to begin the sum.
     * @param end The index into the array in which to end the sum.
     * @param greaterThan  Only sum elements if they are greater than this input.
     * @return The sum of elements in [array[begin], array[end]] whose values are
     * greater than the input value.
     */
    public int sumIn(int[] array, int begin, int end, int greaterThan)
    {

        if(array == null || begin < -1 || end < begin || end > array.length){
            throw new NoSuchElementException("Illgal argument");
        } else{

            if(begin == end){
                
                 return array[begin];
                
               
               
            }else{
                if(array[begin ] > greaterThan){
                    return array[begin]+ sumIn(array, begin + 1, end ,  greaterThan );
                }
                return sumIn(array, begin + 1, end ,  greaterThan );
            }

        }
    }
    private int sumIn2(int[] array, int begin, int end, int greaterThan){
    
    
        if(array == null || begin < -1 || end < begin || end > array.length){
            throw new NoSuchElementException("Illgal argument");
        } else{

            if(begin == end){
                
                 return array[begin];
                
               
               
            }else{
                if(array[begin ] > greaterThan){
                    return array[begin]+ sumIn(array, begin + 1, end ,  greaterThan );
                }
                return sumIn(array, begin + 1, end ,  greaterThan );
            }

        }
    
    }
}

