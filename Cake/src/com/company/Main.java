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
        int leftCke = 0;

        while (true){
            input = scan.nextLine();
            if (input.equals("STOP")){
                break;
            }
            pises = Integer.parseInt(input);
            leftCke += pises;
            if (leftCke > countP){
                break;
            }

        }
        if (input.equals("STOP")){
            System.out.printf("%d pieces are left.", countP - leftCke);
        }else{
            int need = leftCke - countP;
            System.out.printf("No more cake left! You need %d pieces more.", need);
        }

    }
}
