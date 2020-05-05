import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        long number = scanner.nextLong();
        long i = 1;
        long count = 1;

        while(number >= i){
            count++;
            i = i * count;

        }
        System.out.println(count);
    }
}