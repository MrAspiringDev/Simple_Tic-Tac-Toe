import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input) {
            case 1 -> System.out.println("You have chosen a square");
            case 2 -> System.out.println("You have chosen a circle");
            case 3 -> System.out.println("You have chosen a triangle");
            case 4 -> System.out.println("You have chosen a rhombus");
            default -> System.out.println("There is no such shape!");
        }
    }
}