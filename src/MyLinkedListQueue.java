import java.util.NoSuchElementException;
import java.util.LinkedList;

// A queue implementation using a LinkedList as the underlying data structure.
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
    // Removes and returns the front element of the queue.
    public T dequeue() {
        if (ifIsEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.removeFirst();
    }
    // Returns true if the queue is empty, false otherwise.
    public boolean ifIsEmpty() {
        return queue.isEmpty();
    }
    // Returns the number of elements in the queue.
    public int size() {
        return queue.size();
    }
    // Returns the front element of the queue without removing it.
    public T peek() {
        if (ifIsEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.getFirst();
    }
}
