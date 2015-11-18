/*
Aleksandar Shipetich
APCS1 pd5
HW22 -- Augmenting your array of tools
2015-11-2
*/
public class ArrayUtils{
    // Makes array of length 6
    static int[] quack = new int[6];

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

	return shipetich;
    }
    //main method
    public static void main(String[] args){
	popArray(quack, 10,15);
	System.out.println(stringify(quack));
    }






}
