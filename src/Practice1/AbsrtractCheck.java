package Practice1;

abstract class Bike{  
	  abstract void run();  
	}  

	class AbstractCheck extends Bike{  
	void run(){System.out.println("running safely");
	}  
	public static void main(String args[]){  
		AbstractCheck obj = new AbstractCheck();  
	 obj.run();  
	}  
	}  
