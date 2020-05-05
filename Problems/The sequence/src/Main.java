import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int highest = 0;

        
        for (int i = 0; i < limit; i++) {
            int element = scanner.nextInt();
            if(element % 4 == 0 && element > highest) {
                highest = element;
            }
        }
        System.out.println(highest);
    }
}
