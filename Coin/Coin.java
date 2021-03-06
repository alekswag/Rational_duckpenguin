/*
Aleksandar Shipetich
APCS1 pd5
HW14 -- Wayne's World
2015-10-7
 */

// class Coin

public class Coin {

    //attributes aka instance vars
    private double value;
    private String upFace, name;
    private int flipCtr, headsCtr, tailsCtr;
    private double bias = .5;

    /*=============================
      Coin() -- default constuctor
      precond: 
      postcond: 
      =============================*/
    public Coin() { 
	name = "penny";
	upFace = "heads";
	value = .01;
	flipCtr = 0;
	headsCtr = 0;
	tailsCtr = 0;
    }

    /*=============================
      Coin(String) -- overloaded constructor
      precond: input is one of: "penny","nickel","dime","quarter",
                                "half dollar","dollar"
      postcond: 
      =============================*/
    public Coin( String s ) { 
	this();
	name = s;
    }

    /*=============================
      Coin(String,String) -- 
      precond: 
      postcond: 
      =============================*/
    public Coin( String s, String nowFace ) { 
        this();
	name = s;
	upFace = nowFace;
    }

    // Accessors...
    // ----------------------------
    public String getUpFace() { 
	return upFace;
    }

    public int getFlipCtr() { 
	return flipCtr;
    }

    public double getValue() { 
	return value;
    }

    public int getHeadsCtr() { 
	return headsCtr;
    }

    public int getTailsCtr() { 
        return tailsCtr;
    }
    // ----------------------------


    /*=============================
      assignValue() -- set a Coin's monetary value based on its name
      precond:  input String is a valid coin name ("penny", "nickel", etc.)
      postcond: instvar value gets appropriate value
                Returns value assigned.
      =============================*/
    private double assignValue( String s ) {

	if( s == "penny"){
		value = .01;
	    }
	if( s == "nickel"){
		value = .05;
	    }
	if( s == "dime"){
		value = .1;
	    }
	if( s == "quarter"){
	    value = .25;
	}
	if( s == "half dollar"){
	    value = .5;
	}
	if(s == "dollar"){
	    value = 1.0;
	}


	return value;
    }
	       


    /*=============================
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
      =============================*/
    public void reset( String s, double d ) {
	if(d == .01){
	    name = "penny";
	}
	if(d == .05){
	    name = "nickel";
	}
	if(d == .1){
	    name = "dime";
	}
	if(d == .25){
	    name = "quarter";
	}
	if(d == .5){
	    name = "half dollar";
	}
	if(d == 1.0){
	    name = "dollar";
	}
	upFace = s;
	value = d;
	flipCtr = 0;
	headsCtr = 0;
	tailsCtr = 0;
    }


    /*=============================
      String flip() -- simulates a Coin flip
      precond:  bias is a double on interval [0.0,1.0]
                (1.0 indicates always heads, 0.0 always tails)
      postcond: upFace updated to reflect result of flip.
                flipCtr incremented by 1.
                Either headsCtr or tailsCtr incremented by 1, as approp.
                Returns "heads" or "tails"
      =============================*/
    public String flip() {
	String result;
	if(Math.random() < bias){
	    result = "heads";
	}
	else{
	    result = "tails";
	}
	upFace = result;
	flipCtr += 1;
	if(result == "heads"){
	    headsCtr += 1;
	}
	else{
	    tailsCtr += 1;
		}
	return result;
    }


    /*=============================
      boolean equals(Coin) -- checks to see if 2 coins have same face up
      precond: other is not null
      postcond: Returns true if both coins showing heads
                or both showing tails. False otherwise.
      =============================*/
     public boolean equals( Coin other ) { 
	 if(other.getUpFace().equals(getUpFace())){
	    return true;
	}
	else{
	    return false;
	}
	}


    /*=============================
      String toString() -- overrides toString() provided by Java
      precond: n/a
      postcond: Return String comprised of name and current face
      =============================*/
    public String toString() {
	return " This coin is a " +name +" and is currently on side "+ upFace+".";
    }

}//end Coin class
