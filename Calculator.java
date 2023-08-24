import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Input the value of a: ");
      int a= input.nextInt();
      
      System.out.print("Input the value of b: ");
      int b= input.nextInt(); 

      System.out.print("Press the button");  
      int button =input.nextInt();
      
     
      switch(button){
        case 1 : System.out.println("Addition:"+(a+b));
        break;
      
        case 2 : System.out.println("Subtraction:"+(a-b));
        break;
        
        case 3 : System.out.println("Multiplication:"+(a*b));
        break;

        case 4 : System.out.println("Division"+(a/b));
        break;

        case 5 : System.out.println("reminder:"+(a%b));
        break;



          
      }
    }
    
}
