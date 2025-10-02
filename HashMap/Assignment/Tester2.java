package Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
	
class Tester2 {

    public static Map<Character, Integer> findOccurrences(String input) {
        Map<Character, Integer> occurrenceMap = new HashMap<>();
        for (char character : input.toCharArray()) {
            if (character == ' ') {
                continue;
            }
            occurrenceMap.put(character, occurrenceMap.getOrDefault(character, 0) + 1);
        }
        return occurrenceMap;
	}
	
    
	public static void main(String args[]) {
        System.out.println("--- Sample Input 1 (occurrence) ---");
		String input1 = "occurrence";
		Map<Character, Integer> occurrenceMap1 = findOccurrences(input1);
		
		System.out.println("Occurrences of characters\n=======================");
		for (Entry<Character, Integer> entry : occurrenceMap1.entrySet()) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}

        System.out.println("\n-------------------------------------\n");
        System.out.println("--- Sample Input 2 (data structures) ---");
        String input2 = "data structures";
        Map<Character, Integer> occurrenceMap2 = findOccurrences(input2);

        System.out.println("Occurrences of characters\n=======================");
        for (Entry<Character, Integer> entry : occurrenceMap2.entrySet()) {
            System.out.println(entry.getKey()+" -- "+entry.getValue());
        }
		
	}

}
