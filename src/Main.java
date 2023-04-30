import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for choosing an option

        System.out.print("choose an option(1 = MyLinkedListStack, 2 = Soon): ");
        int USER_ANS = scanner.nextInt(); // Users answer

        switch (USER_ANS) {
            case 1:
            MyLinkedListStack<String> stack = new MyLinkedListStack<>();

            stack.push("Hello"); // add "Hello" to the stack

            stack.push("You!"); // add "world" to the stack

            System.out.println(stack.peek()); // Output: "You!", print the top element of the stack

            stack.pop(); // remove the top element of the stack

            System.out.println(stack.peek()); // Output: "Hello", print the new top element of the stack

            System.out.println(stack.ifIsEmpty()); // Output: false, check if the stack is empty

            case 2: break;
        }
    }
}