package prerequisite_OOP;

public class Fish extends Animals {
	public Fish(int age, String animaltype, String gender, int height) {
		super(age, animaltype, gender, height);
		
	}
	String Fishtype;
	int length;

/*public Fish(String Fishtp,int length) {

Fishtype=Fishtp;
this.length=length;

	}
*/
	public void zoofish() {
		System.out.println("Hello This fish is  " +Fishtype);
		System.out.println("This fish is having length of " +length +" feet");
		
	}
	/*public void swim() {
		System.out.println("Swimming....");
		
	}*/
	@Override
	public void move() {
		
		System.out.println("fish is swimming....");
	}
	
	
}