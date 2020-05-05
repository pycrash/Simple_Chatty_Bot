import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        do{
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);
        System.out.println(sum);
    }
}