package uk.ac.city.brooks.lewis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int num1, num2, num3;
	Scanner sc = new Scanner (System.in);
	System.out.println("Type in your first number");
	num1 = sc.nextInt();
	System.out.println("Type in your second number");
	num2 = sc.nextInt();
	System.out.println("Type in your third number");
	num3 = sc.nextInt();
	System.out.println((num1 < num2) && (num2 < num3));

    }
}
