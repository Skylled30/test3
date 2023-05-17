public class Client extends Person {

    int money;
    String wishes;

    public Client(String name, String surname, int age, int money, String wishes) {
        super(name, surname, age);
        this.money = money;
        this.wishes = wishes;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getWishes() {
        return wishes;
    }

    public void setWishes(String wishes) {
        this.wishes = wishes;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age=" + getAge() +
                ", money=" + money +
                ", wishes='" + wishes + '\'' +
                '}';
    }

    @Override
    public String about() {
        return "Я - клиент";
    }
}
