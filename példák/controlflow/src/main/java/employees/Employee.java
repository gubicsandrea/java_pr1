package employees;

public class Employee extends Person {

    private double salary;

    public Employee(String name, String address, double salary) {
        super(name, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(int percent) {
        salary += salary * percent / 100;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + getName() +
                "addess=" + getAddress() +
                "salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if( this.getName() != ((Employee) o).getName()) return false;

        return this.getAddress() == ((Employee) o).getAddress();
    }

    @Override
    public int hashCode() {
        return (getName().length());
    }
}
