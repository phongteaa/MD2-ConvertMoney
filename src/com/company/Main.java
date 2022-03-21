package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        double money;
        int choice;

        System.out.println("Choose 1 to convert USD to VND ");
        System.out.println("Choose 2 to convert VND to USD ");
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter the amount of USD you want to convert: ");
            money = sc.nextDouble();
            System.out.println("Your converted money is: " + money * 23000 + " vnd");
        } else if (choice == 2) {
            System.out.print("Enter the amount of VND you want to convert: ");
            money = sc.nextDouble();
            System.out.println("Your converted money is: " + money / 23000 + " dollar");
        } else {
            System.out.println("Error!");
        }

    }

//    public static double convertUSD(double money) {
//        double convertedMoney;
//        convertedMoney = money * 23000;
//        return convertedMoney;
//    }
//
//    public static double convertVND(double money) {
//        double convertedMoney;
//        convertedMoney = money / 23000;
//        return convertedMoney;
//    }
}
