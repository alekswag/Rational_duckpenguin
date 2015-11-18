//class Slots
//simulates a slot machine in your very own terminal
/*
  Aleksandar Shipetich
  APCS1 pd5
  HW24 -- I was born a gamblin' man
  2015-11-04
*/

public class Slots {

    private static final String[] FRUITS = {
	"lime", "lime", "lime", 
	"lemon", "lemon", "lemon", 
	"cherry", "cherry", "cherry", 
	"orange", "orange", "orange", 
	"grapefruit", "grapefruit", "grapefruit", 
	"tangerine", "tangerine", "tangerine", 
	"ugli", "ugli", "ugli",
	"peach", "peach", "peach"
    };
    private String[] _fruits= new String[24]; //to be init'd by each instance

    public  void popArray(String[] aleks, int low, int upp){
	for (String s: FRUITS){
	    boolean check = true;
	    for (int number = ( (int)(Math.random()*100)%(upp-low) + low); check; number =( (int)(Math.random()*100)%(upp-low) + low)){
		if (aleks[number] == null){
		    aleks[number] = s;
		    check = false;
		}  
	    }
	    
	}
     
    }
    public static String stringify(String[] aleks){
	String shipetich = "";
	for (int i=0; i< aleks.length; i++){
	    shipetich += aleks[i]+" ";
	}

	return shipetich;
    }
    /*=====================================
      Slots() -- default constructor
      pre:  constant array FRUITS exists, has been initialized
      post: mutable array _fruits contains same elements as FRUITS
      =====================================*/
    public Slots() {
	popArray(_fruits, 0, 24);
	//allocate memory for _fruits based on size of FRUITS


	//copy elements of FRUITS into _fruits

    }


    /*=====================================
      String toString() -- overrides inherited toString()
      pre:  
      post: returns String of elements in slots 0 thru 2, separated by tabs
      =====================================*/
    public String toString() {
	String aleks = "";
        aleks += _fruits[0] + " ";
        aleks += _fruits[1]+ " ";
        aleks += _fruits[2];
	return aleks;
    }


    /*=====================================
      void swap(int,int) -- array swap util fxn
      pre:  _fruits array exists
      post: elements at indices i, j are swapped
      =====================================*/
    private void swap( int i, int j ) {
	String temp1 = _fruits[i];
	String temp2 = _fruits[j];
	_fruits[i] = temp2;
	_fruits[j] = temp2;
    }


    /*=====================================
      void spinOnce() -- simulate a pull of the slot machine lever
      pre:  _fruits array exists
      post: randomized order of elements in _fruits array
      =====================================*/
    public void spinOnce() {
	int i=0;
	for (String s: _fruits){
	    _fruits[i] = null;
	    i++;
	}
	popArray(_fruits, 0, 24);	
    }


    /*=====================================
      boolean jackpot() -- checks for a winning combo
      pre:  _fruits is existing array
      post: returns true if first 3 slots represent winning combo,
      false otherwise
      =====================================*/
    public boolean jackpot() {
	String slot1 = _fruits[0];
	String slot2 = _fruits[1];
	String slot3 = _fruits[2];
	if ( slot1.equals(slot2) && slot2.equals(slot3) )
	    return true;
	return false;
    }


    /*=====================================
      boolean miniWin() -- checks for a winning combo
      pre:  _fruits is existing array
      post: returns true if first 3 slots represent winning combo,
      or if first 3 slots mutually distinct, 
      false otherwise
      =====================================*/
    public boolean miniWin() {
	String slot1 = _fruits[0];
	String slot2 = _fruits[1];
	String slot3 = _fruits[2];
	if (jackpot())
	    return true;
	else if ((slot1 != slot2) && (slot2 != slot3) && (slot1 != slot3))
	    return true;
	return false; //to get past compiler
    }


    //main() method for testing
    public static void main( String[] args ) {
	//usage: move bar below down 1 line at a time to test functionality...

	Slots machine01 = new Slots();
	Slots machine02 = new Slots();

	//test to verify slot machines function indepently
	System.out.println();
	//	System.out.println( "Machine01 initial state:\t" + machine01.stringify(machine01._fruits)) ;
	//	System.out.println( "Machine02 initial state:\t" + machine02.stringify(machine02._fruits));
	//	System.out.println(machine01.toString());

	  System.out.println( "\nSpinning machine01...\n" );

	  machine01.spinOnce();
	  /*	  System.out.println("quack");
	  System.out.println();
	  System.out.println( "Machine01 state:\t" + machine01.stringify(machine01._fruits) );
	  System.out.println( "Machine02 state:\t" + machine02.stringify(machine02._fruits) );
	  System.out.println();

	  */
	  //test gamble-until-you-win mechanism

	  System.out.println( "Preparing to spin until a mini win! . . ." );
	  System.out.println( "------------------------------------" );

	  //if you haven't won, spin again until you win!
	  while( machine01.miniWin() == false ) {
	  System.out.println( "Your spin..." + "\t" + machine01 );
	  System.out.println( "LOSE\n" );
	  machine01.spinOnce();
	  }

	  System.out.println( "====================================" );
	  System.out.println( "Your spin..." + "\t" + machine01 );
	  System.out.println( "WIN\n" );



	  System.out.println( "Preparing to spin until...jackpot! . . ." );
	  System.out.println( "------------------------------------" );

	  //if you haven't won, spin again until you win!
	  while( machine01.jackpot() == false ) {
	  System.out.println( "Your spin..." + "\t" + machine01 );
	  System.out.println( "LOSE\n" );
	  machine01.spinOnce();
	  }

	  System.out.println( "====================================" );
	  System.out.println( "Your spin..." + "\t" + machine01 );
	  System.out.println( "JACKPOT!\n" );

    }//end main

}//end class Slots
