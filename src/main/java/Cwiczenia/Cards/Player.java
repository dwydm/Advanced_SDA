package Cwiczenia.Cards;

import Cwiczenia.Cards.CardItem.Card;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;

    //private Card[] playersHand = new Card[5];
    private List<Card> playersHand = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public List<Card> getPlayersHand() {
        return playersHand;
    }

    public void addCardToHand(Card card) {
        playersHand.add(card);
    }


    @Override
    public String toString() {
        String output = "";
        int counter = 1;
        for(Card card : playersHand) {
            output += " | " + counter + ". " + card + " | ";
            counter++;
        }
        return output;
    }
}
