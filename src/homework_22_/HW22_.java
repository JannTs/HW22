package homework_22_;
public class HW22_ {
        public static void main(String[] args)
        {
            Person Doc = new Person("Doctor Pepper");
            Patient Patient1 = new Patient("Evgeni", 1967);
            Patient Patient2 = new Patient("Stepan" , 1974);
            HW22_ myClinic = new HW22_(); // новый экземпляр класса HW22_
            myClinic.print(Doc); //вывод на печать из обекта класса Person (former Father)
            myClinic.print(Patient1); //вывод на печать из обекта класса Patient (former Son)
            myClinic.print(Patient2); //вывод на печать из обьекта класса Patient (former Son)
        }
    // неявный вызов метода вывода на печать
    public static void print(Person obj)
    {
        System.out.println(obj);
    }
}
