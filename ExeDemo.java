public class ExeDemo{
	public static void main(String[] args){	
		System.out.println("One");
		System.out.println("Two");
		try{
			System.out.println("Before dividing");
			int a=1/0;
			System.out.println("After divide");
		}
		catch(ArithmeticException e){
			System.out.println("A number cant divide by zero.");
		}
		System.out.println("Three");
		System.out.println("Four");
	}
}