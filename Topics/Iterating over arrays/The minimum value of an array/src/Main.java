import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int minimum = array[0];
        for (int i = 1; i < size; i++) {
            minimum = Math.min(minimum, array[i]);
        }
        System.out.println(minimum);

    }
}