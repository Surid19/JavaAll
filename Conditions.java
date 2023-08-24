import java.util.Scanner;


public class Conditions {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if(age>18){
            System.out.println("Adlut");
        }
        else {
            System.out.println("Not Adult");
        }
    }
    
}
