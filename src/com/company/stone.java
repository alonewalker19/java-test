package com.company;
import java.util.Random;
import java.util.Scanner;

public class stone {
    public static void main(String[] args) {
        Random run = new Random();
        int upperbound = 3;
        String stone = "0";
        String paper = "1";
        String sizer = "2";

        Scanner Sign =new Scanner(System.in);
        String sign1 = Sign.next();

        //generate random values from 0-24
        int number = run.nextInt(upperbound);
        if(number == 0){
            System.out.println("stone");
        }
        else if (number == 1){
            System.out.println("paper");
        }
        else if (number ==2){
            System.out.println("sizer");
        }

    }

}
