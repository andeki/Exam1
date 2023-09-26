import java.util.Scanner;

public class Summer {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double sum = 0;
        double addedNumber = s.nextDouble();
        while (addedNumber != 0) {
            sum += addedNumber;
            addedNumber = s.nextDouble();
        }
        System.out.println(sum);
    }
}
