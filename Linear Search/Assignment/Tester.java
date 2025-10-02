class Tester {
	
	public static int searchEmployeeId(int[] employeeIds, int employeeIdToBeSearched) {
		
		for (int i = 0; i < employeeIds.length; i++) {
			if (employeeIds[i] == employeeIdToBeSearched) {
				return i + 1;
			}
		}
		
		return -1;
	}

	public static void main(String a[]) {
        
		int[] employeeIds1 = { 8011, 8012, 8015, 8016, 8020, 8022, 8025 };
		int employeeIdToBeSearched1 = 8022;
		
		int numberOfIterations1 = searchEmployeeId(employeeIds1, employeeIdToBeSearched1);
		
        System.out.println("--- Sample 1 ---");
		if (numberOfIterations1 == -1)
			System.out.println("Employee Id " + employeeIdToBeSearched1 + " is not found!");
		else
			System.out.println("Employee Id " + employeeIdToBeSearched1 + " is found! Number of iterations : " + numberOfIterations1);
            
        System.out.println("\n-------------------------------------");

		int[] employeeIds2 = { 23214, 23325, 23337, 23347, 23456, 23685, 23684 };
		int employeeIdToBeSearched2 = 23215;
		
		int numberOfIterations2 = searchEmployeeId(employeeIds2, employeeIdToBeSearched2);
        
        System.out.println("--- Sample 2 ---");
        if (numberOfIterations2 == -1)
			System.out.println("Employee Id " + employeeIdToBeSearched2 + " is not found!");
		else
			System.out.println("Employee Id " + employeeIdToBeSearched2 + " is found! Number of iterations : " + numberOfIterations2);
	}
}