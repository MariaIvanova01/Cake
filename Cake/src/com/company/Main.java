package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        int cakeWidth = scan.nextInt();
        int cakeLenght = scan.nextInt();
        scan.nextLine();
        String input;
        int pises = 0;
        int countP = cakeWidth * cakeLenght;

        while (true){
            input = scan.nextLine();
            if (input.equals("STOP")){
                break;
            }
            pises = Integer.parseInt(input);
            if (pises <= countP){
                countP -= pises;
            }
            if (pises > countP){
                break;
            }

        }
        if (input.equals("STOP")){
            System.out.printf("%d pieces are left.", countP);
        }else{
            int need = pises - countP;
            System.out.printf("No more cake left! You need %d pieces more.", need);
        }

    }
}
