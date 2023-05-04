import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String inputDate = scanner.next();
        String[] arr = inputDate.split("-");
        System.out.println(arr[1] + "/" + arr[2] + "/" + arr[0]);
    }
}