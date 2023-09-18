/**
 * This is the public interface for a stack.
 * 
 * @author Prof. White
 * @version Spring 2018
 */
public interface StackInterface<E>
{
    void push(E element);
    E pop();
    E peek();
    boolean isEmpty();
    void clear();
}
