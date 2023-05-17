import java.util.Comparator;

public class Person  {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void talk(){
        System.out.println("Человек начал общаться с кем-то");
    }

    public void call(String name){
        System.out.println("Человек набирает контакту " + name);
    }

    public String about(){
        return "Я - человек";
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
