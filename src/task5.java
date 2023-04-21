import java.util.Scanner;
import java.lang.String;
public class task5 {
    public static void duplicateLetters(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            sb.append(c).append(c);
        }
        System.out.println("Новое слово: "+ sb.toString());
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = scanner.next();
        duplicateLetters(word);
    }
}
