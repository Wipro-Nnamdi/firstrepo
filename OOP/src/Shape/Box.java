package Shape;
import java.util.Scanner;


public class Box {
	
	private double width;
	private double height;
	private double depth;
	private static Scanner sc;
	
	public void userInput() {
		System.out.println("Enter Width");
		this.width = sc.nextDouble();
		System.out.println("Enter Height");
		this.height = sc.nextDouble();
		System.out.println("Enter Depth");
		this.depth = sc.nextDouble();
	}	
	
	public void volume(){
		double vol = height * width * depth;
		System.out.println(vol);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);
		Box box = new Box();
		box.userInput();
		box.volume();

	}

}
