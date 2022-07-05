package Cwiczenia.Cards;

import Cwiczenia.Cards.CardItem.Card;

public class Analyzer {
    private boolean isMonocolor;
    private Card topCard;
    private Card bottomCard;

    //High Card
    //p:Pair
    //p:Two Pair
    //p:Three of a Kind
    //Straight
    //Flush
    //p:Full House
    //p:Four of a Kind
    //Straight Flush
    //Royal Flush



    public static Card displayHigherCard(Card... cards) {
        Card topCard = cards[0];
        for (Card card : cards) {
            if (card.getCardValue() == 1) {
                topCard = card;
                break;
            }
            else if(topCard.getCardValue() < card.getCardValue()) {
                topCard = card;
            }
        }
        return topCard;
    }
}
