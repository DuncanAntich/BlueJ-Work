/**
 * This is a class that plays the GUI version of the Elevens game.
 * See accompanying documents for a description of how Elevens is played.
 ************************************************************************
 * This is the original AP Elevens Lab Java program code.
 * 03-26-15 slightly altered by Leon Schram who likes curly braces aligned.
 * 
 * 14-04-2016 slightly altered again by Bill Montana who doesn't :)
 * 
 ************************************************************************
 * DO NOT ALTER THIS CLASS FOR LAB16!!!!!
 */
public class ElevensGUIRunner {

	/**
	 * Plays the GUI version of Elevens.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		ElevensBoard board = new ElevensBoard();
		CardGameGUI gui = new CardGameGUI(board);
		gui.displayGame();
	}
}
