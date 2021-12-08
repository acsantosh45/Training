package day10;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Number scored in mathematics:");
        int mathematics = in.nextInt();

        System.out.println("Number scored in science:");
        int science = in.nextInt();

        System.out.println("Number scored in social:");
        int social = in.nextInt();

        System.out.println("Number scored in computer:");
        int computer = in.nextInt();

        System.out.println("Number scored in opt:");
        int opt = in.nextInt();

        int total = mathematics + science + social + computer + opt ;
        int avg = total / 5;

        if(avg>=90)
            System.out.println("Your grade is: A");
        else if(avg>=80 && avg<90)
            System.out.println("Your grade is: B");
        else if(avg>=70 && avg<80)
            System.out.println("Your grade is: C");
        else if(avg>=60 && avg<70)
            System.out.println("Your grade is: D");
        else
            System.out.println("Your grade is: F");

    }
}
