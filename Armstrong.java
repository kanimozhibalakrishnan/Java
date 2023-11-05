import java.lang.*;
import java.util.*;


class Armstrong{
	public static void main(String[] argv){
		int n1,n2,rem,org=0,res=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		n1=sc.nextInt();
		n2=n1;
		while(n2>0)
		{
			rem=n2%10;
			res+=Math.pow(rem,3);
			n2=n2/10;
		}
		if(res==n1)
			System.out.println(n1+" is a Armstrong num");
		else
			System.out.println(n1+" is not an Armstrong num");
	}
}
