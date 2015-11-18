/*
  Aleksandar Shipetich
  APCS1 pd5
  HW16 -- Do I repeat myself? Very well, then I repeat myself
  2015-10-15
*/


// Note to Mr. Brown. I changed the fenceR from the version you gave us. It is awesomer now.
public class Repeater{
    static String fenceR = "";
    
    //fence creator with da while loop
    public static String fenceW(int posts){
	String fence = "";
	while(posts != 0){
	    if(posts == 1){
		fence += "|";
	    }
	    else {
		fence += "|--";
	    }
	    posts -= 1;

	}
	return fence;
    }

    //Recursive one
    public static void fenceR(int posts, String fence){
	if(posts > 0){
	    fenceR = "";
	    if(posts == 1){
		fence += "|";
		fenceR(0,fence);
	    }
	    else {
		fence +="|--";
		fenceR(posts - 1, fence);
	    }
	}
	else {
	    fenceR = fence;
	 
	}

    }
	   




    public static void main(String[] args){
	//While fence test calls
	System.out.println(fenceW(1));
	System.out.println(fenceW(2));
	System.out.println(fenceW(6));;

	//Recursive fence test calls
	fenceR(1,"");
	System.out.println(fenceR);
	fenceR(2,"");
	System.out.println(fenceR);
	fenceR(6,"");
	System.out.println(fenceR);
    }
}
