package prerequisite_OOP;

public class Zoo {

	public static void main(String[] args) {
		
		Animals Sparrow1= new Sparrow(1, "bird", "female", 3, "Sparrow");
		//Sparrow1.move();
		
		Animals fish1=new Fish(2, "FIsh", "female", 3);
		
		//fish1.move();
		
		moveanimals(fish1);
		moveanimals(Sparrow1);
	}
	
	/* Here we are passing an animal of an parent type (Animals) so all the childreen can be
	 * passed in the same method of same type and this is called polymorphysm 
	 */
	public static void moveanimals(Animals animal) {
	
	animal.move();
}

} 
