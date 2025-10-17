import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Grade Calculator =====");
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int numSubjects = sc.nextInt();

        double totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            double marks = sc.nextDouble();
            totalMarks += marks;
        }

        double average = totalMarks / numSubjects;
        char grade;

        if (average >= 90)
            grade = 'A';
        else if (average >= 80)
            grade = 'B';
        else if (average >= 70)
            grade = 'C';
        else if (average >= 60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("\n===== Result =====");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + totalMarks + "/" + (numSubjects * 100));
        System.out.printf("Average: %.2f%%\n", average);
        System.out.println("Grade: " + grade);

        if (grade == 'F')
            System.out.println("Status: ❌ Fail");
        else
            System.out.println("Status: ✅ Pass");

        sc.close();
    }
}
