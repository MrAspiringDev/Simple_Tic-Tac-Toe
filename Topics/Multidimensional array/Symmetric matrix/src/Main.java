import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String result = "YES";
        int[][] array = new int[n][n]; //initializing the array with size n - n*n matrix
        //creating and filling the array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int input = scanner.nextInt();
                array[i][j] = input;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != array[j][i]) {
                    result = "NO";
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
