package com.company;
import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = sc.nextInt();

        System.out.println("Enter second number :");
        int b = sc.nextInt();

        if (a > b){
            System.out.println("Greater number is :" +a);
        }else{
            System.out.println("Greater number is :" +b);
        }
    }
}
