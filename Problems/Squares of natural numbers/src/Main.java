import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 1;
        int multiply = 1;

        while (number >= multiply) {
            System.out.println(multiply);
            count++;
            multiply = count * count;
        }
    }
}
