public class Employee {
  private   String lastName;
   private String firstName;
  private   String secondName;
  private   int department;
   private  int  payment;

    private static int id =0;

    public static int count () {
        return id++;
    }

    public Employee(String lastName, String firstName, String secondName, int department, int payment) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.department = department;
        this.payment = payment;
    }

    public static int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getDepartment() {
        return department;
    }

    public int getPayment() {
        return payment;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return id + "." +
                " Фамилия: " + lastName + "." +
                " Имя: " + firstName + "." +
                " Отчество: '" + secondName + "." +
                " Номер отдела: " + department + "." +
                " Заработная плата: " + payment + ".";
    }


}
