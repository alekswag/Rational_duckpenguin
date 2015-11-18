/*
Aleksandar Shipetich
APCS1 pd5
HW22 -- Augmenting your array of tools
2015-11-2
*/
public class ArrayUtils{
    // Makes array with 6 
    static int[] quack = new int[6];

    public static void popArray(int[] aleks, int low, int upp){
	for (int i =0; i < aleks.length+1; i++ ){
	    aleks[i] = (int)(Math.random()*10)%(upp-low) + low;
	}
     
    }
    
    public static String stringify(int[] aleks){
	String shipetich = "";
	for (int i=0; i< aleks.length+1; i++){
	    shipetich += aleks[i]+" ";
	}

	return shipetich;
    }
    public static void main(String[] args){
	popArray(quack, 10,15);
	System.out.println(stringify(quack));
    }






}
