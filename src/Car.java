
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

enum Brand {BMW, FORD, VOLVO, HONDA}
enum Color {BLACK, BLUE, RED, ORANGE, GREEN}
public class Car {
    private Brand brand;
    private Color color;
    private String number;
    private Date date;
    private Engine engine;
    private Person owner;
    private double price;

    public Car(Brand brand, Color color, String number, Date date, Engine engine, Person owner, double price) {
        this.brand = brand;
        this.color = color;
        this.number = number;
        this.date = date;
        this.engine = engine;
        this.owner = owner;
        this.price = price;
        
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        return "Car: " + "brand " + brand + ", color " + color + ", price " + price +
                ", number " + number + ", date " + sdf.format(date) + ", engine " + engine + ", owner " + owner ;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Car))
            return false;
        
        Car car = (Car) obj;
//        boolean res1 =this.brand !=null && this.brand.equals(car.getBrand());
//        boolean res2 = this.color != null && this.color.equals(car.getColor());
//        boolean res3 = this.engine != null && this.engine == car.getEngine();
//        boolean res4 = this.date != null && this.date == car.getDate();
        return this.brand != null && this.brand.equals(car.getBrand())
                && this.color != null && this.color.equals(car.getColor())
                && this.engine != null && this.engine.equals(car.getEngine())
                && this.date != null && this.date.equals(car.getDate());
    }
    
}
