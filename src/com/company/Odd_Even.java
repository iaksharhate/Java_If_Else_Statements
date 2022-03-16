package com.company;
import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check whether it is odd of even :");
        int a = sc.nextInt();

        if ((a % 2) == 0){
            System.out.println("Number is even!");
        } else{
            System.out.println("Number is odd!");
        }
    }
}