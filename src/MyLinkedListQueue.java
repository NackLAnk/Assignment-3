import java.util.NoSuchElementException;
import java.util.LinkedList;


public class MyLinkedListQueue<T> {
    private LinkedList<T> queue;
    // Creates a new, empty queue.
    public MyLinkedListQueue() {
        queue = new LinkedList<>();
    }
    // Adds an element to the back of the queue.
    public void enqueue(T element) {
        queue.addLast(element);
    }

}
