package ICSE_Projects;

// a game for cards,... source::: internet
public class Card {
	 
	    /**
	     *  <code>value</code> - the value of this card, from 0-51.
	     *
	     */
	    private int value;
	 
	    /**
	     *   <code>face</code> - the face of the card, e.g. 2, 3, queen etc
	     *
     */
	    private String face;
	 
	    /**
	     *  <code>suit</code> - the suit of this card, e.g. Clubs, Spades etc
	     *
	     */
	    private String suit;
 
    /**
     * Creates a new <code>Card</code> instance.
     *
	     * @param value an <code>int</code>
     * that is between 0 and 51, where 0 is the 2 of clubs,
	     * 51 is the ace of spades.
     */
    public Card (int value){
	        this.value = value;
	        this.suit = getSuit(value);
	        this.face = getFace(value);
	    }
	 
    public int getValue(){
	        return value;
    }
	 
	    public String getName(){
	        return face+" of "+suit;
	    }
	 
    public String getFace(){
	        return face;
	    }
	 
	    /**
	     *  <code>getFace</code> - works out the face of this card
	     *  based on it's value from 0-52, e.g. 0 = '2', 10 = 'king'
	     *
	     * @param value an <code>int</code> value
	     * @return a <code>String</code> value
	     */
	    private String getFace(int value){
	 
	        if (value < 4){
	            return "2";
	        }
	        if (value > 3 && value < 8){
	            return "3";
	        }
	        if (value > 7 && value < 12){
	            return "4";
	        }
	        if (value > 11 && value < 16){
	            return "5";
	        }
	        if (value > 15 && value < 20){
	            return "6";
	        }
	        if (value > 19 && value < 24){
	            return "7";
	        }
	        if (value > 23 && value < 28){
	            return "8";
	        }
	        if (value > 27 && value < 32){
            return "9";
	        }
	        if (value > 31 && value < 36){
	            return "10";
	        }
        if (value > 35 && value < 40){
	            return "Jack";
        }
	        if (value > 39 && value < 44){
	            return "Queen";
	        }
	        if (value > 43 && value < 48){
	            return "King";
	        }
	        if (value > 47 && value < 52){
	            return "Ace";
	        }
	        return "No face for that value";
	 
	    }
	 
	    /**
	     *  <code>getSuit</code> - work out eut the suit of a card with the sent value, e.g. 0 =
	     *
	     * @param value an <code>int</code> value
	     * @return a <code>String</code> value
	     */
	    private String getSuit(int value){
	 
	        int suitValue = value % 4;
	        switch (suitValue){
	            case 0:
	            return "Diamonds";
	            case 1:
	            return "Hearts";
	            case 2:
	            return "Spades";
	            case 3:
	            return "Clubs";
	        }
	        // error...
	        return  null;
	 
	    }
	 
	}
