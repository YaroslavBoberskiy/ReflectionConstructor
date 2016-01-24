import java.awt.*;

/**
 * Created by YB on 24.01.2016.
 */
public class Car {

    private String VIN;
    private Color color;
    private Integer price;

    public Car(String VIN) {
        this.VIN = VIN;
    }

    public Car(String VIN, Color color) {
        this.VIN = VIN;
        this.color = color;
    }

    public Car(String VIN, Integer price) {
        this.VIN = VIN;
        this.price = price;
    }

    public Car(String VIN, Color color, Integer price) {
        this.VIN = VIN;
        this.color = color;
        this.price = price;
    }

    public String getVIN() {
        return VIN;
    }

    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
}
