import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    // Add student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    // View students
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    // Update student
    public void updateStudent(int id, String name, int age, String department) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(name);
                s.setAge(age);
                s.setDepartment(department);
                System.out.println("Student record updated.");
                return;
            }
        }
        System.out.println("Student ID not found.");
    }

    // Delete student
    public void deleteStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("Student record deleted.");
                return;
            }
        }
        System.out.println("Student ID not found.");
    }
}
