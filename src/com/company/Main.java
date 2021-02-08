package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight of the watermelon in Kgs:");
        int a = sc.nextInt();
        System.out.println("Enter the number of friends:");
        int b = sc.nextInt();
        if(a<0 ||b<0){
            System.out.println("Invalid Input");
            return;
        }
        double my = 3*a/16.0, bro = my;
        double fri = ((10/16.0)*a)/b;
        System.out.println("My share of Watermelon: "+String.format("%.2f", my)+"Kgs");
        System.out.println("My brother's share: "+String.format("%.2f", bro)+"Kgs");
        System.out.println("Each of our friend's share: "+String.format("%.2f", fri)+"Kgs");
    }
}
