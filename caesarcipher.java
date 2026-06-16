import java.util.Scanner;

public class CaesarCipher {

    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {

            if (Character.isUpperCase(ch)) {
                char encrypted = (char) ((ch - 'A' + shift) % 26 + 'A');
                result.append(encrypted);
            }

            else if (Character.isLowerCase(ch)) {
                char encrypted = (char) ((ch - 'a' + shift) % 26 + 'a');
                result.append(encrypted);
            }

            else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Caesar Cipher Program =====");

        System.out.print("Enter Message: ");
        String message = sc.nextLine();

        System.out.print("Enter Shift Value: ");
        int shift = sc.nextInt();

        String encrypted = encrypt(message, shift);
        System.out.println("\nEncrypted Text: " + encrypted);

        String decrypted = decrypt(encrypted, shift);
        System.out.println("Decrypted Text: " + decrypted);

        sc.close();
    }
}
