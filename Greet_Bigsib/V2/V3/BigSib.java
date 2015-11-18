public class BigSib {
    String helloMsg;

    public void setHelloMsg(String msg){
	helloMsg = msg;
    }

    
	  String greet(String name){
	    String retStr;
	    retStr = helloMsg;
	    retStr +=" " +  name + ".";
	    return retStr;
		}
    




	
}
