
class MyException extends Exception{
	
}
public class AhmadTest {
	public Boolean throwException(String str) throws MyException{
		if(str.equals("Food")){
			return true;
			}
		throw new MyException(); 
		
		
	}
	public static void main(String[] args){
		
		AhmadTest ah = new AhmadTest();
		try {
			ah.throwException("Food");
			ah.throwException("Foodss");
		} catch (MyException e) {
			System.out.println("Oops... Exception appears");
		}
		finally {
			System.out.println("Finally block works");
		}
	}
}
