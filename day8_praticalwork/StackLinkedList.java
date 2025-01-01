package day8_praticalwork;

public class StackLinkedList {
	
	    // Node class represents each element in the stack
	    static class Node {
	        int value;
	        Node next;

	        Node(int value) {
	            this.value = value;
	            this.next = null;
	        }
	    }

	    private Node top; // Top of the stack (head of the linked list)

	    // Constructor to initialize the stack
	    public StackLinkedList() {
	        top = null;
	    }

	    // Push operation: Add element to the stack (front of the linked list)
	    public void push(int value) {
	        Node newNode = new Node(value);
	        newNode.next = top; // Point the new node's next to the current top
	        top = newNode; // Make the new node the top of the stack
	        System.out.println(value + " pushed to stack");
	    }

	    // Pop operation: Remove the top element from the stack
	    public int pop() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Stack is empty");
	        }
	        int poppedValue = top.value; // Get the value of the top node
	        top = top.next; // Move the top to the next node
	        return poppedValue; // Return the value of the popped node
	    }

	    // Peek operation: Get the top element without removing it
	    public int peek() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Stack is empty");
	        }
	        return top.value; // Return the value of the top node
	    }

	    // IsEmpty operation: Check if the stack is empty
	    public boolean isEmpty() {
	        return top == null; // The stack is empty if top is null
	    }

	    // Utility function to print the elements of the stack
	    public void printStack() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty");
	            return;
	        }
	        Node current = top;
	        System.out.print("Stack: ");
	        while (current != null) {
	            System.out.print(current.value + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    // Main method to test the stack implementation
	    public static void main(String[] args) {
	        StackLinkedList stack = new StackLinkedList();

	        // Test push operation
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.push(40);

	        // Print the stack
	        stack.printStack();

	        // Test peek operation
	        System.out.println("Top element is: " + stack.peek());

	        // Test pop operation
	        System.out.println("Popped element is: " + stack.pop());
	        stack.printStack();

	        // Test isEmpty operation
	        System.out.println("Is stack empty? " + stack.isEmpty());

	        // Test popping all elements
	        System.out.println("Popped element is: " + stack.pop());
	        System.out.println("Popped element is: " + stack.pop());
	        System.out.println("Popped element is: " + stack.pop());

	        // Stack is now empty
	        stack.printStack();
	        System.out.println("Is stack empty? " + stack.isEmpty());
	    }
	}



