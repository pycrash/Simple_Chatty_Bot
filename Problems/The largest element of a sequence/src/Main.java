import  java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int largest = 0;
        int element;

        do {
            element = scanner.nextInt();

            if (element > largest){
                largest = element;
            }
        } while (element != 0);

        System.out.println(largest);
    }
}