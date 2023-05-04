import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //Write a program that reads an array of ints and an integer number n.
        // The program must sum all the array elements greater than n.
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt(); // reading a length
        int[] array = new int[len];  // creating an array with the specified length
        int sum = 0;

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt(); // read the next number of the array
        }
        int n = scanner.nextInt();

        for (int greaterN : array) {
                if(greaterN > n) {
                    sum += greaterN;
                }
        }
        System.out.println(sum);
    }
}