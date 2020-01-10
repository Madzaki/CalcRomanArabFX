package sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternClass {     //Оценка пользовательского ввода

    public static boolean isPat;
    public static boolean isArab;
    public static boolean isRoman;

    static void isExp (String input) {
        Pattern patExp = Pattern.compile("(\\d+|[IVXLCD]+)(\\s[\\*/\\+-]\\s)(\\d+|[IVXLCD]+)"); //Шаблон выражения
        Matcher mExp = patExp.matcher(input);
        isPat = mExp.matches();    //Соответсвует или нет выражение шаблону?
        Pattern patArab = Pattern.compile("(\\d+\\s)([\\*/\\+-])(\\s\\d+)"); //Шаблон для определения ввода арабских чисел
        Matcher mArab = patArab.matcher(input);
        isArab = mArab.matches();   //Есть ли в выражение арабские числа?
        Pattern patRoman = Pattern.compile("([IVXLCD]+\\s)([\\*/\\+-])(\\s[IVXLCD]+)"); //Шаблон для определения ввода римских чисел
        Matcher mRoman = patRoman.matcher(input);
        isRoman = mRoman.matches(); //Есть ли в выражение римские числа?
        if (!isPat) {
            /*Проверка введенного выражения на соответствие шаблону*/
            AlertClass.showAlert("\nThe expression '" + input + "' doesn't match the pattern.");
            throw new ArithmeticException("\nThe expression '" + input + "' doesn't match the pattern.");
        } else if (isArab == isRoman) {
            /*Проверка введенного выражения на принадлежность чисел к арабским или римским*/
            AlertClass.showAlert("\nThe expression '" + input + "' has different numerals.");
            throw new ArithmeticException("\nThe expression '" + input + "' has different numerals.");
        }
    }
}