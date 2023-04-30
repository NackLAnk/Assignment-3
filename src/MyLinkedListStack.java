import java.util.LinkedList;
import java.util.EmptyStackException;
public class MyLinkedListStack<E> {
    private LinkedList<E> stack; // instance variable of type LinkedList

    /**
     * Constructor to initialize the instance variable as a new empty LinkedList.
     */
    public MyLinkedListStack() {
        stack = new LinkedList<>();
    }
    public void push(E element) {
        stack.addFirst(element);
    }
    public E peek() {
        if (ifIsEmpty()) {
            throw new EmptyStackException();
        }
        return stack.getFirst();
    }
    public boolean ifIsEmpty() {
        return stack.isEmpty();
    }
    public int size() {
        return stack.size();
    }
    public E pop() {
        if (ifIsEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
}
