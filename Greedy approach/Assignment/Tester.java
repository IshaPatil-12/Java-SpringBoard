class Tester {
	
	public static int findSwapCount(String inputString) {
		
		int imbalanceCount = 0;
        int swapCount = 0;
        
        for (char c : inputString.toCharArray()) {
            if (c == '(') {
                imbalanceCount++;
            } else {
                imbalanceCount--;
            }
            
            if (imbalanceCount < 0) {
                swapCount++;
                imbalanceCount = 1;
            }
        }
        
		return swapCount;
	}
	
	public static void main(String args[]) {
        String inputString1 = "())()(";
        System.out.println("Number of swaps for " + inputString1 + ": " + findSwapCount(inputString1));

        String inputString2 = "()";
        System.out.println("Number of swaps for " + inputString2 + ": " + findSwapCount(inputString2));
    }
}