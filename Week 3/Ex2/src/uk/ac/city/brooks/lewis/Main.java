package uk.ac.city.brooks.lewis;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int currentYear, birthYear;
	Scanner sc = new Scanner (System.in);
	System.out.println("What is the current year?");
	currentYear = sc.nextInt();
	System.out.println("What year were you born?");
	birthYear = sc.nextInt();
	int age = currentYear - birthYear;
	System.out.println("You are "+ age + " years of age");
    }
}
