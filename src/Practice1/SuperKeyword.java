package Practice1;

class Vehicle{  
  String color="Blue";
  
  void run() {
	  System.out.println("vehicle is running");
  }
}  
class Car extends Vehicle{  
 String color="white";
 
 void printcolor() {
	 System.out.println(super.color);
	 System.out.println(color);
 }
 
 void run() {
	  System.out.println("car is running");
 }
 void check() {
	 run();
	 super.run();
 }
}  

class SuperKeyword{  
public static void main(String args[]){  
	Car c = new Car();
	c.printcolor();
	c.check();
	
	
}
}  
