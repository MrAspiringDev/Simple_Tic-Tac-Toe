import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++) {
           array[i] = scanner.nextInt();
        }
        for (int addition : array) {
            sum += addition;
        }
        System.out.println(sum);

    }
}