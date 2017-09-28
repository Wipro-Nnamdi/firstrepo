
public class Calculator {
	
	public static double powerint(int num1, int num2){
		return  Math.pow(num1, num2);
		
	}
	
	public static double powerDouble(double num1, double num2){
		return Math.pow(num1, num2) ;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Calculator.powerDouble(12, 10));
		System.out.println(Calculator.powerint(12, 10));
	}

}
