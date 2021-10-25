package com.practice.deckofcards;

import java.util.Random;

public class DeckOfCards {
	static String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
	static String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
	static String[][] deck = new String[suit.length][rank.length];
	public static void main(String[] args) {

		cardsCreation(); 
		shuffle();         
		distribute();   
	}
	public static void cardsCreation() {               //creating 52 deck of cards using suits and  ranks
		for(int i = 0; i< suit.length ; i++) {

			for(int j = 0; j< rank.length ; j++) {
				deck[i][j] = suit[i] + rank[j];
			}		
		}
	}
	public static void shuffle() {                  // shuffling the cards
		Random random = new Random();
		for(int i = 0; i< suit.length ; i++) {

			for(int j = 0; j< rank.length ; j++) {
				int m = random.nextInt(i + 1);
				int n = random.nextInt(j + 1);
				String temp = deck[i][j];
				deck[i][j] = deck[m][n];
				deck[m][n] = temp;
			}		
		}
	}
	public static void distribute() {               // distribute the cards among people

		for(int i = 0; i< suit.length ; i++) {
			System.out.println("");
			System.out.println("Cards given to player "+(i+1)+" are");
			for(int j = 0; j< 9 ; j++) {
				System.out.println("   "+deck[i][j]) ;
			}		
		}
	}
}
