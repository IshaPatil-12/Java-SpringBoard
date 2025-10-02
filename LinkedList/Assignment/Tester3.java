package Assignment;

import java.util.LinkedList;
import java.util.List;

class Queue {
    private List<String> queue;   // LinkedList to store queue elements
    private int capacity;         // Maximum size of the queue

    // Constructor
    public Queue(int capacity) {
        this.capacity = capacity;
        this.queue = new LinkedList<>();
    }

    // Add element to the queue
    public void enqueue(String element) {
        if (queue.size() < capacity) {
            queue.add(element);
        } else {
            System.out.println("Queue is full. Cannot add " + element);
        }
    }

    // Remove element from the queue
    public void dequeue() {
        if (!queue.isEmpty()) {
            queue.remove(0);
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
        }
    }

    // Return the queue
    public List<String> getQueue() {
        return queue;
    }
}

public class Tester3 {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        
        queue.enqueue("Emily");
        queue.enqueue("Lily");
        queue.enqueue("Rachel");
        queue.enqueue("Rose");
        
        queue.dequeue();  // Removes Emily
        queue.dequeue();  // Removes Lily

        System.out.println(queue.getQueue());  // Expected: [Rachel, Rose]
    }
}

