import java.lang.StringBuffer;
import java.util.EmptyStackException;

/**
 * Implements a generic stack.  
 * 
 * @author (Saif Ullah and Jonathan Masih)
 * @version (April 26, 2021)
 */
public class Stack<E> implements StackInterface<E>
{
    private class Node<E>
    {
        private E value;
        private Node<E> next;

        public Node(E value, Node<E> next)
        {
            this.value = value;
            this.next = next;
        }
    }

    private Node<E> head;
    private int size;

    public Stack()
    {
        head = null;
        size = 0;
    }

    //add the required methods here

    //PUSH ADDS ELEMENT TO TOP OF THE STACK
    public void push(E element){
        Node newNode = new Node<E>(element,head);
        Node<E> temp = head;
        head = newNode;
        head.next = temp;
        size++;

    }

    // POP REMOVES AND RETURNS ELEMENT FROM TOP OF THE STACK
    public E pop(){
        Node<E> temp = head;
        head = head.next;
        temp.next = null;
        size--;

        return temp.value;
    }

    //PEEK RETURNS THE ELEMENT ON THE TOP
    public E peek(){
        if(size == 0){
            return null;
        }else {
            return head.value;
        }

    }
    //isEmpty METHOD TO CHECK IF STACK IS EMPTY
    public boolean isEmpty(){
        boolean empty = true;
        if(head == null){
            return empty;
        }else{
            empty = false;

        }

        return empty;
    }

    //EMPTIES THE STACK
    public void clear(){
        head.next = null;
        head = null;
        size = 0;

    }

    //returns the position of the input parameter in the stack and  -1 if it is not in the stack. 
    public int search(Object obj){
        Node<E> currentNode = head;
        E temp = (E)obj;
        int index = -1;
        for(int i = 1; i <= size; i++){
            if(currentNode.value.equals(temp )){
                index = i;
                break;
            } 
            currentNode = currentNode.next;
        }  
        return index;
    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        Node<E> currentNode = head;
        if(size == 0){
            return "";
        }else{
            for(int i = 0; i < size  ; i++){
                if(currentNode != null){
                    sb.append( currentNode.value + " ");
                }
                currentNode = currentNode.next;
            }
      
        }
        return  sb.toString().trim();
    }

}
