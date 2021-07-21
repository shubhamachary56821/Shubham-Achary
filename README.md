# Shubham-Achary
this is a practice project made by me , just check them out and leave your valuable thoughts and suggestion regarding my logic building and cleanliness of my code

package com.company;
import java.util.Scanner;

public class Main {


    public static void main(String [] args) {
	    // write your code here
        System.out.println("           welcome to State bank of India");
        //these are some inbuilt pin numbers of some accounts which contains some amount in each.
        int pin1 = 4431;
        int pin2 = 3341;
        int pin3 = 5561;
        int pin4 = 5237;
        System.out.println("Please insert your card in the machine or enter the last 4 digit " +
                "written on the backside of your card: ");
        Scanner Sc = new Scanner(System.in);
        int pin = Sc.nextInt();
        if(pin==pin1) {
            System.out.println("Welcome Mr Shubham , to withdraw the cash press 1 " +
                    "\n to transfer the cash to another account press 2 \n to deposit some amount to your account press 3 " +
                    "\nto show your current balance press 4");
            float balance1 = 60000;
            int a = Sc.nextInt();
            switch (a) {
                case 1 -> {
                    System.out.println("ok so how much you want to withdraw");
                    float withdraw1 = Sc.nextFloat();
                    if(withdraw1>balance1){
                        System.out.println(" amount entered is exceeding your limit, please withdraw under the limit of your" +
                                "account balance");
                    }else
                    System.out.print("remaining balance: $");
                    System.out.println(balance1 - withdraw1);
                }
                case 2 -> {
                    System.out.println("ok so which account you want to transfer cash");
                    float account1 = Sc.nextFloat();
                    System.out.print("how much cash you want to transfer: $");
                    float transfer1 = Sc.nextFloat();
                    if(transfer1>balance1){
                        System.out.println(" amount entered is exceeding your limits, please transfer the money under " +
                                "the limit of your account balance");
                    }else
                        if(account1 == pin2){
                            System.out.println("your money $" + transfer1 + " has successfully transferred to Anjali");
                        }else if(account1 == pin3){
                            System.out.println("your money $" + transfer1 + "has successfully transferred to Garima");
                        }else if(account1 == pin4){
                            System.out.println("Your money $" + transfer1 + "has successfully transferred to Rakesh");
                        }else {
                            System.out.println("the account didn't exist");
                        }
                    System.out.print("remaining balance: $");
                    System.out.println(balance1 - transfer1);
                }
                case 3 -> {
                    System.out.println("ok so how much money you want to deposit to your account");
                    float deposit1 = Sc.nextFloat();
                    System.out.println("$" + deposit1 + " has been deposited to your account");
                    System.out.println("remaining balance: $");
                    System.out.println(balance1 + deposit1);
                }
                default -> {
                    System.out.print("your current balance is: $");
                    System.out.println(balance1);
                }
            }
        } else if(pin==pin2) {
            System.out.println("Welcome Miss Anjali , to withdraw the cash press 1 " +
                    " \nto transfer the cash to another account press 2 \n to deposit some amount to your account press 3");
            float balance2 = 60000;
            int b = Sc.nextInt();
            switch (b) {
                case 1 -> {
                    System.out.println("ok so how much you want to withdraw");
                    float withdraw2 = Sc.nextFloat();
                    if(withdraw2>balance2){
                        System.out.println(" amount entered is exceeding your limit, please withdraw under the limit of your" +
                                "account balance");
                    }else
                    System.out.print("remaining balance: $");
                    System.out.println(balance2 - withdraw2);
                }
                case 2 -> {
                    System.out.println("ok so which account you want to transfer cash");
                    float account2 = Sc.nextFloat();
                    System.out.print("how much cash you want to transfer: $");
                    float transfer2 = Sc.nextFloat();
                    if(transfer2>balance2){
                        System.out.println(" amount entered is exceeding your limits, please transfer the money under " +
                                "the limit of your account balance");
                    }else{
                        if(account2 == pin1){
                        System.out.println("your money $" + transfer2 + " has successfully transferred to Shubham");
                    }else if(account2 == pin3){
                        System.out.println("your money $" + transfer2 + "has successfully transferred to Garima");
                    }else if(account2 == pin4){
                        System.out.println("Your money $" + transfer2 + "has successfully transferred to Rakesh");
                    }else {
                        System.out.println("the account didn't exist");
                    }


                        System.out.println("your money $" + transfer2 + " has successfully transferred to " + account2);
                        System.out.print("remaining balance: $");
                        System.out.println(balance2 - transfer2);
                    }
                }
                case 3 -> {
                    System.out.println("ok so how much money you want to deposit to your account");
                    float deposit2 = Sc.nextFloat();
                    System.out.println("$" + deposit2 + " has been deposited to your account");
                    System.out.println("remaining balance: $");
                    System.out.println(balance2 + deposit2);
                }
                default -> {
                    System.out.print("your current balance is: $");
                    System.out.println(balance2);
                }
            }

        } else if(pin==pin3) {
            System.out.println("Welcome Miss Garima , to withdraw the cash press 1 " +
                    " \n to transfer the cash to another account press 2 \n to deposit some amount to your account press 3");
            float balance3 = 60000;
            int c = Sc.nextInt();
            switch (c) {
                case 1 -> {
                    System.out.println("ok so how much you want to withdraw");
                    float withdraw3 = Sc.nextFloat();
                    if(withdraw3>balance3){
                        System.out.println(" amount entered is exceeding your limit, please withdraw under the limit of your" +
                                "account balance");
                    }else
                    System.out.print("remaining balance: $");
                    System.out.println(balance3 - withdraw3);
                }
                case 2 -> {
                    System.out.println("ok so which account you want to transfer cash");
                    float account3 = Sc.nextFloat();
                    System.out.print("how much cash you want to transfer: $");
                    float transfer3 = Sc.nextFloat();
                    if(transfer3>balance3){
                        System.out.println(" amount entered is exceeding your limits, please transfer the money under " +
                                "the limit of your account balance");
                    }else {
                        if(account3 == pin1){
                            System.out.println("your money $" + transfer3 + " has successfully transferred to Shubham");
                        }else if(account3 == pin2){
                            System.out.println("your money $" + transfer3 + "has successfully transferred to Anjali");
                        }else if(account3 == pin4){
                            System.out.println("Your money $" + transfer3 + "has successfully transferred to Rakesh");
                        }else {
                            System.out.println("the account didn't exist");
                        }
                        System.out.print("remaining balance: $");
                        System.out.println(balance3 - transfer3);
                    }
                }
                case 3 -> {
                    System.out.println("ok so how much money you want to deposit to your account");
                    float deposit3 = Sc.nextFloat();
                    System.out.println("$" + deposit3 + " has been deposited to your account");
                    System.out.println("remaining balance: $");
                    System.out.println(balance3 + deposit3);
                }
                default -> {
                    System.out.print("your current balance is: $");
                    System.out.println(balance3);
                }
            }

        } else if(pin==pin4){
            System.out.println("Welcome Mr Rakesh , to withdraw the cash press 1 " +
                    "\n to transfer the cash to another account press 2 \n to deposit some amount to your account press 3");
            float balance4 = 60000;
            int d = Sc.nextInt();
            switch (d) {
                case 1 -> {
                    System.out.println("ok so how much you want to withdraw");
                    float withdraw4 = Sc.nextFloat();
                    if(withdraw4>balance4){
                        System.out.println(" amount entered is exceeding your limit, please withdraw under the limit of your" +
                                "account balance");
                    }else
                    System.out.print("remaining balance: $");
                    System.out.println(balance4 - withdraw4);
                }
                case 2 -> {
                    System.out.println("ok so which account you want to transfer cash");
                    float account4 = Sc.nextFloat();
                    System.out.print("how much cash you want to transfer: $");
                    float transfer4 = Sc.nextFloat();
                    if(transfer4>balance4){
                        System.out.println(" amount entered is exceeding your limits, please transfer the money under " +
                                "the limit of your account balance");
                    }else {
                        if(account4 == pin1){
                            System.out.println("your money $" + transfer4 + " has successfully transferred to Shubham");
                        }else if(account4 == pin2){
                            System.out.println("your money $" + transfer4 + "has successfully transferred to Anjali");
                        }else if(account4 == pin3){
                            System.out.println("Your money $" + transfer4 + "has successfully transferred to Garima");
                        }else {
                            System.out.println("the account didn't exist");
                        }
                        System.out.print("remaining balance: $");
                        System.out.println(balance4 - transfer4);
                    }
                }
                case 3 -> {
                    System.out.println("ok so how much money you want to deposit to your account");
                    float deposit4 = Sc.nextFloat();
                    System.out.println("$" + deposit4 + " has been deposited to your account");
                    System.out.println("remaining balance: $");
                    System.out.println(balance4 + deposit4);
                }
                default -> {
                    System.out.print("your current balance is: $");
                    System.out.println(balance4);
                }
            }
        }else
            System.out.println("you don't have account in this system! request the bank authority and" +
                    " generate your own new account");

    }
}
