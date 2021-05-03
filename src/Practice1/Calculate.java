package Practice1;

class Calculate{  
	  int cube(int x){  
	  return x*x*x;  
	  }  
	  
	  public static void main(String args[]){ 
		  Calculate c=new Calculate();
	  int result=c.cube(5);  
	  System.out.println(result);  
	  }  
	}  
