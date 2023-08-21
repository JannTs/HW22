package lesson_25.homework25;

public class Task2mainClass {
    private static String s;
    private static char lastChar = '\0';

    public static String removeDuplicateChars(String s) {
        if (s == null || s.isEmpty()) {
            return s; // пустую строку или null, возвращаем в исходном виде
        }
        StringBuilder builder = new StringBuilder(); // готовим построение новой строки
        for (char c : s.toCharArray()) {
            if (builder.indexOf(String.valueOf(c)) == -1) { // проверка на отсутствие в builder
                builder.append(c); //добавляем символ в построение, если его ещё там нет
            }
        }
        return builder.toString();
    }

    /* ПЕРЕГРУЖЕННЫЙ МЕТОД
    * удаляет "дребезг" (debounсе) - исключает последовательные дублированные символы,
    * но сохраняет следующее включение символа после отличного от предыдущего.
    * */
    public static String removeDuplicateChars(String s, boolean debounce) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        StringBuilder builder = new StringBuilder(); // готовим построение новой строки
        if (!debounce == true) {
            removeDuplicateChars(s);
        }
        for (char c : s.toCharArray()) {
            if (c != lastChar) {
                builder.append(c); // добавляем символ, если он отличается от предыдущего
                lastChar = c; // Обновляем последний символ
            }
        }
        return builder.toString();
    }
}


