package TestCase;

import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Hello, " + name + ". You are " + age + " years old.");

        input.close();
    }
}