import java.util.ArrayList;
/**
 * A binary search tree (BST) data structure for storing floating point
 * values. The tree has the property that for every node n, all values
 * in n's left subtree are less than or equal to n's data value and
 * all values in n's right subtree are larger.
 * 
 * Starter code by Siena College Faculty, modified by Pauline White
 * for CSIS 210, Spring 2018
 *
 * @author (Saif Ullah and Jonathan Masih)
 * @version (May 10, 2021)
 */
public class BinarySearchTree 
{
    private Node root;

    /**
     * Constructs an empty binary search tree (BST).
     */
    public BinarySearchTree() 
    {
        root = null;
    }

    /**
     * Inner class representing one node in a BST.
     */
    private class Node 
    {
        private double data;
        private Node left;
        private Node right;

        /**
         * Constructs a node with a value and left and right
         * references.
         * 
         * @param data The data value for the node.
         * @param left A reference to the child of the node or
         * null if this node has no left child.
         * @param right A reference to the right child of the
         * node or null if this node has no right child.
         */
        private Node(double data, Node left, Node right) 
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * Adds the value to the tree maintianing the BST
     * property that for every tree node n, all values in n's left
     * subtree are less than or equal to n's data value and all values
     * in n's right subtree are larger.
     * 
     * @param value The value to be added to the BST.
     */ 
    public void add(double value) 
    {
        if (root == null) {
            root = new Node(value, null, null);
        } else {
            recursiveAdd(value, root);
        }
    }

    /**
     * Recursive method to add a value to a BST with root n.
     * 
     * Precondition: n is not null
     * @param value The value to be added to the BST.
     * @param n The root of the BST.
     */ 
    private void recursiveAdd(double value, Node n) 
    {
        if ((value > n.data) && (n.right == null)) {
            // value is added as the right child of n
            n.right = new Node(value, null, null);
        }
        else if ((value <= n.data) && (n.left == null)) {
            // value is added as the left child of n
            n.left = new Node(value, null, null);
        }
        else if ((value > n.data) && (n.right != null)) {
            // insert value into n's right subtree
            recursiveAdd(value, n.right);
        }
        else {
            // the following is true: ((value <= n.data) && (n.left != null))
            // insert value into n's left subtree
            recursiveAdd(value, n.left);
        }
    }

    /**
     * Prints the values in the BST.
     */
    public void printAll() 
    {
        recursivePrintAll(root);

        //New line after printing all values
        System.out.println(""); 
    }

    /**
     * Recursively prints the values in the BST whose root is n.
     * 
     * @param n The root of the tree (or subtree).
     */
    private void recursivePrintAll(Node n) 
    {
        if(n != null)
        {
            System.out.print(n.data + " "); 
            recursivePrintAll(n.left);
            recursivePrintAll(n.right);
        }
    }

    /**
     * Compute the sum of all values in the BST recursively.  
     * Call the recursive method appropriately.
     *
     * @return The sum of values in the BST.
     */
    public double sum() 
    {
        return sum(root);
    }

    /**
     * The recursive method for sum().
     * Recursively computes the sum of the values in
     * the BST (or subtree) whose root is n.
     * 
     * @param n The root of the BST.
     * @return The sum of the values in the BST whose
     * root is n.
     */
    private double sum(Node n) 
    {
        if(n == null){
            return 0;
        } else {
            return n.data + sum(n.left) + sum(n.right);
        }
    }

    /**
     * Returns the number of leaves in the BST.
     * 
     * @return The number of leaves in the BST.
     */
    public int numLeaves() 
    {    
        return numLeaves(root);
    }

    /**
     * Returns the number of leaves in the BST whose
     * root is node n.
     * 
     * @param The root of the BST (or subtree).
     * @return The number of leaves in the BST whose
     * root is node n.
     */
    private int numLeaves(Node n) 
    {

        if(n == null){
            return 0;
        } else {
            if(n.left == null && n.right == null){
                return 1;
            } else{
                return numLeaves(n.right) + numLeaves(n.left);
            } 
        }
    }

    /**
     *  Returns true if the value exists in the BST and false
     *  otherwise.  Finds the value recursively.
     *  Call the recursive method appropriately.
     *
     * @param value The value to search for in the BST.
     * @return true If the value is found and false otherwise.
     */
    public boolean contains(double value) 
    {
        //YOUR CODE HERE.
        return  contains(root,value);
    }

    /**
     *  Returns true if the value exists in the BST whose root
     *  is n and false otherwise.  Finds the value recursively.
     *
     * @param value The value to search for in the BST (or subtree)
     * whose root is n.
     * @return true If the value is found and false otherwise.
     */    
    private boolean contains(Node n, double value) 
    {
        //YOUR CODE HERE.
        if(n == null){
            return false;

        }

        if(n.data == value){
            return true;
        }else if(n.data < value) {
            return contains(n.right ,value );

        }else {
            return contains(n.left ,value );
        }

    }

    /**
     * Returns the number of "As" stored in the BST.  An
     * A is a value in the range [90.0, 100.0].
     * 
     * @return The number of values in the BST in the range
     * [90.0, 100.0].
     */
    public int numAs() 
    {
        //YOUR CODE HERE.
        return  numAs(root);
    }

    /**
     * Returns the number of "As" stored in the BST whose root
     * is n.  An A is a value in the range [90.0, 100.0].
     * 
     * @return The number of values in the range
     * [90.0, 100.0] in the BST (or subtree) whose
     * root is n.
     */
    private int numAs(Node n) 
    {
        //YOUR CODE HERE.
        if(n == null){
            return 0;
        } else {
            if(n.data >= 90.0 && n.data  <= 100.0){
                return 1 +  numAs(n.right) + numAs(n.left) ;   
            } else{
                return numAs(n.right) + numAs(n.left);
            } 
        }
    }

    /**
     * Returns the smallest value in the BST.
     * 
     * Precondition:  There is at least one node in the BST.
     * @return The smallest value in the BST.
     */
    public double getSmallest() 
    {
        //YOUR CODE HERE.
        return getSmallest(root);
    }

    /**
     * Returns the smallest value in the BST 
     * whose root is n.
     * 
     * @return The smasses value in the BST (or
     * subtree) whose root is n.
     */
    private double getSmallest(Node n) 
    {
        //YOUR CODE HERE.
        if(n == null){
            return 0;
        } else {
            if(  n.left.data < n.data){
                return 1 + numAs(n.left) ;   
            } else{
                return  numAs(n.left);
            } 
        }
    }

    /**
     * Adds the value to the BST. Uses an iterative
     * algorithm.
     * 
     * @param value The value to insert into the BST.
     */
    public void addIterative(double value) 
    {
        Node nNode = new Node(value, null, null);
        Node node = root;

        if(root == null){
            root = nNode;
            return;
        }

        while(true){
            if(node.data < nNode.data){
                if(node.right == null){
                    node.right = nNode;
                    return;
                }
                node = node.right;
            } else if(node.data > nNode.data){
                if(node.left == null){
                    node.left = nNode;
                    return;
                }
                node = node.left;
            }
        }
    }

    /**
     * Returns the largest value in the BST. Assumes the BST 
     * contains at least one value. 
     * 
     * @return the largest value in the (non-empty) BST.
     */
    public double getLargestIterative() {
        return getLargestIterative(root);
    }

    /**
     * Returns the largest value in the BST (or subtree) 
     * whose root is n. Uses an iterative algorithm.
     * 
     * Precondition:  The BST contains at least one value.  
     * @param n The root of BST being searched. 
     * @return The largest value in the BST (or subtree) whose
     * root is n.
     */
    private double getLargestIterative(Node n) 
    {
        if(n == null){
            return 0;
        }

        while(n.right != null){
            n = n.right;
        }
        return n.data;

    }

    /**
     * Removes the largest value in the BST.  Uses an
     * iterative algorithm. 
     */
    public void removeLargestIterative() 
    {
        // Case 1 - removing from empty tree - do nothing

        if(root != null){
            if (root.right == null) {
                // Case 2 - root node stores largest value
                root = root.left;
            } else {
                // Case 3 - largest is not at the root
                removeLargestIterative(root);
            }
        }
    }

    /**
     * Removes the largest value in the BST whose root is n using
     * an iterative algorithm.
     * 
     * Precondition:  n is not null and n itself does not contain the 
     * largest value in its subtree. In other words, n.right != null. 
     * 
     * @param n The root of the BST (or subtree) whose largest value is 
     * removed.
     */
    private void removeLargestIterative(Node n) { 
        Node parentNode = n;

        while(n.right != null){
            parentNode = n;
            n = n.right;
        }

        if(n.left != null){
            parentNode.right = n.left;
            n.left = null;
        } else{
            parentNode.right = null;
        }

    }

    /**
     * Removes one copy of the value from the tree. If value is
     * not in tree, it does nothing.
     * 
     * @param value the value being removed
     */
    public void remove(int value) {
        // Step 1: Find a node containing the value - do this  
        // by moving current down the tree until it points to
        // a node containing the value is found, with 
        // parentOfCurrent trailing behind it.
        Node current = root;
        Node parentOfCurrent = null;

        //YOUR CODE FOR STEP 1 HERE.

        while( current != null || current.data == value){
            if(current.data == value ){
                break;
            }else if (current.data < value){
                parentOfCurrent = current;
                current = current.right;

            } else {
                parentOfCurrent = current;
                current = current.left;
            }
        }

        //Step 2: Remove the node
        //At this point, current should refer to a node containing
        //the value, or it is null if the value is not in the tree.
        //And parentOfCurrent should refer to..well, the
        //parent of current:-)

        //Case 1 - current is null, meaning the value is not in 
        //the tree - do nothing

        //the tree - do nothing

        if(current != null){

            if (current.left == null && current.right == null) {
                //Case 2 - current node has no children
                //REMOVE THE SINGLE LINE COMMENTS AND COMPLETE THE MISSING CODE
                if (current == root) {
                    root = null;
                } else if (parentOfCurrent.left == current) {
                    parentOfCurrent.left = null;
                } else {
                    parentOfCurrent.right = null;
                }
            } else if (current.left == null || current.right == null) {
                //Case 3 - current node has only 1 child
                if (current == root) {
                    //YOUR CODE HERE.
                  
                    if(root.left != null){
                       root = root.left;
                      
                    }
                    if(root.right != null){
                       root = root.right;
                       
                    }
                }
                else if (parentOfCurrent.left == current) {
                    //YOUR CODE HERE.
                    if(current.left == null ){
                        parentOfCurrent.left = current.right;
                    }else{
                        parentOfCurrent.left = current.left;

                    }
                }
                else {
                    //YOUR CODE HERE.
                    if(current.right == null ){
                        parentOfCurrent.right = current.left;

                    }else{
                        parentOfCurrent.right = current.right;

                    }

                }
            } else if (current.left != null && current.right != null) {
                // Case 4 - current has 2 children
                //YOUR CODE HERE.

                current.data = getLargestIterative(current.left);
                removeLargestIterative(current.left);
            }
        }
    }
    

    /**
     * Inserts all the elements of the BinarySearchTree into array list.
     * @param Root of the BinarySearchTree 
     * @param ArrayList to store the values of BinarySearchTree 
     */
    public void bstIntoArraylist(Node root , ArrayList<Double> array){
        if(root == null){
            return;
        } 
        bstIntoArraylist(root.left,array);
        array.add(root.data);
        bstIntoArraylist(root.right,array);
    }

    /**
     * Checks if two trees contains the same values
     * 
     * @param BinarySearchTree 
     */
    public boolean equals (Object obj){
        BinarySearchTree  other= (BinarySearchTree) (obj);
        if (this.root == null && other.root == null) {
            return true;
        }
        if ((this.root == null && other.root != null) || (this.root != null && other.root == null)){
            return false;
        }
        ArrayList<Double> bstOne = new  ArrayList<Double>();
        ArrayList<Double> bstTwo = new  ArrayList<Double>();
        bstIntoArraylist(this.root,bstOne);
        bstIntoArraylist(other.root,bstTwo);

        boolean isEqual = false;
        if(bstOne.equals(bstTwo)){
            isEqual = true;
        }
        return isEqual;
    }

    public Node getRoot(){
        return this.root;
    }

    public boolean  shapeEquals (Node root1 , Node root2){

        if(root1 == null && root2 == null){
            return true;
        }else if(root1 == null && root2 != null){
            return false;

        }else if(root1 != null && root2 == null){
            return false;

        }

        if(root1 != null && root2 != null){
            return (root1.data == root2.data && shapeEquals(root1.left, root2.left) 
                && shapeEquals(root1.right , root2.right)  );

        }

        return false;
    }
}

