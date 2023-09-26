import java.util.Scanner;

public class BeverageSelector {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("(1) Water, (2) Coke, (3) Coffee");
        String num = s.next();

        if(num.equals("1")) {
            System.out.println("Water");
        } else if(num.equals("2")) {
            System.out.println("Coke");
        } else if(num.equals("3")){
            System.out.println("Coffee");
        }
    }
}
