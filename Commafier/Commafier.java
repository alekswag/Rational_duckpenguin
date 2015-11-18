/*
Aleksandar Shipetich
APCS1 pd5
HW20 -- Karmacomma
2015-10-22  
*/



public class Commafier {

    // Takes an int and returns a String with the number with commas in it. Recursivley
    public static String commafyR(int n) {

	if(n<1000){
	    return Integer.toString(n);
	}
	else if(n == 1000)
	    return "1,000";
	else
	    return commafyR(n/1000) + "," +Integer.toString(n%1000);
		
	
    }

 // Takes an int and returns a String with the number with commas in it. For loop
    public static String commafyF(int n) {
	String aleks = "";
	if (n==1000)
	    return "1,000";
	for (;n > 1000; n=n/1000){
	    aleks =","+ n%1000 +aleks;
	    }
	
	aleks = n+aleks;
	return aleks;
	    
    }


	public static void main( String[] args ) { 

	    for(String aleks: args){
		System.out.println(commafyR(Integer.parseInt(aleks)));
	    }
	}
    
 
}//end class 
