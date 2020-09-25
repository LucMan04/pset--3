package src;

import java.text.NumberFormat;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Salary:");
        double salary = in.nextDouble();

        System.out.print("401(k):");
        double retirement = in.nextDouble();

        System.out.print("Federal:");
        double federal = in.nextDouble();

        System.out.print("State:");
        double state = in.nextDouble();

        double retireleftover = 1 - (retirement/100);
        double afterretire = salary * retireleftover;

        double aftertax = (1-((federal+state)/100));
        double yearly = afterretire*aftertax;

        double takehome= yearly/24;
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
        defaultFormat.setMinimumFractionDigits(2);
        System.out.println();
        System.out.println(defaultFormat.format(takehome));
    }
}