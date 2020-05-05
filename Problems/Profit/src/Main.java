import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextInt();
        double p = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0;

        while (m < k) {
            m += (m * p) / 100;
            count++;
        }
        System.out.println(count);
    }
}