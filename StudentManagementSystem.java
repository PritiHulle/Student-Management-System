import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int rollNumber;
    private String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Roll Number: " + rollNumber + ", Name: " + name;
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    int rollNumber = scanner.nextInt();
                    System.out.print("Enter Name: ");
                    scanner.nextLine(); // Consume newline character
                    String name = scanner.nextLine();

                    Student student = new Student(rollNumber, name);
                    students.add(student);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students in the system.");
                    } else {
                        System.out.println("\nStudent List:");
                        for (Student s : students) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
