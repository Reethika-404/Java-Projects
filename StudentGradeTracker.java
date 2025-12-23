package jav;
import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Fixed classes using array
        String[] classes = {"Math", "Science", "English"};

        // Dynamic students using ArrayList
        ArrayList<String> students = new ArrayList<>();

        // Map each student to their grades (LinkedList)
        Map<String, LinkedList<Integer>> studentGrades = new HashMap<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            students.add(name);
            studentGrades.put(name, new LinkedList<>());

            // Enter grades for fixed classes
            for (String subject : classes) {
                System.out.print("Enter grade for " + subject + ": ");
                int grade = sc.nextInt();

                try {
                    if (grade < 0 || grade > 100) {
                        throw new IllegalArgumentException("Invalid grade: " + grade);
                    }
                    studentGrades.get(name).add(grade);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    studentGrades.get(name).add(0); // default to 0 if invalid
                }
            }
            sc.nextLine(); // consume newline
        }

        // Calculate averages
        for (String student : students) {
            LinkedList<Integer> grades = studentGrades.get(student);

            // Sort grades
            Collections.sort(grades);

            int sum = 0;
            for (int g : grades) {
                sum += g;
            }
            double avg = (double) sum / grades.size();

            System.out.println("\nStudent: " + student);
            System.out.println("Grades (sorted): " + grades);
            System.out.println("Average: " + avg);
        }

        sc.close();
    }
}