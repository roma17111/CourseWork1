public class Main {
    public static void main(String[] args) {
      Employee[] employees = new Employee[10];
      employees[0] = new Employee("Иванов", "Иван" , "Иванович", 1, 150000);
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
          Employee.count();
          System.out.println(employees[i]);

        }

    }
}