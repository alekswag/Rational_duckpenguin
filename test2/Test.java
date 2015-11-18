public class Test{


    public static boolean xyzThere(String str) {
	String temp = "";
	boolean aleks = false;
	for (;str.length() > 2; str = str.substring(1)){
	    if (str.substring(0,3).equals("xyz") && temp != ".")
		aleks = true;
	    else
		temp = str.substring(0,1);
	}
	return aleks;
	    
		
		    
		
	  
  
		}
    public static void main(String[] args){
	System.out.println(xyzThere("abcxyz"));
	System.out.println(xyzThere("abc.xyz"));
	System.out.println(xyzThere("xyz.abc"));	



    }
