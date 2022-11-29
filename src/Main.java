
public class Main {

  public static void findAllPayments(Employee[] employees) {
    int sum = 0;
    for (int i = 0; i < employees.length -1; i++) {
      sum += employees[i].getPayment();

    }
    System.out.println();
    System.out.println("Сумма зарплат всех сотрудников на месяц: " + sum);
    System.out.println("Среднее значение зарплат: " + sum / employees.length );
  }

  public static void findMinPay (Employee[] employees) {
    int min = (employees[0].getPayment());
    Employee minimum = employees[0];
    for (int i = 0; i < employees.length; i++) {
      if (min > employees[i].getPayment()) {
        min = employees[i].getPayment();
        minimum = employees[i];
      }
    }
    System.out.println("Сотрудник с самой низкой зарплатой: ");
    System.out.println(minimum);

  }

  public static void findMaxPay (Employee[] employees) {
    int max = (employees[0].getPayment());
    Employee maximum = employees[0];
    for (int i = 0; i < employees.length; i++) {
      if (max < employees[i].getPayment()) {
        max = employees[i].getPayment();
        maximum= employees[i];
      }
    }
    System.out.println("Сотрудник с самой высокой зарплатой: ");
    System.out.println(maximum);
  }

  public static void findAllEmployees (Employee[] employees) {
    System.out.println();
    System.out.println("Список всех сотрудников: " );
    for (int i = 0; i < employees.length; i++) {
      System.out.println(employees[i].getLastName() + " " + employees[i].getFirstName()
      + " " + employees[i].getSecondName() + ".");

    }
  }


  public static void main(String[] args) {
    Employee[] employees = new Employee[10];
    employees[0] = new Employee("Иванов", "Иван", "Иванович", 1, 150000);
    employees[1] = new Employee("Сидоров", "Сергей", "Юрьевич", 2, 90000);
    employees[2] = new Employee("Смирнов", "Павел", "Сергеевич", 3, 110000);
    employees[3] = new Employee("Шишкин", "Юрий", "Васильевич", 4, 65000);
    employees[4] = new Employee("Смольный", "Виктор", "Федорович", 5, 120000);
    employees[5] = new Employee("Сыроежкин", "Игорь", "Викторович", 4, 35000);
    employees[6] = new Employee("Мироненко", "Станислав", "Евгеньевич", 3, 140000);
    employees[7] = new Employee("Лапин", "Валерий", "Сергеевич", 2, 30000);
    employees[8] = new Employee("Солонько", "Александр", "Иванович", 1, 200000);
    employees[9] = new Employee("Семин", "Павел", "Юрьевич", 1, 110000);

    for (int i = 0; i < employees.length; i++) {
      System.out.println(employees[i]);
    }
     findAllPayments(employees);
     findMinPay(employees);
     findMaxPay(employees);
     findAllEmployees(employees);

  }

}