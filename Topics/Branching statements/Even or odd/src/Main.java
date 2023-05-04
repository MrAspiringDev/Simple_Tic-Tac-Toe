import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        while (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            } else if (input % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}