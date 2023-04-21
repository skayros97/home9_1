import java.util.*;
class Words
{
    String str;
    public Words(String s)
    {
        this.str = s;
    }
    public void check(){
        String[] Words = str.split("\\s+");
        String maxWord= Words[0];
        String minWord= Words[0];
        for (int i=0;i<Words.length;i++) {
            if (Words[i].length() <  minWord.length()) {
                minWord = Words[i];
            }
        }
        for (int i=0;i<Words.length;i++) {
            if (Words[i].length() >  maxWord.length()) {
                maxWord = Words[i];
            }
        }
        System.out.println("Shortest word: " + minWord);
        System.out.println("Longest word: " + maxWord);
    }
}

public class task2
{
    public static void main(String[] args)
    {
        Words text = new Words("Negus of Ephiopia");
        text.check();
    }
}