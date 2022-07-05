package Cwiczenia.Cards;

import Cwiczenia.Cards.CardItem.Card;
import Cwiczenia.Cards.CardItem.Rank;
import Cwiczenia.Cards.CardItem.Suit;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

public class House {
    private Stack<Card> playingCards = new Stack<>();
    private Player dealer;
    private Player player;

    public House(String name) {
        player = new Player(name);
        dealer = new Player("House");
    }


    public void newGame() {
        fillNewDeck();
        dealCards();


    }

    public Player getPlayer() {
        return player;
    }


    private void dealCards() {
        for (int i = 0; i < 5; i++) {
            player.addCardToHand(playingCards.pop());
            dealer.addCardToHand(playingCards.pop());
        }
        player.getPlayersHand().sort(Comparator.comparing(Card::getCardValue));
        dealer.getPlayersHand().sort(Comparator.comparing(Card::getCardValue));
    }

    private void sortHand(Player player) {

    }

    private void fillNewDeck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                playingCards.push(new Card(rank, suit));
            }
        }
        Collections.shuffle(playingCards);
    }

    @Override
    public String toString() {
        return "Dealer's hand: " + dealer + "\nPlayer's hand: " + player;
    }
}
