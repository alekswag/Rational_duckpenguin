/*
Aleksandar Shipetich
APCS1 pd5
HW25 --  Recurse, Recurse, on Elements Not the First!
2015-11-5
 */


public class Loopier{

    // Shortener
    public static int[] forgetTheFirst(int[] a){
	int[] quack = new int[a.length-1];
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

    
    public static int linSearchR(int[] a, int target){
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

    
    public static int freqRec( int[] a, int target ){
	int aleks = 0;
	if (a.length == 0)
	    return 0;
	else if (a[0] == target)
	    aleks = 1;
	
	    return aleks + freqRec( forgetTheFirst(a), target);


  
    }
  
    public static void main(String[] args){
	int[] aleks = {1,2,3,4,5,6};
	int[] shipetich = {1,2,3,4,2,3,6,6,6,6};
	//Test cases 4 first two functions
	System.out.println("Iteration returns: " + linSearch(aleks, 2));
	System.out.println("Recursion returns: " + linSearchR(aleks,2));
	System.out.println();
	//Tests cases 4 the second two functions
	System.out.println("Iteration returns: "+ freq(shipetich,0));
	System.out.println("Recursion returns: " + freqRec(shipetich,0));	
	

    }





}
