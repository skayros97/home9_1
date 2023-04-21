import java.util.Scanner;
import java.lang.String;
class Doc
{
    static String DocNum;
    public Doc(String dc)
    {
        this.DocNum=dc;
    }
    public void printFullDocument()
    {
        System.out.println("Полный номер документа: "+DocNum);
    }
    public void printFirstTwoBlocks()
    {
        String[] blocks = DocNum.split("-");
        System.out.println(blocks[0] + "-" + blocks[2]);
    }
    public void maskDocumentNumber()
    {
        String[] blocks = DocNum.split("-");
        System.out.println(blocks[0] + "-" + "***" + "-" + blocks[2] + "-" + "***" + "-" + blocks[4]);
    }
    public void printLettersInLowerCase()
    {
        String letters = DocNum.replaceAll("[^A-Za-z]", "");
        StringBuilder sb = new StringBuilder("Буквы (нижний регистр):");
        for (int i = 0; i < letters.length(); i++) {
            if (i == 3 || i == 6) {
                sb.append("/");
            }
            sb.append(Character.toLowerCase(letters.charAt(i)));
        }
        System.out.println(sb.toString());
    }
    public void printLettersInUpperCase() {
        String letters = DocNum.replaceAll("[^A-Za-z]", "");
        StringBuilder sb = new StringBuilder("Буквы (верхний регистр):");
        for (int i = 0; i < letters.length(); i++) {
            if (i == 3 || i == 6) {
                sb.append("/");
            }
            sb.append(Character.toUpperCase(letters.charAt(i)));
        }
        System.out.println(sb.toString());
    }

    public void containsAbc() {
        if(DocNum.toLowerCase().contains("abc"))
        {
            System.out.println("Содержит ABC/abc!");
        }
        else if(DocNum.toUpperCase().contains("ABC"))
        {
            System.out.println("Содержит ABC/abc!");
        }
        else
        {
            System.out.println("Не содержит!");
        }
    }
    public void startsWith555() {
        if(DocNum.startsWith("555"))
        {
            System.out.println("Начинается с 555!");
        }
        else
        {
            System.out.println("Не начинается с 555!");
        }
    }
    public void endsWith1a2b() {
        if( DocNum.endsWith("1a2b"))
        {
            System.out.println("Заканчивается на 1a2b!");
        }
        else
        {
            System.out.println("Не заканчивается на 1a2b!");
        }
    }
}
public class Main {
    public static void main(String[] args)
    {
        Doc doc1= new Doc("1234-ABC-5678-DEF-9G0H");
        doc1.printFullDocument();
        doc1.printFirstTwoBlocks();
        doc1.maskDocumentNumber();
        doc1.printLettersInLowerCase();
        doc1.printLettersInUpperCase();
        doc1.containsAbc();
        doc1.startsWith555();
        doc1.endsWith1a2b();
    }
}