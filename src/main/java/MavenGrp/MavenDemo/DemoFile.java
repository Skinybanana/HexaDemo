package MavenGrp.MavenDemo;


class Animal
{
	final public String color = "white";
	public Animal(){
		System.out.println("i am the super constructor");
	}
	public void disp() 
	{
		System.out.println("i am the disp method");
	}
}

class Dog extends Animal{
	
	public String color = "Black";
	public Dog() {
		super();
		System.out.println("testing");
	}
	public void disp() {
		System.out.println("i am the disp child method");
	}
}

public class DemoFile {

	public static void main(String[] args) {
		
		int p =1;
		int q =2;
		int r =3;
		
		p |=4;
		q >>=1;
		r <<=1;
		p ^= r;
		System.out.println(q + " " + q + " " + r);

	}
	

}


