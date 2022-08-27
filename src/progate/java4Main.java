package progate;

public class java4Main {
	public static void main(String[] args) {
		java4Person person1 = new java4Person("玉井", "詩織", 27, 1.591, 48.1, "医者");
			
	    person1.printData();
	    
	    java4Person person2 = new java4Person("百田", "えくぼ", "夏菜子", 28, 1.581, 48.3, "教師");
	    
	    person2.printData();
	    System.out.println("person2のミドルネームは" + person2.getMiddleName() + "です");
	    java4Person.pointCount();
	    
	    person1.setMiddleName("サブ");
	    System.out.println("person1のミドルネームを" + person1.getMiddleName() + "に変更しました");
	    
	    person1.setJob("獣医");
	    System.out.println("person1の仕事を" + person1.getJob() +"に変更しました");
	    person1.printData();
	}
	

}
