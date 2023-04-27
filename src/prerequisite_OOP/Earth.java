package prerequisite_OOP;

public class Earth {

	public static void main(String[] args) {
		/*Human tom;
		
		tom = new Human();
		tom.age=5;
		tom.eyeColor="brown";
		tom.heightInInches=50;
		tom.name="krishna";
		
		tom.speak();
		
		Human joe=new Human();
		joe.age=3;
		joe.eyeColor="black";
		joe.heightInInches=30;
		joe.name="joeyal";
		joe.speak();
*/
		
		HumanInstance k=new HumanInstance("mithan",15, 20,"Green");
		HumanInstance m=new HumanInstance("sanc",5, 20,"brown");
		k.speak();
		m.speak();
			
	}

}
