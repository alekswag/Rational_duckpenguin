/*
  Aleksandar Shipetich
  APCS1 pd5
  HW18 -- For the Lulz Love of Strings
  2015-10-19
*/




public class Foresrever{



    //Constructs a fence using for
    public static String fenceF(int posts){
	String aleks = "";
	if (posts > 0)
	    aleks += "|";
	for (int n = posts-1; n > 0; n--){
	    aleks += "--|";
	}
	return aleks;
    }

    //Reversifies input String s using for
    public static String reverseF(String s){
	int shipetich = s.length();
	String aleks = "";
	for (; aleks.length() != shipetich; s = s.substring(0, s.length() - 1)){
	    aleks += s.substring(s.length() - 1);
	}
	return aleks;
    }

    //Reversifies input String s using recursionation
    public static String reverseR(String s){
	if (s != "")
	    return reverseR(s.substring(0, s.length()-1)) + s.substring(s.length() -1);
	else
	    return "";
    }





    
    //Testing Zone
    public static void main(String[] args){

	//Testing fenceF
	System.out.println(fenceF(0));
	System.out.println(fenceF(1));
	System.out.println(fenceF(6));	

	//Testing reverseF
	System.out.println(reverseF("Aleksisswag"));
	System.out.println(reverseF("hcitepihS radnaskelA"));		

	//Testing reverseR
	System.out.println(reverseF("Aleksisswag"));	
	System.out.println(reverseF("hcitepihS radnaskelA"));		

    }
}
