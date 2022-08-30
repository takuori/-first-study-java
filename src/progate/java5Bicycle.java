package progate;

public class java5Bicycle extends java5Vehicle {
	//名前、色、距離に関するフィールド、メソッドはVehicleのサブクラスとして
	//継承されている
	
	java5Bicycle(String name, String color) {
		super(name, color);
	}
	
	public void run(int distance) {
	    System.out.println(distance + "km走ります!");
	    this.distance += distance;
	    System.out.println("走行距離：" + this.distance + "km");
	  }
}
