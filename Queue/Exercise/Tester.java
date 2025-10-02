class Queue {
      
    private int front;
    private int rear;
    private int maxSize;
    private int arr[];
      
    Queue(int maxSize) {
        this.front = 0;
        this.rear = -1;
        this.maxSize = maxSize;
        this.arr = new int[this.maxSize];
    }
      
    public boolean isFull() {
        if (rear == maxSize - 1) {
            return true;
        }
        return false;
    }
            
    public boolean enqueue(int data) {
        if (isFull()) {
            return false;
        } else {
            arr[++rear] = data;
            return true;
        }
    }

    public void display() {
        if(isEmpty())
            System.out.println("Queue is empty!");
        else {
            for (int index = front; index <= rear; index++) {
                // Ensure only valid elements are displayed (if MIN_VALUE is used by dequeue)
                if (arr[index] != Integer.MIN_VALUE) { 
                    System.out.println(arr[index]);
                }
            }
        }
    }
            
    public boolean isEmpty() {
        if (front > rear)
            return true;
        return false;
    }
            
    public int dequeue() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        } else {
            int data = arr[this.front];
            arr[front++] = Integer.MIN_VALUE;
            return data;
        }
    }

    public int getMaxSize() {
        return maxSize;
    }
}


class Tester {

    public static Queue[] splitQueue(Queue queue) {
       
        int size = queue.getMaxSize();
        Queue oddQueue = new Queue(size);
        Queue evenQueue = new Queue(size);

       
        while (!queue.isEmpty()) {
            int element = queue.dequeue();
            
            
            if (element % 2 != 0) {
              
                oddQueue.enqueue(element);
            } else {
              
                evenQueue.enqueue(element);
            }
        }

       
        Queue[] result = new Queue[2];
        result[0] = oddQueue;
        result[1] = evenQueue;
        
        return result; 
    }

    public static void main(String[] args) {
            
        Queue queue = new Queue(7);
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(9);
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(5);
        queue.enqueue(10);
       

        Queue[] queueArray = splitQueue(queue);
            
        System.out.println("Elements in the queue of odd numbers");
        queueArray[0].display();
            
        System.out.println("\nElements in the queue of even numbers");
        queueArray[1].display();
    }
}
