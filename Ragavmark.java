import java.lang.*;
import java.util.*;
class Ragavmark {
	public static void main(String[] args){
		System.out.println("Enter no.of subjects:");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int highestmark=0;
		int totalmarks=0;
		double averagemark;
		for(i=0;i<=s;i++){
			System.out.println("Enter the mark:");
			int mark=sc.nextInt();
			totalmarks+=marks;
			if(mark>highestmark){
				highestmark=mark;
			}
		}
		double averagemark= double totalmarks/s;
		System.out.println("Highest mark:"+highestmark);
		System.out.println("Average mark:"+averagemark);
	}	
}