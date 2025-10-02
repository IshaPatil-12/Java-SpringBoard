package Exercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Student {

	private int studentId;
	private String studentName;
	private int courseId;

	public Student(int studentId, String studentName, int courseId) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.courseId = courseId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	@Override
	public boolean equals(Object student) {
        // Two Student objects are equal if they have the same studentId
		Student otherStudent = (Student) student;
		if (this.studentId == otherStudent.studentId)
			return true;
		return false;
	}

	@Override
	public int hashCode() {
       
		return studentId;
	}

	@Override
	public String toString() {
		return "Student(Id: "+studentId + ", Name: " + studentName + ")";
	}

}


class Tester {

	
	public static Set<Student> findDuplicateEntries(List<Student> students) {
	
		Set<Student> seenStudents = new HashSet<>();
        
		
		Set<Student> duplicateStudents = new HashSet<>();
        
		for (Student student : students) {
			
			boolean isNewEntry = seenStudents.add(student);
            
			if (!isNewEntry) {
				duplicateStudents.add(student);
			}
		}
        
		return duplicateStudents;
	}
	
	public static void main(String[] args) {
        // --- Test Case 1: Matching the first row of the image ---
		List<Student> students1 = new ArrayList<Student>();
		students1.add(new Student(1001, "Dean", 111));
		students1.add(new Student(1002, "Harley", 112));
		students1.add(new Student(1003, "Franklin", 113));
		students1.add(new Student(1005, "Arden", 113));
		students1.add(new Student(1100, "Juliet", 112));
		students1.add(new Student(1003, "Franklin", 111)); 
		students1.add(new Student(1001, "Dean", 114));     

		Set<Student> duplicateStudents1 = findDuplicateEntries(students1);
		System.out.println("--- Test Case 1 Output ---");
		System.out.println("Students with multiple entries:");
		System.out.println(duplicateStudents1); 
      
        
        System.out.println("\n" + "-".repeat(30) + "\n");
        
      
        List<Student> students2 = new ArrayList<Student>();
        students2.add(new Student(4534, "Joe", 111));
        students2.add(new Student(2347, "Ross", 112));
        students2.add(new Student(4534, "Joe", 112)); 
        students2.add(new Student(4534, "Joe", 113)); 
        students2.add(new Student(4534, "Joe", 114)); 
        
        Set<Student> duplicateStudents2 = findDuplicateEntries(students2);
		System.out.println("--- Test Case 2 Output ---");
		System.out.println("Students with multiple entries:");
        System.out.println(duplicateStudents2);
        
	}
}

