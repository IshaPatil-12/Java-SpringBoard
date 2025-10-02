class Tester {
	
	public static int[] getMaxMin(int arr[], int low, int high) {	
        int[] maxMin = new int[2];

       
        if (low == high) {
            maxMin[0] = arr[low]; // max
            maxMin[1] = arr[low]; // min
            return maxMin;
        }

        
        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                maxMin[0] = arr[low];
                maxMin[1] = arr[high];
            } else {
                maxMin[0] = arr[high];
                maxMin[1] = arr[low];
            }
            return maxMin;
        }

        
        int mid = low + (high - low) / 2;
        
       
        int[] leftMaxMin = getMaxMin(arr, low, mid);
        
       
        int[] rightMaxMin = getMaxMin(arr, mid + 1, high);

      
        
        
        if (leftMaxMin[0] > rightMaxMin[0]) {
            maxMin[0] = leftMaxMin[0];
        } else {
            maxMin[0] = rightMaxMin[0];
        }

       
        if (leftMaxMin[1] < rightMaxMin[1]) {
            maxMin[1] = leftMaxMin[1];
        } else {
            maxMin[1] = rightMaxMin[1];
        }

        return maxMin;
	}
	
	public static void main(String args[]) {	
       
	 	int arr1[] = {1000, 10, 5, 1, 2000};	

	 	int[] maxMin1 = getMaxMin(arr1, 0, arr1.length - 1);
	 	
        System.out.println("--- Sample 1 ---");
	 	System.out.println("Minimum value is "+ maxMin1[1]);	
	 	System.out.println("Maximum value is "+ maxMin1[0]);	
        
        System.out.println("\n-------------------------------------");

       
	 	int arr2[] = {2, 3};	

	 	int[] maxMin2 = getMaxMin(arr2, 0, arr2.length - 1);
	 	
        System.out.println("--- Sample 2 ---");
	 	System.out.println("Minimum value is "+ maxMin2[1]);	
	 	System.out.println("Maximum value is "+ maxMin2[0]);
	}
}