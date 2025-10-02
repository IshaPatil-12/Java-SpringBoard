package Exercise;

class Tester {

	public static int findMaxActivities(int start[], int finish[]) {	
        
        int n = start.length;
        
        int activityCount = 0;
        
        if (n > 0) {
            activityCount = 1;
        } else {
            return 0;
        }

        int lastFinishTime = finish[0]; 

        for (int i = 1; i < n; i++) {
            
            if (start[i] >= lastFinishTime) {
                
                activityCount++;
                lastFinishTime = finish[i];
            }
        }
        
		return activityCount;
	}
	
	public static void main(String[] args) {	
        int start1[] = {1, 3, 0, 5, 8, 5};	
        int finish1[] = {2, 4, 6, 7, 9, 9};
        System.out.println("--- Sample 1 ---");
        System.out.println("Maximum number of activities: "+findMaxActivities(start1, finish1));

        System.out.println("\n-------------------------------------");

        int start2[] = {1, 3, 0, 5, 9, 8};	
        int finish2[] = {3, 5, 8, 10, 12, 13};
        System.out.println("--- Sample 2 ---");
        System.out.println("Maximum number of activities: "+findMaxActivities(start2, finish2));
    }
}