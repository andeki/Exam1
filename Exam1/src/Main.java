import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //uses TenMaker
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        boolean isTen = TenMaker.TenMaker(a, b);
        if(isTen) {
            System.out.println("The numbers add up to 10.");
        } else {
            System.out.println("The numbers do not add up to 10.");
        }
    }
}