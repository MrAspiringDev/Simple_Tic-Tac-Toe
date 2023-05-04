import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arrLength = scanner.nextInt();
        int[] arr = new int[arrLength]; //initializing array with the input length
        for (int i = 0; i < arrLength; i++) {
            arr[i] = scanner.nextInt(); //filling the array with the input numbers
        }
        int n = scanner.nextInt(); // the number we need to check in array
        int counter = 0;

        for (int temp : arr) {
            if (temp == n) {
                counter++;
            }
        }
        System.out.println(counter);

    }
}