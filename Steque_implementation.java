package Steque;

public class Steque_implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		class Node {
		    int data;
		    Node next;

		    Node(int data) {
		        this.data = data;
		        this.next = null;
		    }
		}

		class Steque {
		    Node top; // Top of the stack
		    Node front; // Front of the queue

		    Steque() {
		        top = null;
		        front = null;
		    }

		    // Method to push element onto the stack
		    void push(int data) {
		        Node newNode = new Node(data);
		        if (top == null) {
		            top = newNode;
		            front = newNode;
		        } else {
		            newNode.next = top;
		            top = newNode;
		        }
		    }

		    // Method to enqueue element into the queue
		    void enqueue(int data) {
		        Node newNode = new Node(data);
		        if (front == null) {
		            top = newNode;
		            front = newNode;
		        } else {
		            front.next = newNode;
		            front = newNode;
		        }
		    }

		    // Method to pop element from the stack
		    int pop() {
		        if (top == null) {
		            System.out.println("Stack is empty");
		            return -1; // Assuming -1 is an invalid value
		        }
		        int popped = top.data;
		        top = top.next;
		        return popped;
		    }

		    // Method to dequeue element from the queue
		    int dequeue() {
		        if (front == null) {
		            System.out.println("Queue is empty");
		            return -1; // Assuming -1 is an invalid value
		        }
		        int dequeued = top.data;
		        if (top.next == null) {
		            front = null;
		        }
		        top = top.next;
		        return dequeued;
		    }

		    void display() {
		        Node current = top;
		        while (current != null) {
		            System.out.print(current.data + " ");
		            current = current.next;
		        }
		        System.out.println();
		    }
		}

		        Steque steque = new Steque();

		        steque.push(10);
		        steque.push(20);
		        steque.push(30);
		        steque.display(); 

		        steque.enqueue(40);
		        steque.enqueue(50);
		        steque.display(); 

		        steque.pop();
		        steque.display(); 

		        steque.dequeue();
		        steque.display(); 
		    }
		
}
