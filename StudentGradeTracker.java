package jav;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String courses[] = {"Math", "Science", "English"};

        
        ArrayList<String> students = new ArrayList<>();

        
        Map<String, LinkedList<Integer>> studentGrades = new HashMap<>();

        System.out.print("Enter number of students please... ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name... ");
            String name = sc.nextLine();
            students.add(name);
            studentGrades.put(name, new LinkedList<>());

            
            for (String subject : courses) {
                System.out.print("Enter marks of " + subject + ": ");
                int grade = sc.nextInt();

                try {
                    if (grade < 0 || grade > 100) {
                        throw new IllegalArgumentException("Invalid grade: " + grade);
                    }
                    studentGrades.get(name).add(grade);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    studentGrades.get(name).add(0); 
                }
            }
            sc.nextLine();
        }

       
        for (String student : students) {
            LinkedList<Integer> grades = studentGrades.get(student);

            
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
