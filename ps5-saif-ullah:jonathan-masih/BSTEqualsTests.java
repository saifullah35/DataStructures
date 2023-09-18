
/**
 *Class for testing equals method and shapeEquals method
 *BSTEqualsTests here.
 *
 * @author (Jonathan Masih , Saif Ullah)
 * @version (5/7/2021)
 */
public class BSTEqualsTests
{
    public static void main (String [] args){
        //MAKING TWO TREES
        BinarySearchTree bstOne = new BinarySearchTree();
        BinarySearchTree bstOne1 = new BinarySearchTree();
        BinarySearchTree bstTwo = new BinarySearchTree();
        BinarySearchTree bstThree = new BinarySearchTree();
        BinarySearchTree bstFour = new BinarySearchTree();
        BinarySearchTree nullTree= new BinarySearchTree();
        BinarySearchTree nullTree2 = new BinarySearchTree();

        //ADDING ELEMENTS TO TREE 1
        bstOne.add(1);
        bstOne.add(2);
        bstOne.add(3);
        bstOne.add(4);
        bstOne.add(5);
        bstOne.add(6);
        bstOne.add(7);

        //ADDING ELEMENTS TO TREE 1.5
        bstOne1.add(1);
        bstOne1.add(2);
        bstOne1.add(3);
        bstOne1.add(4);
        bstOne1.add(5);
        bstOne1.add(6);
        bstOne1.add(7);

        //ADDING ELEMENTS TO TREE 2
        bstTwo.add(1);
        bstTwo.add(5);
        bstTwo.add(4);
        bstTwo.add(7);
        bstTwo.add(2);
        bstTwo.add(3); 
        bstTwo.add(6);

        //ADDING ELEMENT TO TREE 3

        bstThree.add(10);
        bstThree.add(11);
        bstThree.add(7);
        bstThree.add(1);
        bstThree.add(5);
        bstThree.add(2);
        bstThree.add(1);

        //ADDING ELEMENTS TO TREE 4
        bstFour.add(1);
        bstFour.add(2);
        bstFour.add(3);
        bstFour.add(4);
        bstFour.add(5);
        bstFour.add(6);
        bstFour.add(7);

        System.out.println("\nTESTS FOREQUALS METHOD");
        //TESTING 2 TREES With Same values 
        System.out.println("\nTesting Equals method with Tree One" +
            "and Tree Two Both trees with same values Expected: true  Acutaul: " + 
            bstOne.equals(bstTwo));

        //TESTING 2 TREES WITH DIFFERENT VALUES
        System.out.println("\nTesting Equals method with Tree One" +
            "and Tree Three Trees with different values Expected: false  Acutaul: " + 
            bstOne.equals(bstThree));

        //TESTING 2 TREES WITH EMPTY TREES
        System.out.println("\nTesting Equals method with nullTree" +
            "and nullTree2  Testing empty trees Expected: true  Acutaul: " + 
            nullTree.equals(nullTree2));

        System.out.println("\nTESTS FOR SHAPEEQUALS METHOD");
        //TESTING 2 TREES WITH SAME VAlUES AND SAME SHAPES
        System.out.println("\nTesting shape Equals method with bstOne " +
            "and bstOne1 SAME VAlUES AND SAME SHAPES  Expected: true  Acutaul: " +  
            bstOne.shapeEquals(bstOne.getRoot(),bstOne1.getRoot()));

        //TESTING 2 TREES WITH DIFFERENT VAlUES AND DIFFERENT SHAPES
        System.out.println("\nTesting shape Equals method with bstOne " +
            "and bstThree DIFFERENT VAlUES AND DIFFERENT SHAPES Expected: false  Acutaul: " +  
            bstOne.shapeEquals(bstOne.getRoot(),bstThree.getRoot()));

        //TESTING 2 TREES THAT ARE EMPTY 
        System.out.println("\nTesting shape Equals method with  nullTree  " +
            "and nullTree2 TREES THAT ARE EMPTY  Expected: True  Acutaul: " +  
            nullTree.shapeEquals(nullTree.getRoot(),nullTree2.getRoot()));

        //TESTING 2 TREES WITH SAME VALUES BUT DIFFERENT SHAPES
        System.out.println("\nTesting shape Equals method with bstOne " +
            "and bstTwo  TREES WITH SAME VALUES BUT DIFFERENT SHAPES Expected: false  Acutaul: " 
            +  bstOne.shapeEquals( bstOne.getRoot(),bstTwo.getRoot()));

    }
}
