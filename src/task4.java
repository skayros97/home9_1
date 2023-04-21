import java.util.Scanner;
import java.lang.String;
public class task4 {
    private static boolean isPalindrome(String word) {
        String reversedWord = new StringBuilder(word).reverse().toString();
        return word.equals(reversedWord);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();
        System.out.println("Введите слово для проверки:");
        String wordToCheck = scanner.nextLine();
        if (isPalindrome(wordToCheck)==true) {
            System.out.println(wordToCheck + " является палиндромом в данной строке.");
        } else {
            System.out.println(wordToCheck + " не является палиндромом в данной строке.");
        }
    }
}
