import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long oldNumber = scanner.nextInt();
        long newNumber = scanner.nextInt();
        boolean isAscending = true;
        boolean isOrdered = true;

        if (newNumber == 0) {
            System.out.println(true);
        } else {
            if (newNumber < oldNumber) {
                isAscending = false;
            }
            while (scanner.hasNext()) {
                oldNumber = newNumber;
                newNumber = scanner.nextInt();

                if (newNumber == 0) {
                    System.out.println(isOrdered);
                    break;
                } else {
                    if (newNumber > oldNumber && !isAscending || oldNumber > newNumber && isAscending) {
                        isOrdered = false;
                    }
                }
            }
        }
    }
}