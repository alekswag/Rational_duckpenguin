/*
  ; Team Nworb- Aleksandar Shipetich, Dorothy Ng, Advay Sriram
  ; APCS1 pd5
  ; HW11 --  Hey… I Got Your Money
  ; 2015-10-04
*/

public class Teller{
    public static void main(String[]args){
        BankAccount nworb = new BankAccount("Nworb", "Rm", 6666, 666666666, 100000000000000.01);
        System.out.println(nworb.getFullName());
        System.out.println(nworb.getPassword());
        System.out.println(nworb.getPinNumber());
        System.out.println(nworb.getAccountNumber());
        System.out.println(nworb.getBalance());
        
        nworb.setFullName("Brown");
        nworb.setPassword("Mr");
        nworb.setPinNumber(9696);
        nworb.setAccountNumber(969969969);
        nworb.setBalance(1.01);
        nworb.deposit(69.69);
        nworb.withdraw(10.05);
        nworb.authenticate(969969969, "Mr");
        nworb.checkPinNumber();
        nworb.checkAccountNumber();
        System.out.println(nworb.toString());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}