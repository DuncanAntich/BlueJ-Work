// Card.java     12-26-14
// This is the "unit" class that stores information about a single card. 
// *********************************************************************
// The "Elevens" AP Lab is created for the College Board APCS
// curriculum by Michael Clancy, Robert Glen Martin and Judith Hromcik.
// Leon Schram has altered this "Elevens" AP Lab file to focus on 
// CS topics as the "Elevens" Lab is integrated into the curriculum.



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

   public String getSuit() { return suit; }
   public String getRank() { return rank; }
   public int getValue()   { return value; }
    
   public boolean matches(Card otherCard) 
   {
        return otherCard.getSuit().equals(this.suit)
             && otherCard.getRank().equals(this.rank)
             && otherCard.getValue() == this.value;
    }
  
   public String toString()
   {
      return "[" + suit + ", " + rank + ", " + value + "]";
   }
}

