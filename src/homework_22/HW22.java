package homework_22;

public class HW22 {
        public static void main(String[] args)
        {
            Father dad = new Father("Микола");
            Son eldestSon = new Son("Євгеній", 1967);
            Son yongerSon = new Son("Степан" , 1974);
            HW22 test = new HW22();
            test.print(dad); //вывод на печать из объекта класса Father
            test.print(eldestSon); //вывод на печать из объекта класса Son
            test.print(yongerSon); //вывод на печать из объекта класса Son
        }н

    // неявный вызов метода вывода на печать
    public static void print(Father dad)
    {
        System.out.println(dad);
    }


}
