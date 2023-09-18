
/**
 *  DriverRecursionPractice 
 *
 * @author (Jonathan Masih & saif Ullah)
 * @version April 13, 2021
 */
public class DriverRecursionPractice
{

    public static void main (String [] args){
        RecursionPractice test = new RecursionPractice();

        String testVowelToUpperCase = "Leaves are falling, autumn is calling!";
        System.out.println("Testing vowelToUpperCase method: ");
        System.out.println("String before test vowelToUpperCase: Leaves are falling, autumn is calling!");
        System.out.println("String After test vowelToUpperCase: " +  test.vowelToUpperCase(testVowelToUpperCase));

        System.out.println("\n\nTesting evenOdd method: ");
        System.out.println("Testing with 1. Expected: 0. Actual: " + test.evenOdd(1));
        System.out.println("Testing with 2. Expected: 2. Actual: " + test.evenOdd(2));
        System.out.println("Testing with 3241. Expected: 420. Actual: " + test.evenOdd(3241));
        System.out.println("Testing with 2314. Expected: 4002. Actual: " + test.evenOdd(2314));

        System.out.println("\n\nTesting sumIn method: ");
        int[] array = {2, 4, 6, 8, 10};

        System.out.println("Testing with Array: {2, 4, 6, 8, 10}. Begin: 1. End: 1. GreaterThan: 0." +  
            "Expected: 2 Actual: " + test.sumIn(array,1,1,0));

        System.out.println("Testing with Array: {2, 4, 6, 8, 10}. Begin: 0. End: 4. GreaterThan: 11." +  
            "Expected: 0 Actual: " + test.sumIn(array,0,4,11));

        System.out.println("Testing with Array: {2, 4, 6, 8, 10}. Begin: 2. End: 7. GreaterThan: 0." +  
            "Expected: 2 Actual: " + test.sumIn(array,1,1,0));

    }
}
