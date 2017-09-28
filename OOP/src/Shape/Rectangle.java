package Shape;
import java.util.Scanner;


public class Rectangle {
	
	int length;
	int width;
	int area;
	private Scanner sc = new Scanner(System.in);

	public int getLength() {
		
		return length;
	}

	public void setLength(int length) {
	
		System.out.println("Enter Length");
		length = sc.nextInt();
		this.length = length;
	}

	public int getWidth() {
		
		return width;
	}

	public void setWidth(int width) {
		System.out.println("Enter Width");
		width = sc.nextInt();
		this.width = width;
	}

	public int getResult() {
		this.area = length * width;
		return area;
	}

	public void setResult(int area) {
		this.area = length * width;
	}

}
