package src;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        //15 %
        System.out.print("Homework 1:");
        double hw1 = in.nextDouble();
        System.out.print("Homework 2:");
        double hw2 = in.nextDouble();
        System.out.print("Homework 3:");
        double hw3 = in.nextDouble();

        //35%
        System.out.print("Quiz 1    :");
        double q1 = in.nextDouble();
        System.out.print("Quiz 2    :");
        double q2 = in.nextDouble();

        //50%
        System.out.print("Test 1    :");
        double t1 = in.nextDouble();

        double fHw = ( (( hw1 + hw2 + hw3)/3) * 0.15 );
        double fq = (((q1 + q2 )/2) * 0.35);
        double t = (t1 * 0.5);


        //final output fix
        System.out.printf("%.2f",fHw + fq + t );
        System.out.println("%.");

        in.close();
    }
}