import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int sum1to3 = input.charAt(0) + input.charAt(1) + input.charAt(2);
        int sum4to6 = input.charAt(3) + input.charAt(4) + input.charAt(5);

        if (sum1to3 == sum4to6) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }

    }
}