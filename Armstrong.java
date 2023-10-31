import java.*;
class Armstrong{
	public static void main(String[] argv){
		int n1,n2,rem,org=0,res;
		n2=n1;
		while(n1>0)
		{
			rem=n1%10;
			res+=n1*3;
			n1=n1/10;
		}
		if(res==n2)
			system.out.println("Armstrong num is:",res);
		else
			system.out.println(" not an Armstrong num is:",res);
	}
}
