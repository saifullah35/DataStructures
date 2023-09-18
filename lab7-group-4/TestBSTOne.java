/**
 * This class is used to test BinarySearchTree methods.
 * 
 * Do not modify this class.
 * 
 * @author Prof. White
 * @version Fall 2019
 */
public class TestBSTOne 
{
    public static void main(String args[]) 
    {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(4);
        bst.add(2);
        bst.add(6);
        bst.add(1);
        bst.add(3);
        bst.add(5);
        bst.add(7);
        
        System.out.println("Testing printAll");
        System.out.println("Expected:  4.0 2.0 1.0 3.0 6.0 5.0 7.0");
        System.out.print("  Actual:  ");
        bst.printAll();
        System.out.println();
        
        System.out.println("Testing sum");
        System.out.println("Expected:  28.0");
        System.out.println("  Actual:  " + bst.sum());
        System.out.println();
        
        System.out.println("Testing numLeaves");
        System.out.println("Expected:  4");
        System.out.println("  Actual:  " + bst.numLeaves());
        System.out.println();
        
        System.out.println("Testing contains");
        System.out.println("Expected:  true");
        System.out.println("  Actual:  " + bst.contains(4));
        System.out.println("Expected:  false");
        System.out.println("  Actual:  " + bst.contains(0));
        System.out.println("Expected:  true");
        System.out.println("  Actual:  " + bst.contains(2));
        System.out.println("Expected:  true");
        System.out.println("  Actual:  " + bst.contains(5));
        System.out.println("Expected:  false");
        System.out.println("  Actual:  " + bst.contains(10));
        System.out.println();
        
        System.out.println("Testing numAs");
        System.out.println("Expected:  0");
        System.out.println("  Actual:  " + bst.numAs());
        System.out.println();
        
        System.out.println("Testing getSmallest");
        System.out.println("Expected:  1.0");
        System.out.println("  Actual:  " + bst.getSmallest());
        System.out.println();
        
        bst.add(92);
        bst.add(101);
        bst.add(97);
        bst.add(-234);
        
        System.out.println("Testing numAs");
        System.out.println("Expected:  2");
        System.out.println("  Actual:  " + bst.numAs());
        System.out.println();
        
        System.out.println("Testing getSmallest");
        System.out.println("Expected:  -234.0");
        System.out.println("  Actual:  " + bst.getSmallest());
        System.out.println();
    }
}
