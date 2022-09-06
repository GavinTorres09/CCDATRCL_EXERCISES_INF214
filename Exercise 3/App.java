// Array implementation of Stack
public class App {
    public static void main(String[] args) {
  
      // Create new Stack Object
      Stack book_stack = new Stack(5);
  
      // Insert new elements into the stack
      book_stack.push("Science book");
      book_stack.push("Math book");
      book_stack.push("History book");
      book_stack.push("Englsih book");
  
      // Show the size of the stack
      System.out.println("The size of the stack is: " + book_stack.size());
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + book_stack.peek());
  
      // Remove top element in the stack
      book_stack.pop();
  
      System.out.println("After pop");
  
      // Show all elements in Stack
      book_stack.printStack();
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + book_stack.peek());
    }
  }
