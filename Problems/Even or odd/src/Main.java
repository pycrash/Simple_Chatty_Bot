import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int element;
        do {
            element = scanner.nextInt();
            if (element % 2 == 0) {
                if (element == 0) {
                    break;
                } else {
                System.out.println("even");
                }
            } else {
                System.out.println("odd");
            }
        } while (element != 0);
    }
}