import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/**
 * Created by YB on 24.01.2016.
 */
public class Demo {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{

        ObjectCreator objectCreator = new ObjectCreator();

        ArrayList<Object> list = new ArrayList<Object>();
        list.add("VIN1");
        list.add(Color.BLACK);
        list.add(23000);

        Car car = (Car) objectCreator.initClass(Car.class, list);

        System.out.println(car.getVIN());
        System.out.println(car.getColor());
        System.out.println(car.getPrice());
    }

}
