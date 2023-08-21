package lesson_25.homework25;
import java.util.Arrays;
import static lesson_25.homework25.Task0mainClass.strEndsWithAnotherStr;
import static lesson_25.homework25.Task1mainClass.createsCharArray;
import static lesson_25.homework25.Task2mainClass.removeDuplicateChars;
public class HW25 {


    public static void main(String[] args) {

        /**
         * Задача 1
         * Написать метод, проверяющий заканчивается ли строка содержимым другой строки.
         * public boolean strEndsWithAnotherStr ( String str1, str2)
         * @param args
         *
         * Task0mainClass.strEndsWithAnotherStr(String str, String subStr)
         */

        System.out.println("+++++++++++TASK 1+++++++++++++++");
        String str = "I love Java";
        String subStr = "Java";
        System.out.println(strEndsWithAnotherStr(str, subStr)); // Вывод: true

        String strA = "Java";
        String subStrA = "I love Java";

        System.out.println(strEndsWithAnotherStr(strA, subStrA)); // Вывод: false

        String strB = "";
        String subStrB = null;

        System.out.println(strEndsWithAnotherStr(strB, subStrB)); // Вывод: false


        /**
         *
         * Задача2
         * Написать метод, создающий массив символов из содержимого строки
         * public char[] createsCharArray( String str)
         *
         * Task1mainClass.createsCharArray(str)
         *
         */

        System.out.println("+++++++++++TASK 2+++++++++++++++");
        char[] charArray = createsCharArray(str);
        System.out.printf("Вывод на печать массива в цикле поэлементно : %n");
        for (char c : charArray) {
            System.out.print(c); // Вывод массива в цикле поэлементно
        }
        System.out.printf("%n====================================%n");
        char[] ch = str.toCharArray();
        System.out.printf("Вывод на печать массива как результат встроенного метода .toCharArray()%nпри помощи 'стандартного' Arrays.toString(ch): %s%n", Arrays.toString(ch));


        /**
         *
         * Задача3*
         *
         * Написать метод, удаляющий из строки повторяющиеся символы
         * String removeDuplicateChars( String string)
         * пример: "abbccccaadb" -> "abcd"
         *
         */
        System.out.println("+++++++++++ TASK 3 +++++++++++++++");
/**
 * этот метод сохраняет только первое вхождение символа в строке по порядку
 * и удаляет все последующие вхождения повторяющихся символов.
 */
        String input = "abbccccaadb";
        System.out.printf("Input string : %s%n", input );
        System.out.println(removeDuplicateChars(input));

        String input1 = "АББА";
        System.out.printf("Input string : %s%n", input1 );
        System.out.println(removeDuplicateChars(input1));

/**
 * ПЕРЕГРУЖЕННЫЙ МЕТОД
 * удаляет "дребезг" (debounсе) - исключает последовательные дублированные символы,
 * но сохраняет следующее включение символа после отличного от предыдущего.
 * */
        System.out.println("+++++++++++ TASK 3 (debounce) +++++++++++++++");

        String input3 = "abbccccaadb";
        System.out.printf("Input string : %s%n", input3 );
        System.out.println(removeDuplicateChars(input3,true));

        String input4 = "АББА";
        System.out.printf("Input string : %s%n", input4 );
        System.out.println(removeDuplicateChars(input4,true));

    }
}


