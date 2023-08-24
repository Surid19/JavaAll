import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner bk = new Scanner(System.in);
        String radius = bk.next();

        Scanner gk = new Scanner(System.in);
        String pie = gk.next();

        String Area = (pie*radius) ;
        System.out.println(Area);
    }
    
}
