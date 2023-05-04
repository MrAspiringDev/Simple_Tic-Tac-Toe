import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt(); //size of an array
        int[] arr = new int[arrSize]; //initializing by the size of standard input (1st line)
        boolean result = false;

        //filling the arr array with the standard input (2nd line)
        for (int i = 0; i < arrSize; i++) {
            arr[i] = scanner.nextInt();
        }
        int num = scanner.nextInt(); // 3rd input line
        for (int j = 0; j < arrSize; j++) {
            if (num == arr[j]) {
                result = true;
                break;
            }
        }
        if (result) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}