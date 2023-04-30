import java.util.LinkedList;
import java.util.EmptyStackException;

public class MyLinkedListStack<E> {
    private LinkedList<E> stack; // instance variable of type LinkedList

    // Constructor to initialize the instance variable as a new empty LinkedList
    public MyLinkedListStack() {
        stack = new LinkedList<>();
    }
    // Adds an element to the top of the stack
    public void push(E element) {
        stack.addFirst(element); // add element to the top of the stack
    }
    // Returns the top element of the stack without removing it
    public E peek() {
        if (ifIsEmpty()) { // check if stack is empty
            throw new EmptyStackException(); // if empty, throw an exception
        }
        return stack.getFirst(); // return the top element of the stack without removing it
    }
    // Checks if the stack is empty
    public boolean ifIsEmpty() {
        return stack.isEmpty(); // check if the stack is empty
    }
    // Returns the number of elements in the stack
    public int size() {
        return stack.size(); // get the number of elements in the stack
    }
    // Removes and returns the top element of the stack
    public E pop() {
        if (ifIsEmpty()) { // check if stack is empty
            throw new EmptyStackException(); // if empty, throw an exception
        }
        return stack.removeFirst(); // remove and return the top element of the stack
    }
}
