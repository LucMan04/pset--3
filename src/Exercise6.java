package src;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //enter wage
        System.out.print("Wage     :");
        double Wage = in.nextDouble();

        //week hours
        System.out.print("Monday   :");
        double mon = in.nextDouble();

        System.out.print("Tuesday  :");
        double tues = in.nextDouble();

        System.out.print("Wednesday:");
        double wed = in.nextDouble();

        System.out.print("Thursday :");
        double thur = in.nextDouble();

        System.out.print("Friday   :");
        double fri = in.nextDouble();

        System.out.print("Saturday :");
        double sat = in.nextDouble();

        System.out.print("Sunday   :");
        double sun = in.nextDouble();

        System.out.print("$");
        System.out.printf("%.2f", (mon + tues + wed + thur + fri + sat + sun) * Wage );
        System.out.print(".");

    }
}