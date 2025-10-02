package Assignment;

import java.util.LinkedList;
import java.util.List;

class Tester2 {
    
    public static List<Integer> mergeLists(List<Integer> listOne, List<Integer> listTwo) {
        List<Integer> mergedList = new LinkedList<>();

        int i = 0, j = 0; // pointers for both lists

        // Traverse both lists and add elements in sorted order
        while (i < listOne.size() && j < listTwo.size()) {
            if (listOne.get(i) <= listTwo.get(j)) {
                mergedList.add(listOne.get(i));
                i++;
            } else {
                mergedList.add(listTwo.get(j));
                j++;
            }
        }

        // Add remaining elements from listOne
        while (i < listOne.size()) {
            mergedList.add(listOne.get(i));
            i++;
        }

        // Add remaining elements from listTwo
        while (j < listTwo.size()) {
            mergedList.add(listTwo.get(j));
            j++;
        }

        return mergedList;
    }

    public static void main(String args[]) {

        // -------------------- Test Case 1 --------------------
        List<Integer> listOne = new LinkedList<Integer>();
        listOne.add(10);
        listOne.add(13);
        listOne.add(21);
        listOne.add(42);
        listOne.add(56);
        
        List<Integer> listTwo = new LinkedList<Integer>();
        listTwo.add(15);
        listTwo.add(20);
        listTwo.add(21);
        listTwo.add(85);
        listTwo.add(92);
        
        List<Integer> mergedList = mergeLists(listOne, listTwo);
        System.out.println("--- Test Case 1 Output ---");
        printList(mergedList);  // Expected: 10->13->15->20->21->21->42->56->85->92

        System.out.println("\n" + "-".repeat(40) + "\n");

        // -------------------- Test Case 2 --------------------
        List<Integer> listOne2 = new LinkedList<Integer>();
        listOne2.add(10);
        listOne2.add(11);
        listOne2.add(12);
        listOne2.add(35);

        List<Integer> listTwo2 = new LinkedList<Integer>();
        listTwo2.add(15);
        listTwo2.add(16);
        listTwo2.add(17);
        listTwo2.add(18);

        List<Integer> mergedList2 = mergeLists(listOne2, listTwo2);
        System.out.println("--- Test Case 2 Output ---");
        printList(mergedList2); // Expected: 10->11->12->15->16->17->18->35
    }

    // Helper method to print the list in desired format
    public static void printList(List<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        System.out.print(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            System.out.print("->" + list.get(i));
        }
        System.out.println();
    }
}

