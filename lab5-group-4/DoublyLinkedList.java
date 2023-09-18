import java.util.NoSuchElementException;
import java.lang.StringBuffer;

/**
 * This class implements some of the methods of a doubly linked list.
 * 
 * You may not add any additional methods or import statement.  
 * You may not use any arrays.
 * 
 * @author Jonathan Masih and Saif ullah
 * @version 4/12/2021
 */
public class DoublyLinkedList<E> 
{

    /**
     * This inner class represents one node in the list.
     */
    protected class Node<E>
    {
        //The value of the node.
        private E value;

        //A pointer to the next node in the list.
        private Node<E> next;

        //A pointer to the previous node in the list.
        private Node<E> previous;

        /**
         * Constructs a new node.
         * 
         * @param value The value of the new node.
         */
        private Node(E value)
        {
            this.value = value;
            next = null;
            previous = null;
        }
    }

    //Doubly linked list instance variables.

    //The number of nodes in the list.
    private int size;

    //The first node in the list.
    private Node<E> head;

    //The last node in the list.
    private Node<E> tail;

    /**
     * Constructs a new, empty doubly linked list.
     */
    public DoublyLinkedList()
    {
        size = 0;
        head = null;
        tail = null;
    }

    /**
     * Returns the number of nodes in the list.
     * 
     * @return The number of nodes in the list.
     */
    public int getSize()
    {
        return size;
    }

    /**
     * Adds (inserts) a node to the BEGINNING of the list.
     * 
     * Postcondition: The list is modified to have the element inserted
     * at the position.
     *
     * @param element The element to be added to the start of the list.
     */
    public void addAtStart(E element)
    {
        //Comments are provided to help you get started.
        //Follow the comments to complete this method.

        //create a new node
        Node newNode = new Node<E>(element);

        //If the list is empty, 
        if(size == 0){
            //set the head and tail to the new node.
            head = newNode;
            tail = newNode;

        }else{
            //The new node's next pointer should point
            //at the head of the list.
            newNode.next = head;

            //The head's previous pointer should point
            //at the new node.
            head.previous = newNode;

            //The head of the list should be the new node.
            head = newNode;

        }
        //Update the number of nodes in the list.
        size++;
    }

    /**
     * Adds (inserts) a node to the END of the list.
     * 
     * Postcondition: The list is modified to have the element inserted
     * at the position.
     *
     * @param element The element to be added to the end of the list.
     */
    public void addAtEnd(E element)
    {
        //Comments are provided to help you get started.
        //Follow the comments to complete this method.

        //create a new node
        Node newNode = new Node<E>(element);

        //If the list is empty, 
        if(size == 0){
            //set the head and tail to the new node.
            head = newNode;
            tail = newNode;

        }else{
            //The next point of the tail should point at
            //the new node.
            tail.next = newNode;

            //The node's previous pointer should point at
            //the tail.
            newNode.previous = tail;

            //The tail of the list should be the new node.
            tail = newNode;

        }
        //Update the number of nodes in the list.
        size++;

    }

    /**
     * Deletes a node from the BEGINNING of the list.  
     * 
     * @throws NoSuchElementException if there are no nodes in
     * the list.
     */
    public void deleteFromStart() 
    {
        if(size == 0){
            throw new NoSuchElementException("Cannot delete from an empty list.");
        } else{
            head = head.next;
            head.previous.next = null;
            head.previous = null;
            size--;
        }

    }

    /**
     * Deletes a node from the END of the list.
     * 
     * @throws NoSuchElementException if there are no nodes in
     * the list.
     */
    public void deleteFromEnd() 
    {
        Node<E> temp = tail.previous;
        if(size == 0){
            throw new NoSuchElementException("Cannot delete from an empty list.");
        }else {
            tail = temp;
            tail.next = null;
            size--;
        }
    }

    /**
     * Returns the value of the node at the input index.
     * 
     * @param index The index of the node whose value will be returned.
     * @return The value of the node at the index.
     * @throws IndexOutOfBoundsException if index < 0 or index >= size of the list.
     * @throws NoSuchElementException if there are no elements in the list.
     */
    public E elementAt(int index) 
    {

        if(size == 0){
            throw new NoSuchElementException("Cannot access an element in an empty list.");
        } else if(index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Attempt to access an element at index " + index + 
                " in a list with " + size + " elements.");
        }

        //complete this method
        Node<E> currentNode = head;
        int currentNodeIndex = 0;
        while(index != currentNodeIndex){
            currentNode = currentNode.next;
            currentNodeIndex++; 

        }

        return currentNode.value;
    }

    /**
     * Deletes the node at the input index.
     * 
     * @param index The index of the node to be deleted.
     * @throws IndexOutOfBoundsException if index < 0 or index >= size of the list.
     * @throws NoSuchElementException if there are no elements in the list.
     */
    public void deleteAtIndex(int index) throws IndexOutOfBoundsException, NoSuchElementException
    {
        if(size == 0){
            throw new NoSuchElementException("Cannot delete from an empty list.");
        } else if(index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        //complete this method
        Node<E> currentNode2 = head;
        int currentNodeIndex = 0;
        while(index != currentNodeIndex){
            currentNode2 = currentNode2.next;
            currentNodeIndex++; 

        }
        if(currentNode2 == head){
            head = null;
            size--;
        }else if(currentNode2  == tail){
            currentNode2.previous.next = null;
            currentNode2.previous = null;
            size--;
        }else{
            currentNode2.previous.next = currentNode2.next;
            currentNode2.next.previous = currentNode2.previous;
            currentNode2.next = null;
            currentNode2.previous = null;
            size--;
        }

    }
    /**
     * Returns a String representation of the doubly linked list.
     * If the list is empty, returns < >.
     * If the list has values 1 and 2, returns < 1 2 >.
     * 
     * YOU MAY NOT CALL ANY OTHER METHODS.
     * 
     * @returns a String representation of the doubly linked list.
     */
    @Override
    public String toString()
    {
        //Use the StringBuffer class to complete this method.
        StringBuffer sb = new StringBuffer();

        if(size == 0){
            sb.append("< >");
            return sb+"";
        }else{
            sb.append("< ");
            Node<E> currentNode = head;
            for(int i = 0; i < size ; i++){
                if(currentNode.value != null){
                    sb.append(currentNode.value + " ");
                }
                currentNode = currentNode.next;
            }
            sb.append(">");
        }

        return sb.toString();
    }

    /** Returns a String representation of the doubly linked list
     * with the values in reverse order.
     * 
     * If the list is empty, returns < >.
     * If the list has values 1 and 2, returns < 2 1 >.
     * 
     * YOU MAY NOT CALL ANY OTHER METHODS.
     * 
     * @returns a String representation of the doubly linked list
     * with the values in reverse order.
     */
    public String toStringReverse()
    {
        StringBuffer sb = new StringBuffer();

        if(size == 0){
            sb.append("< >");
            return sb+"";
        }else if (size == 1) {
              return toString();
        }else{
            sb.append("< ");
            Node<E> currentNode = tail;
            for(int i= size ; i > 0 ; i--){
                sb.append(currentNode.value + " ");
                currentNode = currentNode.previous;
            }
            sb.append(">");
        }

        return sb+"";
    }
}
