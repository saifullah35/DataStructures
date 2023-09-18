/**
 * This is the public interface for a stack.
 * 
 * @author Prof. White
 * @version Spring 2018
 */
public interface QueueInterface<E>
{
    void enqueue(E element);
    E dequeue();
    E getFront();
    boolean isEmpty();
    void clear();
}
