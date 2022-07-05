package Cwiczenia.Cards;

import java.util.*;

public class CardsDemo {
    private static House house;

    public static void main(String[] args) {
        startGame();
        System.out.println(house);
        System.out.println(house.getPlayer());



    }

    private static void startGame() {
        Scanner scn = new Scanner(System.in);
        boolean isLooping = true;
        do {
            System.out.println("Choose an action:\n" +
                                                "u - new user\n" +
                                                "n - new game\n" +
                                                "c - close game");
            switch (scn.nextLine()) {
                case "u":
                    System.out.println("Enter player's name");
                    house = new House(scn.nextLine());
                    break;
                case "n":
                    if(house == null) {
                        System.out.println("You need to create player profile first");
                        break;
                    }
                    house.newGame();
                    break;
                case "c":
                    isLooping = false;
                    break;
                default:
            }
        }while (isLooping);

    }

}
