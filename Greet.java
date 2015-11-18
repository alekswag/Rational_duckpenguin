/*
; Aleksandar Shipetich
; APCS1 pd5
; HW02 -- Howdy, <VeryInterestingPerson>!
; 2015-09-17 
*/





public class Greet {
    public static void main(String[] args){
	    if (Math.random() >.5){
		greet("Aleksandar The Great");
	    }
	    else if (Math.random() >.5){
		greet("Donald Trump");
	    }
	    else {
		greet("Bernie Sanders");
	    }
    }
	public static void greet(String s){
	    System.out.println("Hey " + s + "! How's it going?");
	}

	
	    
    
}
