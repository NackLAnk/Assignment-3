import java.util.LinkedList;
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
}
