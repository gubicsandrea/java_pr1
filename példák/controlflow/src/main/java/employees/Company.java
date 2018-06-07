package employees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Company {
    private static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        employees.add(new Employee("Icuka", "Vác", 1000));
        employees.add(new Boss("Feri", "Némedi", 2000.0, 10));
        employees.add(new BigBoss("Gergő", "Budapest", 3000.0, 14, 500));
//        Collections.sort(employees);
//        System.out.println(employees);
//
//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getAddress().compareTo(o2.getAddress());
//            }
//        });
//
//        System.out.println(employees);
//
//        Collections.sort(employees, new EmployeeComparator());
//
//        System.out.println(employees);

        for (CanWork employee: employees){
            employee.work();
        }

        for(Comparable<Employee> c : employees){

        }



//        Person person = new Employee("Icuka", "Vác", 1000);
//        Person boss = new Boss("Feri", "Budapest", 2000.0, 10);
//        boss = new Employee("Gergő", "Vásárosnamény", 1400.0);
//        if(boss instanceof Boss) {
//            int num = ((Boss) boss).getNumberOfEmployees();
//            System.out.println(num);
//        }
//        Employee employee = new Boss("Feri", "Budapest", 2000.0, 10);
//        print(employee);
//        System.out.println(boss.equals(employee));
    }

    public static void print(Employee employee){
        System.out.println(employee);
    }
}
