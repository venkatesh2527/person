import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private Date dateOfBirth;

    public Student(String name, String dob) throws ParseException {
        this.name = name;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); // Change format as needed
        this.dateOfBirth = sdf.parse(dob);
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + calculateAge() + " years");
    }

    private int calculateAge() {
        Date currentDate = new Date();
        long diff = currentDate.getTime() - dateOfBirth.getTime();
        return (int) (diff / (1000L * 60 * 60 * 24 * 365));
    }
     public static void main(String[] args) throws ParseException {
        
            // Creating a new student
            Student student = new Student("Amit", "24-03-2004");
            // Displaying student details
            student.displayDetails();
            StudentCourses studentCourses = new StudentCourses();
            // Adding courses and marks
            studentCourses.addCourseMark("C++", 90);
            studentCourses.addCourseMark("Java", 85);
            studentCourses.addCourseMark("C#", 88);
            // Displaying courses and marks
            studentCourses.displayCoursesAndMarks();
          
  }
}
