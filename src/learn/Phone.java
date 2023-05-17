package learn;

public class Phone {

    private String company;
    private String model;
    private String color;
    private double price;

    public Phone(String company, String model, String color, double price) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public String getCompany(){
        return company;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
