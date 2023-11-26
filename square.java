import java.util.Scanner;

public class square{
	public static void main(String[] args){

		try{
			System.out.println("Enter the number:");
			Scanner in= new Scanner(System.in);
			int num= in.nextInt();

			int sq= num*num;
			System.out.println("Square is"+ sq);
		}
		catch(Exception e){
			System.out.println("Please enter valid data");
		}	
	}
}