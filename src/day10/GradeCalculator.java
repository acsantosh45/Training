package day10;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < marks.length; i++) {
            do {
                System.out.println("Enter a mark of subject 1!");
                while (!sc.hasNextInt()) {
                    System.out.println("Please enter a valid number");
                    sc.next(); // this is important!
                }
                marks[i] = sc.nextInt();
            } while (marks[i] <= 0 || marks[i] > 100);
            System.out.println("Thank you! Got " + marks[i]);

            int total = 0;
            int avg = total / 5;

            if (avg >= 90)
                System.out.println("Your grade is: A");
            else if (avg >= 80 && avg < 90)
                System.out.println("Your grade is: B");
            else if (avg >= 70 && avg < 80)
                System.out.println("Your grade is: C");
            else if (avg >= 60 && avg < 70)
                System.out.println("Your grade is: D");
            else
                System.out.println("Your grade is: F");

        }
    }
}
