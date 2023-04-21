import java.util.Scanner;
import java.lang.String;

class Word{
    static String text;

    public Word(String s)
    {
        this.text=s;
    }

    public void findWordWithMinimumUniqueChars() {
        String[] words = text.split("\\s+");
        int minUniqueChars =10000;
        String result = "";
        for (String word : words)
        {
            boolean[] chars = new boolean[128];
            int uniqueChars = 0;
            for (char c : word.toCharArray()) {
                int index = (int) c;
                if (!chars[index]) {
                    chars[index] = true;
                    uniqueChars++;
                }
            }
            if (uniqueChars < minUniqueChars) {
                minUniqueChars = uniqueChars;
                result = word;
            }
        }
        System.out.println("Самое уникальное слово: "+result);
    }

}
public class task3 {
    public static void main(String[] args)
    {
        Word txt= new Word("Negus aaaaaaa odfdfd");
        txt.findWordWithMinimumUniqueChars();
    }
}
