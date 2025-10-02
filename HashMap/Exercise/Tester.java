package Exercise;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

class Student {
	
    public static Map<String, Double> findMaxMinScorers(Map<String, Double> studentMarks) {
        if (studentMarks == null || studentMarks.isEmpty()) {
            return new HashMap<>();
        }
        
        double maxScore = Double.MIN_VALUE;
        double minScore = Double.MAX_VALUE;
        
     
        for (Double score : studentMarks.values()) {
            if (score > maxScore) {
                maxScore = score;
            }
            if (score < minScore) {
                minScore = score;
            }
        }
        
      
        Map<String, Double> maxMinScorers = new HashMap<>();
        
       
        for (Entry<String, Double> entry : studentMarks.entrySet()) {
            String studentName = entry.getKey();
            Double score = entry.getValue();
            
            if (score == maxScore) {
                maxMinScorers.put(studentName, score);
            }
            
            if (score == minScore && score != maxScore) {
                 maxMinScorers.put(studentName, score);
            } else if (score == minScore && studentMarks.size() == 1) {
                 
                 maxMinScorers.put(studentName, score);
            }
            
            
            if (score == minScore && !maxMinScorers.containsKey(studentName)) {
                 maxMinScorers.put(studentName, score);
            }
        }

        maxMinScorers.clear();
        for (Entry<String, Double> entry : studentMarks.entrySet()) {
            if (entry.getValue() == maxScore || entry.getValue() == minScore) {
                maxMinScorers.put(entry.getKey(), entry.getValue());
            }
        }
        
        return maxMinScorers;
	}

}

class Tester {

	public static void main(String args[]) {
        
       
		Map<String, Double> studentMarks1 = new HashMap<String, Double>();
	     studentMarks1.put("Lily", 90.0);
		studentMarks1.put("Robin", 68.0);
		studentMarks1.put("Marshall", 76.5);
		studentMarks1.put("Neil", 67.0); 
		studentMarks1.put("Ted", 92.0);   
		
		Map<String, Double> maxMinScorers1 = Student.findMaxMinScorers(studentMarks1);
		
		System.out.println("--- Test Case 1 Output ---");
		System.out.println("Details of Top Scorers & Low Scorers\n====================================");
		for (Entry<String, Double> entry : maxMinScorers1.entrySet()) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
        
        
        System.out.println("\n" + "-".repeat(30) + "\n");
        
        
        Map<String, Double> studentMarks2 = new HashMap<String, Double>();
        studentMarks2.put("Lily", 85.0);
		studentMarks2.put("Robin", 78.5);
		studentMarks2.put("Marshall", 86.0); 
		studentMarks2.put("Neil", 72.0);     
		studentMarks2.put("Ted", 86.0);      
        
		Map<String, Double> maxMinScorers2 = Student.findMaxMinScorers(studentMarks2);
        
		System.out.println("--- Test Case 2 Output ---");
		System.out.println("Details of Top Scorers & Low Scorers\n====================================");
		for (Entry<String, Double> entry : maxMinScorers2.entrySet()) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
       
	}
}
