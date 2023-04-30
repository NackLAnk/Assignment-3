import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for choosing an option

        System.out.print("choose an option(1 = MyLinkedListStack, 2 = MyLinkedListQueue): ");
        int USER_ANS = scanner.nextInt(); // Users answer

        switch (USER_ANS) {
            case 1:
            MyLinkedListStack<String> stack = new MyLinkedListStack<>();

            stack.push("Hello"); // add "Hello" to the stack

            stack.push("You!"); // add "You!" to the stack

            System.out.println("peek: " + stack.peek()); // Output: "You!", print the top element of the stack

            stack.pop(); // remove the top element of the stack

            System.out.println("peek: " + stack.peek()); // Output: "Hello", print the new top element of the stack

            System.out.println("isEmpty: " + stack.ifIsEmpty()); // Output: false, check if the stack is empty

            System.out.println("size: " + stack.size()); // Output: 1, print the size of the stack

                break;

            case 2:
                MyLinkedListQueue<String> queue = new MyLinkedListQueue<>();

                queue.enqueue("Alice"); // Added Alice
                queue.enqueue("Bob"); // Added Bob

                System.out.println("peek: " + queue.peek()); // Output: Front of queue: Alice

                System.out.println("size: " + queue.size()); // Output: Queue size: 2

                System.out.println("removed: " + queue.dequeue()); // Output: Removed from queue: Alice

                System.out.println("peek: " + queue.peek()); // Output: Front of queue: Bob

                System.out.println("size: " + queue.size()); // Output: Queue size: 1

                queue.enqueue("Alibek");

                System.out.println("size: " + queue.size()); // Output: Queue size: 2

                // Remove all elements from the queue.
                while (!queue.ifIsEmpty()) {
                    System.out.println("removed: " + queue.dequeue());
                }
                // Output:
                // Removed from queue: Bob
                // Removed from queue: Alibek

                break;
            default:
                System.err.print("Wrong Answer, you need to write 1(MyLinkedListStack) or 2(MyLinkedListQueue)");
        }
    }
}