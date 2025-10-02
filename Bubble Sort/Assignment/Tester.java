class Tester {

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

	public static void sortArray(int arr[]) {
		int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(arr, i, minIndex);
            }
        }
	}

	public static int findMaxSum(int arr[], int m) {
        int n = arr.length;
        int maxSum = 0;
        
        for (int i = 0; i < m; i++) {
            maxSum += arr[n - 1 - i];
        }
        
		return maxSum;
	}

	public static int findMinSum(int arr[], int m) {
        int minSum = 0;
        
        for (int i = 0; i < m; i++) {
            minSum += arr[i];
        }
        
		return minSum;
	}

	public static void main(String[] args) {
        
		int arr1[] = { 64, 34, 25, 12, 22, 11, 90 };
        sortArray(arr1);
        
		System.out.println("Maximum Sum for m=4: " + findMaxSum(arr1, 4));
		System.out.println("Minimum Sum for m=3: " + findMinSum(arr1, 3));
        
        System.out.println("\n-------------------------------------");

        int arr2[] = { 5, 4, 3, 2, 1 };
        sortArray(arr2);
        
        System.out.println("Maximum Sum for m=5: " + findMaxSum(arr2, 5));
        
        System.out.println("Minimum Sum for m=1: " + findMinSum(arr2, 1));
	}

}