import java.util.Scanner;

public class Conditions2 {
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);

       System.out.println("Input Surid`s value:  ");
        int  Surid =input.nextInt() ;
        System.out.println("Input Sazid`s value:  ");
        int  Sazid =input.nextInt();
          
        if(Surid==Sazid){  
            System.out.println("Surid is equal to Sazid");
        }
        else{
            if(Surid>Sazid){
            System.out.println("Surid is elder");
        }
        else{
            System.out.println("Surid is younger");
        }
    }
    }
    
}
