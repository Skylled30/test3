public class Employee extends Person {

    String position;
    int salary;

    public Employee(String name, String surname, int age, String position, int salary) {
        super(name, surname, age);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String about() {
        return "Я - работник";
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age=" + getAge() +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
