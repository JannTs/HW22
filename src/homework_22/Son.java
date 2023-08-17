package homework_22;

  class Son extends Father
  {
     private int yearOfBirth;
     public Son(String name, int yearOfBirth)
     {
        super(name);
        this.yearOfBirth = yearOfBirth;
     }
     public String toString()
     {
        return super.toString() + " " + yearOfBirth;
     }
  }



