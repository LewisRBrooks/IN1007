package uk.ac.city.brooks.lewis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is your name?");
        String studentName = myObj.nextLine();
        System.out.println("What is your Teacher's name?");
        String teacherName = myObj.nextLine();
        System.out.println("Dear "+ teacherName + ",");
        System.out.println("I love your tutorials, they are awesome!");
        System.out.println(studentName);
    }
}
