import java.util.Scanner;

public class largest_of_numbers {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value 1:");
        int a=in.nextInt();

        System.out.println("Enter value 2:");
        int b=in.nextInt();

        System.out.println("Enter value 3:");
        int c= in.nextInt();

        if(a>b && a>c){
            System.out.println("The value "+ a +" is greater among "+ b +" and "+ c);
        }
        else if(b>a && b>c){
            System.out.println("The value "+ b +" is greater among "+ a +" and "+ c); 
        }
        else{
            System.out.println("The value "+ c +" is greater among "+ a +" and "+ b);
        }
    }
}
