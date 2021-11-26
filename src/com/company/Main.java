package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        String [] names = new String [5];
        System.out.println("How many people are playing?");
        int amount = -1;
        while (amount == -1) {
            try {
                amount = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                System.out.println("This is not a number, try again and input a number.");
            }
        }

        int numPeople = input.nextInt();
        for (int i = 1; i <= numPeople; i++){
            System.out.println("Player "+ i +" What position would you like to go for? Choose from 1 to 5.");
            int place = input.nextInt();
            boolean freePlace = free(place);
            if freePlace
        }


    }
}
