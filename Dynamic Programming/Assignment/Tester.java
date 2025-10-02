import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

class Tester {
	
	static int count=0;
	
    private static void findWordSegmentsHelper(Set<String> dictionary, String remainingString) {
        
        if (remainingString.length() == 0) {
            count++;
            return;
        }

        for (int i = 1; i <= remainingString.length(); i++) {
            String prefix = remainingString.substring(0, i);
            
            if (dictionary.contains(prefix)) {
                
                String suffix = remainingString.substring(i);
                
                findWordSegmentsHelper(dictionary, suffix);
            }
        }
    }

	public static void findWordSegments(List<String> wordsList, String inputString) {
        Set<String> dictionary = new HashSet<>(wordsList);
        
        count = 0;
        
        findWordSegmentsHelper(dictionary, inputString);
	}

	public static void main(String[] args){
	 	List<String> wordsList1 = new ArrayList<String>();
	 	wordsList1.add("i");
	 	wordsList1.add("like");
	 	wordsList1.add("pizza");
	 	wordsList1.add("li");
	 	wordsList1.add("ke");
	 	wordsList1.add("pi");
	 	wordsList1.add("zza");

		String inputString1 = "ilikepizza";
		findWordSegments(wordsList1, inputString1);
        System.out.println("--- Sample 1 ---");
		System.out.println("Number of segments: "+count);

        System.out.println("\n-------------------------------------");

        List<String> wordsList2 = new ArrayList<String>();
	 	wordsList2.add("java");
	 	wordsList2.add("is");
	 	wordsList2.add("fun");
	 	wordsList2.add("ja");
	 	wordsList2.add("fu");
	 	wordsList2.add("i");

		String inputString2 = "fn";
		findWordSegments(wordsList2, inputString2);
        System.out.println("--- Sample 2 ---");
		System.out.println("Number of segments: "+count);
	}
}