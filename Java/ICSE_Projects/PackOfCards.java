package ICSE_Projects;

// it is download from internet for a pack of cards game designed...
public class PackOfCards{
  /**
   *  <code>card</code> - this class field is used to store the card objects
   *
   */
  private Card[] cards;
	  /**
	   *  <code>position</code> - the current position in the pack,
	   *  gets updated each time you call 'getNextCard()'
	   *
	   */
	  private int position;
	  /**
	   * Creates a new <code>PackOfCards</code> instance. T
	   * he Card objects in the cards array are instantiated,
	   * the position is set to zero. The pack starts off in value order,
	   * from 2 of clubs up to ace of spades.
	   *
	   */
	  public PackOfCards(){
	    cards = new Card[52];
	    for (int i=0;i<52;i++) {
	      cards[i] = new Card(i);
	    }
	    position = 0;
	  }
	   
	  public void printPack(){

	    for (int i=0;i<52;i++) {
	      System.out.println(cards[i].getName());
	    }
	  }
	 
	  /**
	   *  <code>shuffleCards</code> - shuffles the Card objects
	   *  in the card array into a random order. If swaps==1,
	   *  it will swap 2 cards around. Set swaps to 1000 or more to get a really good shuffle.
	   *
	   */
	  public void shuffleCards(int swaps){
	    int swapsDone = 0;
	    // these local variables will store the indexes of the Cards in the array
	    // that are to be swapped
	    int pos1, pos2;
	    // used to store a card while it is being moved
	    Card tempCard;
	    while (swapsDone<swaps) {
	      pos1 = getRandomInt(52);
	      pos2 = getRandomInt(52);
	      // check they are not the same
	      // keep generating new numbers until pos1 is different from pos2
	      while (pos1==pos2) {
	    pos2 = getRandomInt(52);
	      }
	      // store the first card
	      tempCard = cards[pos1];
	      // move the second card into it's place
	      cards[pos1] = cards[pos2];
	     // move the first card into the second card's place
	      cards[pos2] = tempCard;
	      // increae the swapsDone count
	      swapsDone++;
	    }
	  }
	   
	  /**
	   *  <code>getNextCard</code> - get the next card from the pack of cards.
	   *
	   * @return a <code>Card</code> value
	   */
	  public Card getNextCard(){
	    int lastPosition = position;
	    position++;
	    if (position>cards.length) {
	      position = 0;
	    }
	    return cards[lastPosition];
	  }
	   
	     
	  /**
	   * This method generates a random int between 0 and max then returns it.
	   */
	  public int getRandomInt(int max){
	    double random = Math.random() * max;
	    return (int)random;
	  }
	   
	 
}

