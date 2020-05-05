import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        int count = 0;
        int i;

        for (i = 0; i < numberOfBridges; i++) {
            int bridgeHeight = scanner.nextInt();
            count++;
            if (busHeight >= bridgeHeight) {
                System.out.println("Will crash on bridge " + count);
                break;
            }
        }
        if (i == numberOfBridges) {
            System.out.println("Will not crash");
        }

    }
}