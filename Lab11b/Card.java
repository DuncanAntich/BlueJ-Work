// Card.java
// This Card class is identical to the Card03 class.
// It will be used for the sequence of Deck class programs.
// //////////////////////////////////////////////////////////
// This program is designed to explain the "Elevens" lab created
// by Michael Clancy, Robert Glen Martin and Judith Hromcik.
// Divided into stages and altered August 2014 by Leon Schram.


public class Card
{
   private String suit;
   private String rank;
   private int value;

   public Card(String s, String r, int v)
   {
      suit = s;
      rank = r;
      value = v;
   }

   public String getSuit()       { return suit; }
   public String getRank()       { return rank; }
   public int getValue()         { return value; }
   
   public void setSuit(String s) { suit = s; }
   public void setRank(String r) { rank = r; }
   public void setValue(int v)   { value = v; } 
   
   public String toString()
   {
      return "[" + suit + ", " + rank + ", " + value + "]";
   }
   
   public boolean matches(Card otherCard) 
   {
		return otherCard.getSuit().equals(this.suit)
			 && otherCard.getRank().equals(this.rank)
			 && otherCard.getValue() == this.value;
	}
}

