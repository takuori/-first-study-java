package progate;

public class java5Bicycle extends java5Vehicle {
	
	java5Bicycle(String name, String color) {
		super(name, color);
	}
	
	public void run(int distance) {
	    System.out.println(distance + "km走ります");
	    this.distance += distance;
	    System.out.println("走行距離：" + this.distance + "km");
	  }
}
