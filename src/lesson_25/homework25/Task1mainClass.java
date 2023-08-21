package lesson_25.homework25;

public class Task1mainClass {
    public static char[] createsCharArray(String s) {
        if (s == null) {
            return null; // ? null
        }
        char[] chArr = new char[s.length()]; // cоздаем нужной длины
        for (int i = 0; i < s.length(); i++) {
            chArr[i] = s.charAt(i); // заполняем
        }
        return chArr;  //возввращаем
    }

}

