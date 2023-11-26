import java.util.Scanner;

public class check_alphabet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character:");
        char c = in.next().charAt(0); 

        if(Character.isAlphabetic(c)){
            System.out.println("This is an Alphabet.");
        }
        else
            System.out.println("This is not an Alphabet");
   }
}
