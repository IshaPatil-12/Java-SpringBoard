package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class Tester {
    
	/**
	 * Sorts employees based on sales in decreasing order. 
	 * If sales are equal, sorts by name in alphabetical (ascending) order.
	 * * @param sales A Map where the key is the employee name (String) and the value is their sales figure (Integer).
	 * @return A List of employee names (String) sorted according to the criteria.
	 */
	public static List<String> sortSales(Map<String, Integer> sales) {
		// 1. Convert the Map's entry set into a List to make it sortable.
        List<Entry<String, Integer>> entryList = new ArrayList<>(sales.entrySet());

        // 2. Sort the List using a custom Comparator.
        Collections.sort(entryList, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> entry1, Entry<String, Integer> entry2) {
                
                // --- Primary Sort: Sales in DECREASING (Descending) Order ---
                Integer sales1 = entry1.getValue();
                Integer sales2 = entry2.getValue();
                
                // Compare sales2 to sales1 for descending order. 
                // A positive result means entry2 comes before entry1.
                int salesComparison = sales2.compareTo(sales1); 

                // --- Secondary Sort: Name in INCREASING (Ascending/Alphabetical) Order ---
                // If sales are equal (salesComparison == 0), use the name as a tie-breaker.
                if (salesComparison == 0) {
                    String name1 = entry1.getKey();
                    String name2 = entry2.getKey();
                    
                    // Compare name1 to name2 for standard alphabetical sorting.
                    return name1.compareTo(name2); 
                }

                // If sales are not equal, return the result of the sales comparison.
                return salesComparison;
            }
        });

        // 3. Extract just the employee names (keys) from the sorted entries.
        List<String> sortedEmployees = new ArrayList<>();
        for (Entry<String, Integer> entry : entryList) {
            sortedEmployees.add(entry.getKey());
        }

        return sortedEmployees;
	}

    // --- Main method to test both sample inputs ---
	public static void main(String args[]) {
        
        // =================================================================
        // Sample Input 1
        // Expected Output: [Lisa, Mathew, David, Paul, Courtney]
        // =================================================================
	    Map<String, Integer> sales1 = new HashMap<String, Integer>();
		sales1.put("Mathew", 50);
		sales1.put("Lisa", 76);
		sales1.put("Courtney", 45);
		sales1.put("David", 49);
		sales1.put("Paul", 49); // Tie with David, David comes first (D before P)
		
		List<String> employees1 = sortSales(sales1);
		
		System.out.println("--- Sample Input 1 ---");
		System.out.println("Employees in the decreasing order of their sales");
        System.out.println("=====================================");
		for (String employeeName : employees1) {
			System.out.println(employeeName);
		}
        
        System.out.println("\n-------------------------------------\n");
        
        // =================================================================
        // Sample Input 2
        // Expected Output: [Lisa, Paul, David, Mathew, Courtney]
        // =================================================================
        Map<String, Integer> sales2 = new HashMap<String, Integer>();
        sales2.put("Mathew", 40);
        sales2.put("Lisa", 60);
        sales2.put("Courtney", 35);
        sales2.put("David", 52);
        sales2.put("Paul", 58);

        List<String> employees2 = sortSales(sales2);
        
        System.out.println("--- Sample Input 2 ---");
        System.out.println("Employees in the decreasing order of their sales");
        System.out.println("=====================================");
        for (String employeeName : employees2) {
            System.out.println(employeeName);
        }
	}
}