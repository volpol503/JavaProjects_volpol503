package OneFolder.ClassEmployee.Pr_3;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    public Employee(int id2, String surname2, int age2, double salary2, String department2){
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }
    double uvelichenieZarplati() {
        salary *= 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args){
        Employee emp1 = new Employee(1,"Ivanov",25,555,"IT");
        Employee emp2 = new Employee(2,"Petrov", 30,888,"Sales");

        emp1.uvelichenieZarplati();
        System.out.println("Novaya zarplata rabotnika" + emp1.surname + ": " + emp1.salary);
        double newSalary = emp2.uvelichenieZarplati();
        System.out.println("Novaya zarplata robotnika " + emp2.surname + ": " + emp2.salary);
    }
}
















