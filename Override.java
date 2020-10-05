class Animal{
	public void move(){
		System.out.println("This is Animal");
	}
}
class Plant extends Animal{
	public void move(){
		System.out.println("This is Plant");
	}
}
public class Override {
	public static void main(String[] args) {
		Animal a= new Animal();
		Plant b=new Plant();
		a.move();
		b.move();
		Animal obj1 = new Plant();
		obj1.move();
	}
}