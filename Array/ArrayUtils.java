/*
Aleksandar Shipetich
APCS1 pd5
HW27 -- Objectify Your Array Tools
2015-11-9
*/
public class ArrayUtils{
    // Makes array of length 6
    static int[] quack = new int[6];
    static String[] toph = {"Aleks", "Is", "Swag"};
    //Uses for statement to cycle thru spots in teh array
    //Generates random decimal <1, mult by 10 to get int, add lower to bring it up to range and mod is so that it loops around when it gets to upper limit
    public static void popArray(int[] aleks, int low, int upp){
	for (int i =0; i < aleks.length; i++ ){
	    aleks[i] = (int)(Math.random()*10)%(upp-low) + low;
	}
     
    }
    // uses for to cycle thru the array and add the ints to a string
    public static String stringify(int[] aleks){
	String shipetich = "";
	for (int i=0; i< aleks.length; i++){
	    shipetich += aleks[i]+" ";
	}
	return shipetich.substring(0, shipetich.length()-1);
    }

    public static String stringify(String[] aleks){
	String shipetich = "";
	for (int i=0; i< aleks.length; i++){
	    shipetich += aleks[i]+" ";
	}
	return shipetich.substring(0, shipetich.length()-1);
    }


      public static int[] forgetTheFirst(int[] a){
	int[] quack = new int[a.length-1];
	for (int i = 1; i<a.length;i++){
	    quack[i-1] = a[i];
	}
	return quack;
    }

    public static String[] forgetTheFirst(String[] a){
	String[] quack = new String[a.length-1];
	for (int i = 1; i<a.length;i++){
	    quack[i-1] = a[i];
	}
	return quack;
    }





    
    // All linSearch methods return index of first occurance of target or -1 if it aint there
    public static int linSearch(int[] a, int target){
	// goes thru a and checks for match
	for(int i=0;i< a.length;i++){
	    if (a[i] == target)
		return i;
	}
	return -1;
    }

    public static int linSearch(String[] a, String target){
	// goes thru a and checks for match
	for(int i=0;i< a.length;i++){
	    if (a[i].equals(target))
		return i;
	}
	return -1;
    }

    // Did the recursion using a helper function which is the one that actually recurses, adding 1 for every space it moves and stopping when it finds the target. Reason helper function is needed is to check if the recursion returns more than the length which is the same as it didn't find the target.
    public static int linSearchDuh(int[] a, int target){
	int aleks = 0;
	if (a.length == 0)
	    return 1;
	else if (a[0] == target)
	    return aleks;
	else
	    return 1 + linSearchDuh(forgetTheFirst(a), target);
    }
   public static int linSearchDuh(String[] a, String target){
	int aleks = 0;
	if (a.length == 0)
	    return 1;
	else if (a[0].equals( target))
	    return aleks;
	else
	    return 1 + linSearchDuh(forgetTheFirst(a), target);
    }
    
    public static int linSearchR(int[] a, int target){
	if (linSearchDuh(a, target) >= a.length)
	    return -1;
	return linSearchDuh(a, target);
    }

    public static int linSearchR(String[] a, String target){
	if (linSearchDuh(a, target) >= a.length)
	    return -1;
	return linSearchDuh(a, target);
    }

    //frequency function that will return the number of occurrences of a target in an existing array. (First version iterates, second recurses.)

    public static int freq( int[] a, int target ){
	int aleks = 0;
	for (int i=0; i<a.length; i++){
	    if (a[i] == target)
		aleks ++;
	}
	return aleks;
    }

    public static int freq( String[] a, String target ){
	int aleks = 0;
	for (int i=0; i<a.length; i++){
	    if (a[i].equals(target))
		aleks ++;
	}
	return aleks;
    }
    
    public static int freqRec( int[] a, int target ){
	int aleks = 0;
	if (a.length == 0)
	    return 0;
	else if (a[0] == target)
	    aleks = 1;
	
	    return aleks + freqRec( forgetTheFirst(a), target);
    }


    public static int freqRec(String[] a, String target ){
	int aleks = 0;
	if (a.length == 0)
	    return 0;
	else if (a[0].equals(target))
	    aleks = 1;
	
	return aleks + freqRec( forgetTheFirst(a), target);
    }
    //main method
    public static void main(String[] args){
	popArray(quack, 10,15);
	System.out.println(stringify(quack));
	System.out.println(stringify(toph));
	//Expected = 2
	System.out.println(linSearch(toph, "Swag"));
	System.out.println(linSearchR(toph, "Swag"));	
	//Expected = -1
	System.out.println(linSearch(toph, "swag"));	
	System.out.println(linSearchR(toph, "swag"));
	//Expected = 1
	System.out.println(freq(toph, "Swag"));
	System.out.println(freqRec(toph, "Swag"));
	//Expected = 0
	System.out.println(freq(toph, "SWAg"));
	System.out.println(freqRec(toph, "SWAg"));
    }






}
