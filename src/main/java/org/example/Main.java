package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter sentence");

        String s1[] = myObj.nextLine().split(" ");
        String ans = "";
        for (int i = s1.length - 1; i >= 0; i--) {
            ans += s1[i] + " ";
        }
        System.out.println("Your reverse sentence is: " + ans);
    }
}

