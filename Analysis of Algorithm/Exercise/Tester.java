class Tester {
	
	public static int searchElement(int[] elements, int elementToBeSearched) {
		
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == elementToBeSearched) {
				return i + 1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] elements1 = { 76, 24, 78, 98, 1 };
		int elementToBeSearched1 = 78;
		
		int numberOfIterations1 = searchElement(elements1, elementToBeSearched1); 
		
        System.out.println("--- Sample 1 ---");
		if (numberOfIterations1 == -1)
			System.out.println("Element not found!");
		else
			System.out.println("Element found! Number of iterations required to find the element : " + numberOfIterations1);
            
        System.out.println("\n------------------------------");

		int[] elements2 = { 234, 345, 367, 387, 456, 675, 654 };
		int elementToBeSearched2 = 346;
		
		int numberOfIterations2 = searchElement(elements2, elementToBeSearched2);
        
        System.out.println("--- Sample 2 ---");
        if (numberOfIterations2 == -1)
			System.out.println("Element not found!");
		else
			System.out.println("Element found! Number of iterations required to find the element : " + numberOfIterations2);
	}
	
}
