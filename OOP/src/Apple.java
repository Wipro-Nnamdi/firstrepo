
public class Apple extends Fruit {
	
	public Apple (String name, String taste, String size){
		super(name, taste, size);
	}
 
	@Override
	public String eat(){
		return "This method overides the one in the Fruit class.";
	}
}
