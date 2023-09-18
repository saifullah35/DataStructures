/**
 * This class is used to perform a unit test on the
 * ArrayManager class.  
 * 
 * DO NOT ALTER THIS CLASS.  
 *
 * @author Prof. White
 * @version Spring 2021
 */
public class UnitTestArrayManager
{
    public static void main(String args[])
    {
        System.out.println("***Testing ArrayManager.getArray(int)");
        ArrayManager am = new ArrayManager(10);
        int iArr[] = am.getArray();
        System.out.println("Expected:  -999 -999 -999 -999 -999 -999 -999 -999 -999 -999");
        System.out.print("  Actual:  ");
        printArray(iArr);
        System.out.println("***End Test");

        System.out.println("\n***Testing ArrayManager.addElement(int)");
        am.addElement(1);
        am.addElement(3);
        am.addElement(5);
        am.addElement(7);
        am.addElement(9);
        System.out.println("Expected:  1 3 5 7 9 -999 -999 -999 -999 -999");
        System.out.print("  Actual:  ");
        printArray(iArr);
        System.out.println("***End Test");

        System.out.println("\n***Testing ArrayManager.insertElement(int, int)");
        am.insertElement(2, 1);
        am.insertElement(4, 3);
        am.insertElement(6, 5);
        am.insertElement(8, 7);
        am.insertElement(10, 9);
        am.insertElement(11, 10);
        System.out.println("Expected:  1 2 3 4 5 6 7 8 9 10");
        System.out.print("  Actual:  ");
        printArray(iArr); 
        System.out.println("***End Test");

        System.out.println("\n***Testing ArrayManager.removeElement(int)");
        am.removeElement(9);
        System.out.println("Expected:  1 2 3 4 5 6 7 8 9 -999");
        System.out.print("  Actual:  ");
        printArray(iArr); 
        am.removeElement(5);
        System.out.println("\nExpected:  1 2 3 4 5 7 8 9 -999 -999");
        System.out.print("  Actual:  ");
        printArray(iArr); 
        am.removeElement(0);
        System.out.println("\nExpected:  2 3 4 5 7 8 9 -999 -999 -999");
        System.out.print("  Actual:  ");
        printArray(iArr); 
        System.out.println("***End Test");
    }

    /**
     * This method will print the values of the input array, 
     * each on the same line, separated by spaces.
     * 
     * @param obj[] The input array.
     */
    private static void printArray(int arr[])
    {
        if (arr != null)
        {
            for(Integer i : arr)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
