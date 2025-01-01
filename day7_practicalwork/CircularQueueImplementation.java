package day7_practicalwork;

public class CircularQueueImplementation {
	
	static class CircularQueue {
	    private int[] queue;      // Array to store queue elements
	    private int front;        // Points to the front element in the queue
	    private int rear;         // Points to the rear element in the queue
	    private int size;         // Current size of the queue
	    private int capacity;     // Maximum capacity of the queue

	    // Constructor to initialize the queue with a specific capacity
	    public CircularQueue(int capacity) {
	        this.capacity = capacity;
	        queue = new int[capacity];
	        front = 0;
	        rear = -1;
	        size = 0;
	    }

	    // Enqueue operation: Adds an element to the rear of the queue
	    public void enqueue(int item) {
	        if (isFull()) {
	            System.out.println("Queue is full. Cannot enqueue " + item);
	        } else {
	            rear = (rear + 1) % capacity; // Circular increment of rear
	            queue[rear] = item;
	            size++;
	            System.out.println(item + " enqueued to queue.");
	        }
	    }

	    // Dequeue operation: Removes an element from the front of the queue
	    public int dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty. Cannot dequeue.");
	            return -1;  // Return an error code
	        } else {
	            int item = queue[front];
	            front = (front + 1) % capacity; // Circular increment of front
	            size--;
	            return item;
	        }
	    }

	    // Peek operation: Returns the front element of the queue
	    public int peek() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty. Cannot peek.");
	            return -1;  // Return an error code
	        } else {
	            return queue[front];
	        }
	    }

	    // isFull operation: Checks if the queue is full
	    public boolean isFull() {
	        return size == capacity;
	    }

	    // isEmpty operation: Checks if the queue is empty
	    public boolean isEmpty() {
	        return size == 0;
	    }

	    // Display the current state of the queue
	    public void display() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty.");
	        } else {
	            System.out.print("Queue elements: ");
	            for (int i = 0; i < size; i++) {
	                System.out.print(queue[(front + i) % capacity] + " ");
	            }
	            System.out.println();
	        }
	    }
	}

	    public static void main(String[] args) {
	        CircularQueue q = new CircularQueue(5);  // Create a queue of capacity 5

	        // Test enqueue and dequeue operations
	        q.enqueue(10);
	        q.enqueue(20);
	        q.enqueue(30);
	        q.enqueue(40);
	        q.enqueue(50);

	        q.display();

	        System.out.println("Dequeued: " + q.dequeue());
	        q.enqueue(60);

	        q.display();

	        System.out.println("Front element: " + q.peek());
	    }

	
		
}