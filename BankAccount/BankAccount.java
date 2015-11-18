/*
  ; Team Nworb- Aleksandar Shipetich, Dorothy Ng, Advay Sriram
  ; APCS1 pd5
  ; HW10 --  Mo Money Mo Problems
  ; 2015-10-01
*/

public class BankAccount {

    //Instance Variables
    String name;
    String pass;
    int pin;
    int num;
    double bal;

    //Default Constructor -- gives default vals to insta vars
    public BankAccount(){
	name = "Nobdy";
	pass = "swigityswootyimcominforthatbooty";
	pin = 9999;
	num = 999999999;
	bal = 0.0;
    }

    //Overloaded Constructor -- giving us the power to change insta var val
    public BankAccount(String n, String p, int aleks, int swag, int accBal){
	name = n;
	pass = p;
	//Go nine-digit acc. no. or go home
	if (swag >= 100000000 && swag <= 999999998) {
	    num = swag;
	}
	else {
	    num = 999999999;
	    System.out.println ("The Count von Count would be disappointed. Account Number set to 999999999 until such a time that you choose to set the correct number of digits for this field.");
	}
	//4-digit pin. Deal or no deal?
	if (aleks >= 1000 && aleks <= 9998) {
	    pin = aleks;
	}
	else {
	    pin = 9999;
	    System.out.println ("Look at your pin. Now count to 4. Now look at your pin. See an issue? No? Then you don’t deserve a bank account. PIN set to 9999, until you figure out basic math.");
	}
	bal = accBal;
    }

    //Overwriting toString()
    public String toString(){
	String accInfo;
	accInfo = "Name:" +name+"\n";
	accInfo += "Password:" +pass+"\n";
	accInfo += "4-Digit PIN:" +pin+"\n";
	accInfo += "Account Number:" +num+"\n";
	accInfo += "Balance:" +bal+"\n";
	return accInfo;
    }

    //Check right owner, add monies to balance
    public void depositMonies(String Username, String Password, double monies){
	if (authenticate(Username, Password)) {
	    bal += monies;
	}
	else {
	    System.out.println ("Wrong Password/Username");
	}

    }

    //Check right owner, take monies from balance
    public void withdrawMonies(String Username, String Password, double monies){
	
	if ( monies <= bal && monies > 0 && authenticate(Username, Password)){
	    bal -= monies;
	}
	else { 
	    System.out.println("You have insufficient funds. Come back when you have acquired more monies.");
	}
    }
	/* Authenticate which takes a Username and Password and confirms that it is correct returns true or false */
	public boolean authenticate(String Username, String Password){
	    if (Username == name && Password == pass){
		return true;
	    }
	    else {
		return false;
	    }
	}






	// The main function
	//Tests the account creating and the desposit/withdraw/toString functions
	public static void main( String[] args) {
	    BankAccount aleksandar = new BankAccount("Aleksandar", "alekswag", 1999, 666666666, 100);
	    aleksandar.depositMonies("Aleksandar","alekswag",1.09);
	    aleksandar.withdrawMonies("Aleksandar","alekswag",50.01);
	    System.out.println(aleksandar.toString());
	}
    }



      
