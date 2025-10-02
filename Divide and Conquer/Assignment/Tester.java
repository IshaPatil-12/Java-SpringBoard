class Tester {

	public static int findMaxCrossingSubarraySum(int arr[], int low, int mid, int high) {
		
		int leftSum = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = mid; i >= low; i--) {
			sum = sum + arr[i];
			if (sum > leftSum) {
				leftSum = sum;
			}
		}

		int rightSum = Integer.MIN_VALUE;
		sum = 0;
		for (int i = mid + 1; i <= high; i++) {
			sum = sum + arr[i];
			if (sum > rightSum) {
				rightSum = sum;
			}
		}

		return leftSum + rightSum;
	}

	public static int findMaxSum(int arr[], int low, int high) {
		
		if (low == high) {
			return arr[low];
		}

		int mid = low + (high - low) / 2;

		int leftMax = findMaxSum(arr, low, mid);

		int rightMax = findMaxSum(arr, mid + 1, high);

		int crossMax = findMaxCrossingSubarraySum(arr, low, mid, high);

		return Math.max(Math.max(leftMax, rightMax), crossMax);
	}

	public static void main(String[] args) {
        
		int arr1[] = { -2, -5, 6, -2, -3, 1, 5, -6 };
		System.out.println("--- Sample 1 ---");
		System.out.println("Maximum sum: " + findMaxSum(arr1, 0, arr1.length - 1));

        System.out.println("\n-------------------------------------");
        
        int arr2[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println("--- Sample 2 ---");
		System.out.println("Maximum sum: " + findMaxSum(arr2, 0, arr2.length - 1));
	}
}