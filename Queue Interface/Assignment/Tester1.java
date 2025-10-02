package Assignment;

import java.util.ArrayDeque;
import java.util.Deque;

class Tester1 {

    public static Deque<Character> updateStack(Deque<Character> inputStack) {
		
        int size = inputStack.size();
      
        int firstHalfSize = size / 2;
        
       
        Deque<Character> tempStack = new ArrayDeque<>();
        
        for (int i = 0; i < size - firstHalfSize; i++) {
            tempStack.push(inputStack.pop()); 
        }
       
        Deque<Character> firstHalfQueue = new ArrayDeque<>();
        while (!inputStack.isEmpty()) {
            firstHalfQueue.add(inputStack.pop());
        }
        
        Deque<Character> resultStack = new ArrayDeque<>();
        
   
        while (!tempStack.isEmpty()) {
            resultStack.push(tempStack.pop());
        }
       
        while (!firstHalfQueue.isEmpty()) {
            resultStack.push(firstHalfQueue.poll());
        }
       
        
		return resultStack;
	}
	
	public static void main(String[] args) {
		
		Deque<Character> inputStack = new ArrayDeque<Character>();
		
		inputStack.push('E'); 
		inputStack.push('D');
		inputStack.push('C');
		inputStack.push('B');
		inputStack.push('A'); 
		
		Deque<Character> resultStack = updateStack(inputStack);
		
		System.out.println("The alphabets in updated stack are:");
		
		for(Character alphabet: resultStack)
	     System.out.println(alphabet);
	}
}