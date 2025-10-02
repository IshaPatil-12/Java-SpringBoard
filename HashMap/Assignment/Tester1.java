package Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Tester1 {

    public static Map<String, Integer> mergeMaps(Map<String, Integer> mapOne, Map<String, Integer> mapTwo){
        Map<String, Integer> mergedMap = new HashMap<>(mapOne);

        
        for (Entry<String, Integer> entry : mapTwo.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            
            mergedMap.putIfAbsent(key, value);
        }

        return mergedMap;
    }

    // --- Main method to test both sample inputs ---
    public static void main(String args[]) {
       
        Map<String, Integer> mapOne_1 = new HashMap<String, Integer>();
        mapOne_1.put("Kelly", 10);
        mapOne_1.put("Micheal", 20);
        mapOne_1.put("Ryan", 30);
        
        Map<String, Integer> mapTwo_1 = new HashMap<String, Integer>();
        mapTwo_1.put("Jim", 15);
        mapTwo_1.put("Andy", 45);

        Map<String, Integer> mergedMap1 = mergeMaps(mapOne_1, mapTwo_1);

        System.out.println("--- Sample Input 1 ---");
        System.out.println("Merged Map\n===========");
        for (Entry<String, Integer> entry : mergedMap1.entrySet()) {
            System.out.println(entry.getKey()+" -- "+entry.getValue());
        }
        
        System.out.println("\n-------------------------------------\n");
        
        Map<String, Integer> mapOne_2 = new HashMap<String, Integer>();
        mapOne_2.put("Toby", 15);
        mapOne_2.put("Micheal", 20); 
        mapOne_2.put("Angela", 30);
        
        Map<String, Integer> mapTwo_2 = new HashMap<String, Integer>();
        mapTwo_2.put("Toby", 15); 
        mapTwo_2.put("Andy", 45); 
        mapTwo_2.put("Micheal", 40); 
        
        Map<String, Integer> mergedMap2 = mergeMaps(mapOne_2, mapTwo_2);
        
        System.out.println("--- Sample Input 2 ---");
        System.out.println("Merged Map\n===========");
        for (Entry<String, Integer> entry : mergedMap2.entrySet()) {
            System.out.println(entry.getKey()+" -- "+entry.getValue());
        }
    }
}
