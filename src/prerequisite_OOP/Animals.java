package prerequisite_OOP;

public abstract class Animals {
	int age;
	String Animaltype;
	String Gender;
	int height;
/*public Animals() {
	
}*/

	public Animals(int i, String string, String string2, int j) {
		age=i;
		Animaltype=string;
		Gender=string2;
		height=j;
	// TODO Auto-generated constructor stub
}

	public void zooanimal() {
		System.out.println("Hello This Animal is  " +Animaltype);
		System.out.println("Its is "+ height + "inches tall");
		System.out.println("its age is " + age +"year old");
		System.out.println("*******************************");
		
	}
	public void eat() {
		System.out.println("eating....");
		
	}
	public void walk() {
		System.out.println("walking....");
		
	}
	public void work() {
		System.out.println("working....");
	
	}
	
	public abstract void move();
	
	
}
