class Tester {

    public static int searchCustomerId(int customerIds[], int customerIdToBeSearched) {
        
        int low = 0;
        int high = customerIds.length - 1;

        while (low <= high) {
            
            int mid = low + (high - low) / 2;

            if (customerIds[mid] == customerIdToBeSearched) {
                return mid;
            } 
            else if (customerIdToBeSearched > customerIds[mid]) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return -1;
    }
	
	public static void main(String[] args) {
        
		int[] customerIds1 = { 80451, 80462, 80465, 80479, 80550, 80561, 80665, 80770 };
		int customerIdToBeSearched1 = 80462;

		int index1 = searchCustomerId(customerIds1, customerIdToBeSearched1);
		
        System.out.println("--- Sample 1 ---");
		if (index1 == -1)
			System.out.println("Customer Id " + customerIdToBeSearched1 + " is not found!");
		else
			System.out.println("Customer Id " + customerIdToBeSearched1 + " is found at index position " + index1 + "!");
            
        System.out.println("\n-------------------------------------");

		int[] customerIds2 = { 147566, 147574, 147575, 147667, 147786, 147798, 147867, 147897 };
		int customerIdToBeSearched2 = 147467;

		int index2 = searchCustomerId(customerIds2, customerIdToBeSearched2);
        
        System.out.println("--- Sample 2 ---");
        if (index2 == -1)
			System.out.println("Customer Id " + customerIdToBeSearched2 + " is not found!");
		else
			System.out.println("Customer Id " + customerIdToBeSearched2 + " is found at index position " + index2 + "!");
	}

}