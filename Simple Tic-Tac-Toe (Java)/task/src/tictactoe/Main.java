package tictactoe;

import java.util.Scanner;

public class Main {
    public static void printField(char[][] field) {
        System.out.println("---------");
        for (int i = 0; i < 3; ++i) {
            System.out.print("| ");
            for (int j = 0; j < 3; ++j) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }
    public static boolean checkWin(char[][] field, char player) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (field[i][0] == player && field[i][1] == player && field[i][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (field[0][j] == player && field[1][j] == player && field[2][j] == player) {
                return true;
            }
        }

        // Check diagonals
        if (field[0][0] == player && field[1][1] == player && field[2][2] == player) {
            return true;
        }
        return field[0][2] == player && field[1][1] == player && field[2][0] == player;

        // No win
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] field = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = ' ';
            }
        }
        printField(field);
        char currentPlayer = 'X';
        boolean gameEnded = false;
        int movesLeft = 9;

        while (!gameEnded) {
            System.out.println("Enter the coordinates: ");
            int x1, x2;
            try {
                x1 = scanner.nextInt();
                x2 = scanner.nextInt();
                if (x1 < 1 || x1 > 3 || x2 < 1 || x2 > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                } else {
                    if (field[x1 - 1][x2 - 1] != ' ') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else {
                        field[x1 - 1][x2 - 1] = currentPlayer;
                        printField(field);
                        movesLeft--;
                        // Check if game has ended
                        gameEnded = checkWin(field, currentPlayer) || movesLeft == 0;
                        if (!gameEnded) {
                            currentPlayer = currentPlayer == 'X' ? 'O' : 'X';
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("You should enter numbers!");
                scanner.nextLine();
            }
        }

        if (checkWin(field, 'X')) {
            System.out.println("X wins");
        } else if (checkWin(field, 'O')) {
            System.out.println("O wins");
        } else {
            System.out.println("Draw");
        }
    }
}
