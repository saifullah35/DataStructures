/**
 * This program tests the recursive methods in LinkedListOfDouble
 * and Recursive Practice.
 * 
 * YOUR MAY NEED TO COMMENT OUT AND/OR MODIFY THIS PROGRAM
 * DEPENDING ON WHICH METHODS YOU CHOOSE TO IMPLEMENT FOR
 * PROBLEM SET 4.
 * 
 * @author Prof. White
 * @version Spring 2019
 */
public class TestRecursiveMethods
{
    public static void  testRecursiveLinkedSeq() 
    {
        int score = 0;
        int total = 6;
        System.out.print("\nTesting RecursivePractice.atLeastKNegatives:  ");
        int[] arr7 = {0};
        if(!RecursivePractice.atLeastKNegatives(arr7, 0, 0, 1)) score++;
        int[] arr8 = {-1};
        if(RecursivePractice.atLeastKNegatives(arr8, 0, 0, 1)) score++;
        int[] arr9 = {-1, 1, -1, 1, -1};
        if(RecursivePractice.atLeastKNegatives(arr9, 0, 4, 3)) score++;
        if(!RecursivePractice.atLeastKNegatives(arr9, 0, 4, 4)) score++;
        int[] arr10 = {-1, 1, 2, -1, 4, -1, -1, 7, 8, -1, 10, -1};
        if(RecursivePractice.atLeastKNegatives(arr10, 3, 9, 4)) score++;
        if(!RecursivePractice.atLeastKNegatives(arr10, 3, 9, 6)) score++;
        System.out.println(score + "/" + total);

        score = 0;
        total = 6;
        System.out.print("\nTesting RecursivePractice.prefixSum:  ");
        int[] arr11 = {10};
        int y = RecursivePractice.prefixSum(arr11, 0, 0, 1); 
        if(y == 10) score++;
        //int[] arr8 = {-1};
        y = RecursivePractice.prefixSum(arr8, 0, 0, 1);
        if(y == -1) score++;
        //int[] arr9 = {-1, 1, -1, 1, -1};
        y = RecursivePractice.prefixSum(arr9, 0, 4, 5);
        if(y == -1) score++;
        y = RecursivePractice.prefixSum(arr9, 0, 4, 4);
        if(y == 0) score++;
        //int[] arr10 = {-1, 1, 2, -1, 4, -1, -1, 7, 8, -1, 10, -1};
        y = RecursivePractice.prefixSum(arr10, 3, 9, 7);
        if(y == 15) score++;
        y = RecursivePractice.prefixSum(arr10, 3, 9, 5);
        if(y == 8) score++;
        System.out.println(score + "/" + total);
        System.out.println("\n-----------------------------------------------------------------\n");

        LinkedListOfDouble seq1 = new LinkedListOfDouble();
        seq1.add(1);
        seq1.add(2);
        seq1.add(3);
        seq1.add(4);
        seq1.add(5);   
        LinkedListOfDouble seq2 = new LinkedListOfDouble();
        LinkedListOfDouble seq3 = new LinkedListOfDouble();
        seq3.add(20);

        System.out.println("Testing LinkedListDouble.recursiveMultiply:  ");
        seq1.recursiveMultiply(2);
        System.out.println("Expected:  2.0, 4.0, 6.0, 8.0, 10.0");
        System.out.println("  Actual:  " + seq1.get(0) + ", " + seq1.get(1) + ", " + seq1.get(2) + ", " + 
            seq1.get(3) + ", " + seq1.get(4));
        if(seq1.size() != 5) {
            System.out.println("Error:  incorrect list size");
        }
        try{
            seq2.recursiveMultiply(2);
        } catch (java.lang.NullPointerException npe) {
            System.out.println("LinkedListDouble.recursiveMultiply failed on null list");
        }
        if(seq2.size() != 0) {
            System.out.println("Error:  incorrect list size");
        }
        seq3.recursiveMultiply(2);
        System.out.println("Expected:  40.0");
        System.out.println("  Actual:  " + seq3.get(0));
        if(seq3.size() != 1) {
            System.out.println("Error:  incorrect list size");
        }

        System.out.println("\nTesting LinkedListDouble.recursiveCountLarger:  ");
        System.out.println("Expected:  2");
        System.out.println("  Actual:  " + seq1.recursiveCountLarger(6));
        if(seq1.size() != 5) {
            System.out.println("Error:  incorrect list size");
        }
        try{
            seq2.recursiveCountLarger(6);
        } catch (java.lang.NullPointerException npe) {
            System.out.println("LinkedListDouble.recursiveCountLarger failed on null list");
        }
        if(seq2.size() != 0) {
            System.out.println("Error:  incorrect list size");
        }
        System.out.println("Expected:  0");
        System.out.println("  Actual:  " + seq3.recursiveCountLarger(50));
        if(seq3.size() != 1) {
            System.out.println("Error:  incorrect list size");
        }
    }
}
