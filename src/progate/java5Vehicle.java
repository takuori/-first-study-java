package progate;

abstract class java5Vehicle {
	private String name;
	private String color;
    protected int distance = 0;
    private java4Person owner;
    
    java5Vehicle(String name, String color) {
    	this.name = name;
    	this.color = color;
    }
	
    public String getName() {
        return this.name;
    }

	public String getColor() {
		return this.color;
	}

	public int getDistance() {
		return this.distance;
	}
	
	public java4Person getOwner() {
		return this.owner;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void setOwner(java4Person person) {
		this.owner = person;
	}

	public void printData() {
		System.out.println("名前：" + this.name);
		System.out.println("色：" + this.color);
		System.out.println("走行距離" + this.distance + "km");
	}
	
	public abstract void run(int distance);

}
