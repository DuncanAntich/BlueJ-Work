// Lab12bv100.java     This is the Student-Starting file. 
// This version is implemented with "Dynamic Arrays"
// This assignment pertains to some of the "Elevens" AP Lab Materials
//***************************************************************************
// The "Elevens" AP Lab is created for the College Board APCS
// curriculum by Michael Clancy, Robert Glen Martin and Judith Hromcik.
// Leon Schram has altered some of the "Elevens" files to focus on 
// specific CS topics as the "Elevens" Lab is integrated into the curriculum.



import java.util.ArrayList;
import java.util.Random;

public class Lab12bv100
{
    public static void main(String[] args)
    {   
      Deck deck = new Deck();
      System.out.println(deck);
    }
}


class Deck 
{
    private ArrayList<Card> cards;
    private int size;

    public Deck() 
   {
      size = 52;
        cards = new ArrayList<Card>();
        fillDeck();
        //shuffle1();
        shuffle2();
    }

    private void fillDeck()
    {
        String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};
        String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", 
        "Eight", "Nine", "Ten", "Jack", "King", "Queen", "Ace"};
        for(int i = 0; i<4;i++){
            for(int j = 0; j<13; j++){
                if(j<10)
                    cards.add(new Card(suits[i],ranks[j],j+2));
                else
                    cards.add(new Card(suits[i],ranks[j],10));
            }
        }
    }
    private void shuffle1()
    {
        Card temp = new Card("Hearts","Two",2);
        for(int i = 0; i<1000; i++){
            int rand1 = (int) (Math.random()*cards.size());
            int rand2 = (int) (Math.random()*cards.size());
            if(rand1 != rand2){
                temp = cards.get(rand1);
                cards.set(rand1,cards.get(rand2));
                cards.set(rand2,temp);
            }
        }
    }
    private void shuffle2()
    {
        for(int i = 0; i<3*cards.size();i++)
        {
            int rand1 = (int) (Math.random()*cards.size());
            int rand2 = (int) (Math.random()*cards.size());
            Card temp = cards.get(rand1);
            cards.remove(rand1);
            cards.add(rand2,temp);
        }
    }
    public String toString()
    {
        String ret = "";
        for(int i = 0; i<cards.size(); i++)
        {
            ret += cards.get(i) + "\n";
        }
        return ret;
    }
    /*Shuffle 2 takes 182560996699521 nanoseconds, whereas Shuffle1 takes 
       182586103685679 nanoseconds. Thus, Shuffle2 is more efficient.*/
 }
