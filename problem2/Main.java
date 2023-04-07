package problem2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String firstName;
        String lastName;
        String dateOfBirth;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you first name: ");
        firstName = sc.nextLine();
        System.out.println("Enter your last name: ");
        lastName = sc.nextLine();
        System.out.println("Enter the date of birth (yyyy-MM-dd): ");
        dateOfBirth = sc.nextLine();

        HeartRates hr = new HeartRates(firstName, lastName, dateOfBirth);
        hr.targetHeartRateRange();
        System.out.println(hr.toString());

    }
}
