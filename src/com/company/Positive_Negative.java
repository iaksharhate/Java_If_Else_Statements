package com.company;
import java.util.Scanner;

public class Positive_Negative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int a = sc.nextInt();

        if (a > 0){
            System.out.println("Number is positive!");
        }else if( a == 0){
            System.out.println("Number is neither positive nor negative!");
        }else{
            System.out.println("Number is negative!");
        }
    }
}