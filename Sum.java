
import java.util.Scanner;

public class Sum {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
    

        System.out.print("Give me value of a: ");
        int a= input.nextInt();
        
        System.out.print("Give me value of b: ");
        int b= input.nextInt(); 
        
        int sum = a + b ;  
        System.out.println("The sum of a and b is :   "+sum);


    }
}
