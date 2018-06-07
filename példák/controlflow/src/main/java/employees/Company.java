package employees;

public class Company {

    public static void main(String[] args) {
        Person person = new Employee("Icuka", "Vác", 1000);
        Person boss = new Boss("Feri", "Budapest", 2000.0, 10);
        boss = new Employee("Gergő", "Vásárosnamény", 1400.0);
        if(boss instanceof Boss) {
            int num = ((Boss) boss).getNumberOfEmployees();
            System.out.println(num);
        }
        Employee employee = new Boss("Feri", "Budapest", 2000.0, 10);
        print(employee);
        System.out.println(boss.equals(employee));
    }

    public static void print(Employee employee){
        System.out.println(employee);
    }
}
