package lesson_25.homework25;

public class Task0mainMethod {
    public static boolean strEndsWithAnotherStr(String str, String subStr)
    {
        if (str == null || subStr == null) {
            System.out.printf("String or substring is NULL or empty:");
            return false;
        }
        int strLength = str.length();
        int subStrLength = subStr.length();
        if (strLength < subStrLength) {
            System.out.printf("String '%s' is shorter than substring '%s', so it cannot end in a substring and result : ", str,subStr);
            return false;
        }
            String endOfStr = str.substring(strLength - subStrLength);
            System.out.printf("Yes ! String '%s' are contains the substring '%s', so result :",str,subStr);
            return endOfStr.equals(subStr);
        }
}
