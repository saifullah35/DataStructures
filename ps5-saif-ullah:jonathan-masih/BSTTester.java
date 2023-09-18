
/**
 * Creates and  Prints Several Trees of Comparable types such as Integer, Double, and String.
 *
 * @author (Saif Ullah and Jonathan Masih)
 * @version (May 13, 2021)
 */
public class BSTTester
{
    public static void main (String[] args){
        //CREATING COMPARABLE TYPE TREES
        BST<Integer> integerTree1 = new BST<Integer>();
        BST<Integer> integerTree2 = new BST<Integer>();
        BST<Integer> integerTree3 = new BST<Integer>();
        BST<Integer> integerTree4Empty = new BST<Integer>();
        
        BST<Double> doubleTree1 = new BST<Double>();
        BST<Double> doubleTree2 = new BST<Double>();
        BST<Double> doubleTree3 = new BST<Double>();
        BST<Double> doubleTree4Empty = new BST<Double>();
        
        BST<String> stringTree1 = new BST<String>(); 
        BST<String> stringTree2 = new BST<String>();
        BST<String> stringTree3 = new BST<String>(); 
        BST<String> stringTree4Empty = new BST<String>();
        
        //ADDING ELEMENTS IN THE INTEGER TREE
        integerTree1.add(1);
        integerTree1.add(2);
        integerTree1.add(3);
        integerTree1.add(4);
        integerTree1.add(5);
        integerTree1.add(6);
        integerTree1.add(7);
        
        //ADDING ELEMENTS IN THE 2nd INTEGER TREE
        integerTree2.add(7);
        integerTree2.add(5);
        integerTree2.add(3);
        integerTree2.add(1);
        integerTree2.add(4);
        integerTree2.add(6);
        integerTree2.add(2);
        
        //ADDING ELEMENTS IN THE 3rd INTEGER TREE
        integerTree3.add(10);
        integerTree3.add(2);
        integerTree3.add(3);
        integerTree3.add(4);
        integerTree3.add(5);
        integerTree3.add(6);
        integerTree3.add(7);
        
        
        //ADDING ELEMENTS IN THE 1st Double TREE
        doubleTree1.add(1.5);
        doubleTree1.add(2.4);
        doubleTree1.add(3.1);
        doubleTree1.add(4.9);
        doubleTree1.add(5.5);
        doubleTree1.add(6.8);
        doubleTree1.add(7.2);
        
        //ADDING ELEMENTS IN THE 2nd Double TREE
        doubleTree2.add(7.2);
        doubleTree2.add(5.5);
        doubleTree2.add(3.1);
        doubleTree2.add(1.5);
        doubleTree2.add(2.4);
        doubleTree2.add(4.9);
        doubleTree2.add(6.8);
        
        //ADDING ELEMENTS IN THE 3rd Double TREE
        doubleTree3.add(2.4);
        doubleTree3.add(1.5);
        doubleTree3.add(3.1);
        doubleTree3.add(9.9);
        doubleTree3.add(7.2);
        doubleTree3.add(8.3);
        doubleTree3.add(5.5);
        
        
        //ADDING ELEMENTS IN THE 1st String TREE
        stringTree1.add("A");
        stringTree1.add("B");
        stringTree1.add("C");
        stringTree1.add("D");
        stringTree1.add("E");
        stringTree1.add("F");
        stringTree1.add("G");
        
         //ADDING ELEMENTS IN THE 2nd String TREE
        stringTree2.add("G");
        stringTree2.add("F");
        stringTree2.add("E");
        stringTree2.add("D");
        stringTree2.add("C");
        stringTree2.add("B");
        stringTree2.add("A");
        
         //ADDING ELEMENTS IN THE 3rd String TREE
        stringTree3.add("A");
        stringTree3.add("F");
        stringTree3.add("G");
        stringTree3.add("X");
        stringTree3.add("E");
        stringTree3.add("B");
        stringTree3.add("Z");
        
        //TESTING INTEGER TREE METHODS: CONTAINS, EQUALS,SHAPE EQUALS, AND toString
        System.out.println("Testing integer tree methods: Contains, Equals, shapeEquals, and toString" );
        
        System.out.println("\nTesting contains method with integerTree1 | Testing value with 1 | " + 
        "Expected: true. Actual: " + integerTree1.contains(1));
        System.out.println("Testing contains method with integerTree1 | Testing value with 11 | " + 
        "Expected: false. Actual: " + integerTree1.contains(11));
        System.out.println("Testing contains method with integerTree1 | Testing value with 5 | " + 
        "Expected: true. Actual: " + integerTree1.contains(5));
        
        System.out.println("\nTesting equals method with integerTree1 and integerTree2 | " + 
        "Expected: true. Actual: " + integerTree1.equals(integerTree2));
        System.out.println("Testing equals method with integerTree1 and integerTree3 | " + 
        "Expected: false. Actual: " + integerTree1.equals(integerTree3));
        System.out.println("Testing equals method with integerTree1 and integerTree4Empty | " + 
        "Expected: false. Actual: " + integerTree1.equals(integerTree4Empty));
        
        System.out.println("\nTesting shapeEquals method with integerTree1 and integerTree1 | " + 
        "Expected: true. Actual: " + integerTree1.shapeEquals(integerTree1.getRoot() , integerTree1.getRoot()));
        System.out.println("Testing shapeEquals method with integerTree1 and integerTree2 | " + 
        "Expected: false. Actual: " + integerTree1.shapeEquals(integerTree1.getRoot() , integerTree2.getRoot()));
        System.out.println("Testing shapeEquals method with integerTree1 and integerTree3 | " + 
        "Expected: false. Actual: " + integerTree1.shapeEquals(integerTree1.getRoot() , integerTree3.getRoot()));
        
        System.out.println("\nTester for integer Tree1 toString" + integerTree1.toString());
        System.out.println("Tester for integer Tree2 toString" + integerTree2.toString());
        System.out.println("Tester for integer Tree3 toString" + integerTree3.toString());
        
        System.out.println("\n\nTesting double tree methods: Contains, Equals, shapeEquals, and toString" );
        
        System.out.println("\nTesting contains method with doubleTree1 | Testing value with 1.5 | " + 
        "Expected: true. Actual: " + doubleTree1.contains(1.5));
        System.out.println("Testing contains method with integerTree1 | Testing value with 2.0 | " + 
        "Expected: false. Actual: " + doubleTree1.contains(2.0));
        System.out.println("Testing contains method with integerTree1 | Testing value with 7.2 | " + 
        "Expected: true. Actual: " + doubleTree1.contains(7.2));
        
        System.out.println("\nTesting equals method with doubleTree1 and doubleTree2 | " + 
        "Expected: true. Actual: " + doubleTree1.equals(doubleTree2));
        System.out.println("Testing equals method with doubleTree1 and doubleTree3 | " + 
        "Expected: false. Actual: " + doubleTree1.equals(doubleTree3));
        System.out.println("Testing equals method with doubleTree1 and doubleTree4Empty | " + 
        "Expected: false. Actual: " + doubleTree1.equals(doubleTree4Empty));
        
        System.out.println("\nTesting shapeEquals method with doubleTree1 and doubleTree1 | " + 
        "Expected: true. Actual: " + doubleTree1.shapeEquals(doubleTree1.getRoot() , doubleTree1.getRoot()));
        System.out.println("Testing shapeEquals method with doubleTree1 and doubleTree2 | " + 
        "Expected: false. Actual: " + doubleTree1.shapeEquals(doubleTree1.getRoot() , doubleTree2.getRoot()));
        System.out.println("Testing shapeEquals method with doubleTree1 and doubleTree3 | " + 
        "Expected: false. Actual: " + doubleTree1.shapeEquals(doubleTree1.getRoot() , doubleTree3.getRoot()));
        
        System.out.println("\nTester for double Tree1 toString: " + doubleTree1.toString());
        System.out.println("Tester for double Tree2 toString: " + doubleTree2.toString());
        System.out.println("Tester for double Tree3 toString: " + doubleTree3.toString());
        
        System.out.println("\n\nTesting String tree methods: Contains, Equals, shapeEquals, and toString" );
        
        System.out.println("\nTesting contains method with stringTree1 | Testing value with 'A' | " + 
        "Expected: true. Actual: " + stringTree1.contains("A"));
        System.out.println("Testing contains method with stringTree1 | Testing value with 'M' | " + 
        "Expected: false. Actual: " + stringTree1.contains("M"));
        System.out.println("Testing contains method with stringTree1 | Testing value with 'D' | " + 
        "Expected: true. Actual: " + stringTree1.contains("D"));
        
        System.out.println("\nTesting equals method with stringTree1 and stringTree2 | " + 
        "Expected: true. Actual: " + stringTree1.equals(stringTree2));
        System.out.println("Testing equals method with stringTree1 and stringTree3 | " + 
        "Expected: false. Actual: " + stringTree1.equals(stringTree3));
        System.out.println("Testing equals method with stringTree1 and stringTree4Empty | " + 
        "Expected: false. Actual: " + stringTree1.equals(stringTree4Empty));
        
        System.out.println("\nTesting shapeEquals method with stringTree1 and stringTree1 | " + 
        "Expected: true. Actual: " + stringTree1.shapeEquals(stringTree1.getRoot() , stringTree1.getRoot()));
        System.out.println("Testing shapeEquals method with stringTree1 and stringTree2 | " + 
        "Expected: false. Actual: " + stringTree1.shapeEquals(stringTree1.getRoot() , stringTree2.getRoot()));
        System.out.println("Testing shapeEquals method with stringTree1 and stringTree3 | " + 
        "Expected: false. Actual: " + stringTree1.shapeEquals(stringTree1.getRoot() , stringTree3.getRoot()));
        
        
        System.out.println("\nTester for string Tree1: " + stringTree1.toString());
        System.out.println("Tester for string Tree2: " + stringTree2.toString());
        System.out.println("Tester for string Tree3: " + stringTree3.toString());
    }
}
