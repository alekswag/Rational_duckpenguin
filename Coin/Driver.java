/*
Aleksandar Shipetich
APCS1 pd5
HW15 -- Loopy
2015-10-13   
*/
public class Driver {



    public static void main( String[] args ) {

	//build Objects from blueprint specified by class Coin

	//test default constructor
	Coin mine = new Coin();

	//test 1st overloaded constructor
	Coin yours = new Coin( "quarter" );

	//test 2nd overloaded constructor
	Coin wayne = new Coin( "dollar", "heads" );

       	//A. Until x heads have come up
	while (mine.getHeadsCtr() <60) {
	    mine.flip();
	}
	
	//Prints summaries
	System.out.println("The number of heads is " +mine.getHeadsCtr() +"! " +"The number of tails is " + mine.getTailsCtr() + "! " + "The total number of flips was " + mine.getFlipCtr() +".");

	mine.reset("heads" , .01);
        yours.reset("heads" , .01);
	
       	//B. Until y matches have come up
	int matchCtr = 0;
	while (matchCtr <6) {
	    mine.flip();
	    yours.flip();
	    if (mine.equals(yours)){
		matchCtr += 1;
	    }
	}
	
	// Prints summaries
	System.out.println("The number of matches is " + matchCtr+ "! And it only took " +  mine.getFlipCtr() + " tries!");

	mine.reset("heads" , .25);
        yours.reset("heads" , .05);

	//C. At least 13 matches, and the number is divisible by # of heads and # of tails.
       	matchCtr = 0;
	while (matchCtr == 0){
	    mine.flip();
	    yours.flip();
	    if (mine.equals(yours)){
		matchCtr += 1;
	    }
	}
	    
	while ((10* matchCtr)%(10 * mine.getValue()) != 0.0 && (10* matchCtr)%(10 * yours.getValue()) != 0.0) {
	    mine.flip();
	    yours.flip();
	    if (mine.equals(yours)){
		matchCtr += 1;
	    }
	}

	//Prints summaries
	System.out.println("The number of matches is "+ matchCtr +" and the value of my coin is " + mine.getValue() + " and the value of your coin is " + yours.getValue()+ "!");
	
		



	//test toString() methods of each Coin
	/*	System.out.println("mine: " + mine);
	System.out.println("yours: " + yours);
	System.out.println("wayne: " + wayne);*/

	//test flip() method
	/*	System.out.println("\nAfter flipping...");
	yours.flip();
	wayne.flip();
	System.out.println("yours: " + yours);
	System.out.println("wayne: " + wayne);*/

	//test equals() method
	/*	if ( yours.equals(wayne) ) 
	    System.out.println( "Matchee matchee!" );
	else
	System.out.println( "No match. Firestarter you can not be." );*/


	
	/*===================TOP==========================
	    ====================BOTTOM======================*/
    }//end main

}//end class
