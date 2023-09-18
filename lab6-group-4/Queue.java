/**
 * Implements a generic queue.
 * 
 * @author (Saif Ullah and Jonathan Masih)
 * @version (April 26, 2021)
 */
public class Queue<E> implements QueueInterface<E>
{
    private class Node<E>
    {
        private E value;
        private Node<E> next;
        private Node<E> previous;

        public Node(E value, Node<E> next)
        {
            this.value = value;
            this.next = next;
            this.previous = null;
        }
    }

    private Node<E> head;
    private Node<E> tail;

    public Queue()
    {
        head = null;
        tail = null;
    }

    public void enqueue(E element){
        Node<E> newNode = new Node<E>(element , null );
        if(head != null){
            tail.next =  newNode;
            newNode.previous = tail;
            tail = newNode;
        }else{
            head = newNode;
            tail = newNode;
        }

    }

    public  E getFront(){
        if(head != null){
            return head.value;

        }else{
            return null;
        }
    }

    public boolean isEmpty(){
        if(head == null){
            return true;

        }else {

            return false;
        }
    }

    public void clear(){
        head.next = null;
        head = null;
    }

    public E dequeue(){

        if(head == null ){
            return null;

        }else{
            Node<E> temp = new Node<E>(head.value, head.next);
            if(head.next == null){
                head = null;
                return temp.value;

            }else{
                head = head.next;

                head.previous.next = null;
                head.previous = null;
                return temp.value;

            }

        }

    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        Node<E> currentNode = head;
        if(head == null){
            return "";
        }else{
            while(currentNode != null){

                if(currentNode != null){
                    sb.append( currentNode.value + " ");
                }
                currentNode = currentNode.next;
            }
        }
        return  sb.toString().trim();
    }
}
