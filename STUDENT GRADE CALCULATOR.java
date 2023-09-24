                                                     //STUDENT GRADE CALCULATOR
import java.util.Scanner;

public class Interger {
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int a = java.nextInt();

        int[] arr = new int[a];
        int b = 0;

        for (int i = 0; i <a; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
            arr[i] = java.nextInt();
            b += arr[i];
        }
       
        double average = (double) b / (a * 100) * 100;
        String grade;
        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\nTotal Marks: " + b);
        System.out.println(String.format("Average Percentage: %.2f",average)+"%");
        System.out.println("Grade: " + grade);
    }
}
