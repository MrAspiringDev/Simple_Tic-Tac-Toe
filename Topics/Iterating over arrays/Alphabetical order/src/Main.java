import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean order = false;
        String word = scanner.nextLine().toLowerCase();
        String[] wordParts = word.split(" "); //turning the string word into array

        for (int i = 0; i < wordParts.length - 1; i++) {
            if (wordParts[i].compareTo(wordParts[i + 1]) > 0) {
                order = false;
            } else if (wordParts[i].compareTo(wordParts[i + 1]) == 0) {
                order = true;
            } else {
                order = true;
            }
        }
        System.out.println(order);



    }
}