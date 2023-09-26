package gradingscore;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String name = "Your Full Name";
        String rollNumber = "Your Roll Number";
        String semester = "Your Semester";
        String registrationNumber = "Your Registration Number";

        
        System.out.print("Enter the number of units: ");
        int numUnits = scanner.nextInt();

       
        String[] unitCodes = new String[numUnits];
        double[] scores = new double[numUnits];

      
        for (int i = 0; i < numUnits; i++) {
            System.out.print("Enter Unit Code for Unit " + (i + 1) + ": ");
            unitCodes[i] = scanner.next();
            System.out.print("Enter Score for Unit " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
        }

        
        double total = 0.0;
        for (double score : scores) {
            total += score;
        }
        double average = total / numUnits;

        
        String grade;
        if (average >= 70) {
            grade = "A";
        } else if (average >= 60) {
            grade = "B";
        } else if (average >= 50) {
            grade = "C";
        } else if (average >= 40) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        
        System.out.println("\nGrades for " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Semester: " + semester);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("\nUnit Code\tUnit Name\tScore");
        for (int i = 0; i < numUnits; i++) {
             
            String unitName = "Your Unit Name";
            System.out.println(unitCodes[i] + "\t\t" + unitName + "\t\t" + scores[i]);
        }
        System.out.println("\nTotal Score: " + total);
        System.out.println("Average Score: " + average);
        System.out.println("Grade: " + grade);

        
        scanner.close();
    }
}



