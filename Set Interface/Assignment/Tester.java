import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class Student {
    private int studentId;
    private String studentName;
    private String emailId;
    private String event;

    public Student(int studentId, String studentName, String emailId, String event) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.emailId = emailId;
        this.event = event;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getEvent() {
        return event;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return this.emailId.equals(other.emailId);
    }

    @Override
    public int hashCode() {
        return emailId.hashCode();
    }

    @Override
    public String toString() {
        return "Student(" + studentId + ", \"" + studentName + "\", \"" + emailId + "\")";
    }
}

class Tester {

    // Returns all unique students (removes duplicates)
    public static Set<Student> findUnique(List<Student> students) {
        // LinkedHashSet preserves the order of first occurrence
        return new LinkedHashSet<>(students);
    }

    // Returns students who submitted nominations for both events
    public static Set<Student> findDuplicates(List<Student> students) {
        Set<Student> all = new HashSet<>();
        Set<Student> duplicates = new LinkedHashSet<>();

        for (Student s : students) {
            if (!all.add(s)) {
                // already exists in 'all', so this student is a duplicate
                duplicates.add(s);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(5004, "Wyatt", "Wyatt@example.com","Dance"));
        students.add(new Student(5010, "Lucy", "Lucy@example.com","Dance"));
        students.add(new Student(5550, "Aaron", "Aaron@example.com","Dance"));
        students.add(new Student(5560, "Ruby", "Ruby@example.com","Dance"));
        students.add(new Student(5015, "Sophie", "Sophie@example.com","Music"));
        students.add(new Student(5013, "Clara", "Clara@example.com","Music"));
        students.add(new Student(5010, "Lucy", "Lucy@example.com","Music"));
        students.add(new Student(5011, "Ivan", "Ivan@example.com","Music"));
        students.add(new Student(5550, "Aaron", "Aaron@example.com","Music"));

        // --- Output 1: Unique students ---
        Set<Student> studentNominations = findUnique(students);
        System.out.println("Students who have submitted nominations:");
        for (Student student : studentNominations)
            System.out.println(student);

        // --- Output 2: Duplicate students ---
        Set<Student> duplicateStudents = findDuplicates(students);
        System.out.println("\nStudents who have submitted nominations for both events:");
        for (Student student : duplicateStudents)
            System.out.println(student);
    }
}


