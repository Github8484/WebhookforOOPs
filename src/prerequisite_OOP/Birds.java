package prerequisite_OOP;

public class Birds extends Animals{
	private String Birdname;

	public Birds(int i, String string, String string2, int j, String Brdname) {
		super(i, string, string2, j);
		this.Birdname=Brdname;
	}
	

/*public Birds(String Brdname) {
// TODO Auto-generated constructor stub
	this.Birdname=Brdname;
	
}*/
	public void zoobird() {
		System.out.println("Hello This bird is  " +Birdname);
		
	}
	public void eat() {
		System.out.println("eating....");
		
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Flapping the wings..");
	}
		
	
}