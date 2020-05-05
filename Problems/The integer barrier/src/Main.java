import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int element;
        int sum = 0;
        while (scanner.hasNext()) {
            element = scanner.nextInt();
            if (element == 0) {
                break;
            } else {
                if (sum < 1000) {
                    sum += element;
                }
            }
        }
        if (sum >= 1000) {
            sum = sum - 1000;
        }
        System.out.println(sum);
    }
}