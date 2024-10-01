import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        int length = word.length();

        for (int i = 0; i < length; i++) {
            for (int j = length - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j) + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}