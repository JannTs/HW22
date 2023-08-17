package homework_22_;

class Patient extends Person
  {
     private int yearOfBirth;
     public Patient(String name, int yearOfBirth)
     {
        super(name);
        this.yearOfBirth = yearOfBirth;
     }
     public String toString()
     {
        return super.toString() + " " + yearOfBirth;
     }
  }



