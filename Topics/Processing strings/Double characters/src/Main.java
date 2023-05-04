import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String[] wordParts = word.split("");

        for (String doubled : wordParts) {
            System.out.print(doubled + doubled);
        }
    }
}