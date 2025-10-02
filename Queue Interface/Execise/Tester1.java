package Execise;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Collections;

class Tester1 {
    
    public static Deque<Integer> changeSmallest(Deque<Integer> inputStack) {
       
        Deque<Integer> tempStack = new ArrayDeque<>();
        Deque<Integer> resultStack = new ArrayDeque<>();
      
        
        Integer smallest = Integer.MAX_VALUE;
        
        while (!inputStack.isEmpty()) {
            Integer current = inputStack.pop();
            if (current < smallest) {
                smallest = current;
            }
            tempStack.push(current);
        }
        
       
        boolean firstSmallestFound = false;
        Integer smallestValue = smallest; // Store the minimum value

        while (!tempStack.isEmpty()) {
            Integer current = tempStack.pop();
            
           
            if (current.equals(smallestValue) && !firstSmallestFound) {
                firstSmallestFound = true;
            } else {
               
                resultStack.push(current);
            }
        }
        
        Deque<Integer> finalStack = new ArrayDeque<>();
        while (!resultStack.isEmpty()) {
            finalStack.push(resultStack.pop());
        }

        
        finalStack.addLast(smallestValue); 
        
        
        return finalStack;
	}

	public static void main(String[] args) {
		
		Deque<Integer> inputStack = new ArrayDeque<Integer>();
       
		inputStack.push(10); // Bottom
		inputStack.push(8);
		inputStack.push(5);
		inputStack.push(12);
		inputStack.push(5);  // Top
	
		Deque<Integer> updatedStack = changeSmallest(inputStack);
		
		System.out.println("Stack After Modification (Top to Bottom):\n========================================");
       
		for (Integer value : updatedStack)
			System.out.println(value);
	}
}
