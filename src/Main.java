import java.util.ArrayList;  
import java.util.List;  
import java.util.Scanner;  
public class Main {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        List<Student> students = new ArrayList<>();  
  
        while (true) {  
            System.out.print("Enter the student ID (or 'quit' to exit): ");  
            String studentID = scanner.nextLine();  
  
            if (studentID.equalsIgnoreCase("quit")) {  
                break;  
            }  
  
            System.out.print("Enter the student name: ");  
            String studentName = scanner.nextLine();  
  
            System.out.print("Enter the number of extra activities: ");  
            int numExtraActivities = scanner.nextInt();  
            scanner.nextLine();  
  
            Student student = new Student(studentID, studentName, numExtraActivities);  
  
            for (int i = 0; i < numExtraActivities; i++) {  
                System.out.print("Enter extra activity " + (i + 1) + ": ");  
                String extraActivity = scanner.nextLine();  
                student.addExtraActivity(i, extraActivity);  
            }  
  
            students.add(student);  
        }  
  
        for (Student student : students) {  
            System.out.println(student);  
        }  
  
        scanner.close();  
    }  
}