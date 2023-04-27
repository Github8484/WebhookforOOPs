package prerequisite_OOP;

public class HumanInstance{

	String name;
	int age;
	int heightInInches;
	String eyeColor;
//public Human() { }

//right click --> source --> generate constructor using fields//
	public HumanInstance(String name, int age, int heightInInches, String eyeColor) {
	super();
	this.name = name;
	this.age = age;
	this.heightInInches = heightInInches;
	this.eyeColor = eyeColor;
}

	public void speak() {
		System.out.println("Hello dear " +name);
		System.out.println("i am "+ heightInInches + "inches tall");
		System.out.println("i am " + age +"year old");
		System.out.println("my eye color is " + eyeColor);
		System.out.println("****************************");
		
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

}
