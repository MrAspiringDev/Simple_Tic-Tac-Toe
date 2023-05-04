import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine().toLowerCase();
        String[] sentenceParts = sentence.split("");
        boolean doesNotContain = !sentence.contains("the");
        for (int i = 0; i < sentenceParts.length; i++) {
            if (sentenceParts[i].equals("t") && sentenceParts[i + 1].equals("h")) {
                System.out.println(i);
                break;
            }
        }
        if (doesNotContain) {
            System.out.println(-1);
        }



    }
}