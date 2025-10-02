package Assignment;

import java.util.LinkedList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

class Tester1 {
	
	public static List<Integer> findCommonElements(List<Integer> listOne, List<Integer> listTwo){
	    
        Set<Integer> setTwo = new HashSet<>(listTwo);
	    List<Integer> commonElements = new LinkedList<>();
	    
        for (Integer element : listOne) {
            if (setTwo.contains(element)) {
                commonElements.add(element);
            }
        }
	    return commonElements;
	}
	
	public static void main(String arga[]){

		// --- Test Case 1 ---
		List<Integer> listOne1 = new LinkedList<>(Arrays.asList(10, 12, 21, 1, 53));
		List<Integer> listTwo1 = new LinkedList<>(Arrays.asList(11, 21, 25, 53, 47));

		List<Integer> result1 = findCommonElements(listOne1, listTwo1);
		System.out.println("--- Test Case 1 Output ---");
		System.out.print(result1.get(0));
        for (int i = 1; i < result1.size(); i++) {
            System.out.print("->" + result1.get(i));
        }
        System.out.println();

        System.out.println("\n" + "-".repeat(30) + "\n");
        
        // --- Test Case 2 ---
        List<Integer> listOne2 = new LinkedList<>(Arrays.asList(51, 45, 63, 15, 82));
        List<Integer> listTwo2 = new LinkedList<>(Arrays.asList(19, 63, 51, 87, 82));
        
        List<Integer> result2 = findCommonElements(listOne2, listTwo2);
        System.out.println("--- Test Case 2 Output ---");
        System.out.print(result2.get(0));
        for (int i = 1; i < result2.size(); i++) {
            System.out.print("->" + result2.get(i));
        }
        System.out.println();
	}
}
