class Tester {

	public static int[][] multiply(int arr1[][],int arr2[][]) {
	
        int N = arr1.length; 
        int[][] arr3 = new int[N][N];
        
      
		for(int i = 0; i < N; i++) {
           
			for(int j = 0; j < N; j++) {
                
                int sum = 0;
				for(int k = 0; k < N; k++) {
					sum += arr1[i][k] * arr2[k][j];
				}
                arr3[i][j] = sum;
			}
		}
		return arr3;
	}
	
	public static void main(String[] args) {
        
       
		int arr1_1[][]=new int [][] {{2,4},{1,4}};
		int arr2_1[][]=new int [][] {{1,4},{1,3}};
		
		int[][] arr3_1 = multiply(arr1_1,arr2_1);
		
        System.out.println("--- Sample 1 Output ---");
		for(int index1=0;index1<arr3_1.length;index1++){
			for(int index2=0;index2<arr3_1.length;index2++){
				System.out.print(arr3_1[index1][index2]+" ");
			}
			System.out.println();
		}
        
        System.out.println("\n------------------------------");

        // Sample 2 Test: Expected Output: [[16, 16], [16, 16]]
		int arr1_2[][]=new int [][] {{2,2},{2,2}};
		int arr2_2[][]=new int [][] {{4,4},{4,4}};

		int[][] arr3_2 = multiply(arr1_2,arr2_2);
		
        System.out.println("--- Sample 2 Output ---");
		for(int index1=0;index1<arr3_2.length;index1++){
			for(int index2=0;index2<arr3_2.length;index2++){
				System.out.print(arr3_2[index1][index2]+" ");
			}
			System.out.println();
		}
	}
}
