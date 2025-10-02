package Assignment;

import java.util.LinkedList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList; 

class Tester {

	public static List<Integer> removeDuplicates(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return new LinkedList<>(); 
        }
        
     
        Set<Integer> seen = new HashSet<>();
        
        
        List<Integer> resultList = new LinkedList<>(); 
        
      
        for (Integer element : list) {
          
            if (seen.add(element)) {
                
                resultList.add(element);
            }
            
        }
        
        return resultList;
	}
	
	public static void main(String args[]) {
       
		List<Integer> list1 = new LinkedList<Integer>();
		list1.add(10);
		list1.add(15);
		list1.add(21);
		list1.add(15);
		list1.add(10);
		
		List<Integer> updatedList1 = removeDuplicates(list1);
		
		System.out.println("--- Test Case 1 Output ---");
		System.out.println("Linked list without duplicates:");
		
		for (Integer value : updatedList1) {
			System.out.print(value+"->");
		}
        System.out.println("\b\b "); 
        
        System.out.println("\n" + "-".repeat(30) + "\n");
        
        
        List<Integer> list2 = new LinkedList<Integer>();
        list2.add(51);
		list2.add(45);
		list2.add(45); 
		list2.add(15);
		list2.add(82);
		list2.add(51); 
		list2.add(10);
        
		List<Integer> updatedList2 = removeDuplicates(list2);
		
        System.out.println("--- Test Case 2 Output ---");
		System.out.println("Linked list without duplicates:");
       
		for (Integer value : updatedList2) {
			System.out.print(value+"->");
		}
        System.out.println("\b\b ");
	}
}
