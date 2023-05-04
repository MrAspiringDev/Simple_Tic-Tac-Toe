import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        boolean willCrash = false;
        int crashedBridgeNumber = -1;
        int hOfBus = scanner.nextInt();
        int n = scanner.nextInt();
        int[] hOfBridges = new int[n];

        while (scanner.hasNextInt()) {
            for (int i = 0; i < n; i++) {
                int element = scanner.nextInt();
                hOfBridges[i] = element;
            }
            for (int i = 0; i < n && !willCrash; i++) {
                if (hOfBus >= hOfBridges[i]) {
                    willCrash = true;
                    crashedBridgeNumber = i + 1;
                }
            }
        }

        if (willCrash) {
            System.out.println("Will crash on bridge " + crashedBridgeNumber);
        } else {
            System.out.println("Will not crash");
        }
    }
}