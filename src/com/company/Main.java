package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("number of chikens");
        Random randNum = new Random();
        int chickens = input.nextInt();
        int eggs = 0;
        for (int i= 0; i  != 1;i++){
            for(int j=0; j < chickens ;j++){
                eggs += randNum.nextInt(30-26)+26;
            }
        }
        System.out.println("number of eggs produce in the year is:"+eggs);
    }
}
