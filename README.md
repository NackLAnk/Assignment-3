# Assignment-3

## [![Typing SVG](https://readme-typing-svg.herokuapp.com?color=%2336BCF7&lines=MyLinkedListStack)](https://git.io/typing-svg)

### Methods

1. `push(E element)`: Adds the specified element to the top of the stack.
2. `peek()`: Returns the top element of the stack without removing it.
3. `ifIsEmpty()`: Checks if the stack is empty.
4. `size()`: Returns the number of elements in the stack.
5. `pop()`: Removes and returns the top element of the stack.

### How this code work?

* The `MyLinkedListStack` class uses a `LinkedList` instance variable to implement the stack. The `push` method adds elements to the top of the stack by calling the `addFirst` method of the `LinkedList` class. The `peek` method returns the top element of the stack by calling the `getFirst` method of the `LinkedList` class. The `ifIsEmpty` method checks if the stack is empty by calling the `isEmpty` method of the `LinkedList` class. The `size` method returns the number of elements in the stack by calling the `size` method of the `LinkedList` class. The `pop` method removes and returns the top element of the stack by calling the `removeFirst` method of the `LinkedList` class.

### Usage
``` java 
MyLinkedListStack<String> stack = new MyLinkedListStack<>();

            stack.push("Hello"); // add "Hello" to the stack

            stack.push("You!"); // add "You!" to the stack

            System.out.println("peek: " + stack.peek()); // Output: "You!", print the top element of the stack

            stack.pop(); // remove the top element of the stack

            System.out.println("peek: " + stack.peek()); // Output: "Hello", print the new top element of the stack

            System.out.println("isEmpty: " + stack.ifIsEmpty()); // Output: false, check if the stack is empty

            System.out.println("size: " + stack.size()); // Output: 1, print the size of the stack
```
