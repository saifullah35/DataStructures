import java.lang.StringBuffer;
/**
 * Implements a generic stack in an array.
 * For this implementation, if all of the 
 * array slots are full, then the stack is
 * full and no additional elements can
 * be added.
 * 
 * @author 
 * @version Spring 2019
 */
public class Stack<E> implements StackInterface<E>
{
    //A constant to represent the value of the
    //top of the stack when the stack is empty.
    public static final int EMPTY = -1;

    //The index of the top of the stack or EMPTY
    //if the stack is empty.
    private int top;

    //An array-based stack.
    private E[] stack;

    //Size of array 
    private int size = 0;

    /**
     * Construct a new generic stack of the input size.
     * 
     * Precondition:  size >= 1
     * 
     * @param size The size of the stack to create.
     */
    public Stack(int size)
    {
        top = EMPTY;
        stack = (E[]) new Object[size];
        this.size = 0;
    }

    //Implement all of the methods of the StackInterface<E>.
    //YOUR CODE HERE.
    /**
     * Pushes an item onto the top of this stack
     * @param  the item to be pushed onto this stack.
     */
    public void push(E element){
        if(stack.length <= 0 ){

        }else{
            top++;
            stack[top] = element;

        }
    }

    /**
     * Remove the object at top and return it
     * 
     */
    public E pop(){

        if(top < 0){
            return null;
        }else{
            E value = stack[top];  
            top--;
            return value;

        }

    }

    /**
     * Looks at the object at the top of this stack without removing it 
     * from the stack.
     */
    public E peek(){
        if(top < 0){
            return null;
        }else{
            return stack[top];
        }
    }

    /**
     * Tests to see if that stack is empty
     * 
     * @return true if and only if the stack contains no item and false otherwise
     */
    public boolean isEmpty(){
        if(top < 0){
            return true;

        }else {
            return false;
        }
    }

    /**
     * Clears the stack list
     */
    public void clear(){
        if(top < 0){

        } else{
            for(int i = 0; i < stack.length ; i++){
                stack [i] = null; 

            }
            top = EMPTY;

        }
    }

    /**
     * Return the index of the object on the stack, if it exists.
     * Otherwise, return -1.
     * 
     * @param obj The object to search for in the stack.
     * @return The index of the object in the stack or -1
     * if the object does not exist.
     */
    public int search(Object obj)
    {
        //YOUR CODE HERE
        int index = -1;
        E searchValue = (E) obj;

        for(int i = 0 ; i < stack.length ; i++){
            if(stack[i].equals(searchValue )){
                index = i;
                return index;
            }

        }
        return index;
    }

    /**
     * Return a string representation of the stack where
     * each each object starts on a new line of output
     * when the string is printed.
     * 
     * @return An string representation of the stack as
     * described.
     */
    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        if(stack.length == 0){
            return "";
        }else{
            for(int i = top ; i >= 0; i--){
                if(stack [i] != null){
                    sb.append(stack[i ] + "\n");
                }
            }

        }
        return sb.toString();
    }

}

