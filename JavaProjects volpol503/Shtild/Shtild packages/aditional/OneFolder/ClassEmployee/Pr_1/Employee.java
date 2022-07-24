package OneFolder.ClassEmployee.Pr_1;

public class Employee {
    int id;
    int age;
    double salary;
    String surname;
    String department;

    Employee(int id2, String surname2, int age2) {
        this(surname2, age2);
        id = id2;
    }

    Employee(String surname3, int age3) {
        surname = surname3;
        age = age3;
    }

    Employee(int id4, String surname4, int age4, double salary4, String department4) {
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }
}


class EmployeeTest{
    public static void main(String[] args) {

        Employee emp1 = new Employee(1,"Ivanov",25);
        System.out.println(emp1.surname);
        System.out.println(emp1.department);
        Employee emp2 = new Employee("Petrov", 30);
        System.out.println(emp2.department);
        Employee emp3 = new Employee(2,"Sidorov",40,200,"IT");
        System.out.println(emp3.department);
    }
}
