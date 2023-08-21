package lesson_25.homework25;

public class HW25 {
    public static void main(String[] args) {
        String str = "I love Java";
        String subStr = "Java";
        System.out.println(Task0mainMethod.strEndsWithAnotherStr(str, subStr)); // Вывод: true

        String strA = "Java";
        String subStrA = "I love Java";

        System.out.println(Task0mainMethod.strEndsWithAnotherStr(strA, subStrA)); // Вывод: false

        String strB = "";
        String subStrB = null;

        System.out.println(Task0mainMethod.strEndsWithAnotherStr(strB, subStrB)); // Вывод: false


    }

    }


