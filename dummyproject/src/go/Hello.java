package go;

public class Hello {
	public void show() {
		System.out.println("you are in the show() function");
	}
public static void main(String[] args) {
	System.out.println("hello everyone");
	Hello c=new Hello();
	c.show();
}
}
