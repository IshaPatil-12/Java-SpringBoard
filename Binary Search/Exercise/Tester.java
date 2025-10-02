class Tester {
	
	public static int iterations = 0;
	
	public static int searchElement(int elements[],int low,int high,int elementToBeSearched)	{
		
        if (low > high) {
            return -1;
        }

        iterations++;
        
        int mid = low + (high - low) / 2;
        
        if (elements[mid] == elementToBeSearched) {
            return mid;
        } 
        else if (elements[mid] > elementToBeSearched) {
            return searchElement(elements, low, mid - 1, elementToBeSearched);
        } 
        else {
            return searchElement(elements, mid + 1, high, elementToBeSearched);
        }
	}
	
	public static void main(String[] args) {
	    
	    System.out.println("--- Sample 1: Searching for 43 ---");
	 	int[] elements1 = { 1, 23, 43, 46, 78, 90 };
		int elementToBeSearched1 = 43;
        
        iterations = 0; 
		
		int indexPosition1 = searchElement(elements1, 0, elements1.length-1, elementToBeSearched1);
		
		if (indexPosition1 == -1)
			System.out.println("Element not found!");
		else
			System.out.println("Element found at index position " + indexPosition1+"!");
		
		System.out.println("Number of iterations: "+iterations);
        
        System.out.println("\n-------------------------------------");

        System.out.println("--- Sample 2: Searching for 99 ---");
	 	int[] elements2 = { 34, 45, 77, 87, 96, 105, 120 };
		int elementToBeSearched2 = 99;
        
        iterations = 0; 
		
		int indexPosition2 = searchElement(elements2, 0, elements2.length-1, elementToBeSearched2);
		
		if (indexPosition2 == -1)
			System.out.println("Element not found!");
		else
			System.out.println("Element found at index position " + indexPosition2+"!");
		
		System.out.println("Number of iterations: "+iterations);
	}

	
}