package prerequisite_OOP;

public class Human {
	String name;
	int age;
	int heightInInches;
	String eyeColor;
public Human() {
	
}

	public void speak() {
		System.out.println("Hello dear " +name);
		System.out.println("i am "+ heightInInches + "inches tall");
		System.out.println("i am " + age +"year old");
		System.out.println("my eye color is " + eyeColor);
		
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
