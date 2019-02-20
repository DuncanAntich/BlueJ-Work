// Lab11b100.java
// This is the Student starting version of the <Deck> class lab11b assignment. 


public class Lab11b100
{
    public static void main(String[] args)
    { 
      Deck deck = new Deck();
      System.out.println(deck);
    }
}


class Deck 
{
    private Card[] cards;
    private int size;


    public Deck() 
   {
      size = 52;
      cards = new Card[size];
      cards = fillDeck(cards);
      shuffle();
      
    }    
    public void shuffle(){
        int rand;
        int rand2;
        Card temp;
        for(int counter = 0; counter<1000; counter++){
            
            rand = (int) (Math.random()*(cards.length - 1));
            rand2 = (int) (Math.random()*(cards.length - 1));
            temp = cards[rand];
            cards[rand] = cards[rand2];
            cards[rand2] = temp;
        }
    }
    


    public Card[] fillDeck(Card[] cards1){
        String[] ranks = {"Two","Three","Four","Five","Six","Seven","Eight",
        "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Hearts","Diamonds","Clubs", "Spades"};
        int suit = 0;
        for(int count = 0; count<cards1.length; count++){
            if(count%13 <9)
              cards1[count] = new Card(suits[suit],ranks[count%13],count%13+2);
            else if(count%13 == 9 || count%13 == 10 || count%13 == 11)
              cards1[count] = new Card(suits[suit],ranks[count%13],10);
            else{
              cards1[count] = new Card(suits[suit],ranks[12],11);
              suit++;
            }
        }
        return cards1;
    }


public String toString(){
        String display = "";
        for(int count = 0; count<cards.length; count++)
            display += cards[count] + "\n";
        return display;
        }
    }

