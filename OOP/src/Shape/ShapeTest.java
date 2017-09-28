package Shape;


public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape c = new Circle();
		Shape t = new Triangle();
		
		System.out.println(c.draw());
		System.out.println(c.erase());
		System.out.println(t.draw());
		System.out.println(t.erase());
	}

}
