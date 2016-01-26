import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;

public class ObjectCreatorTests {

    Object object;

    @Before
    public void testSetup() {
        ObjectCreator objectCreator = new ObjectCreator();
        ArrayList<Object> list = new ArrayList<Object>();
        list.add("VIN1");
        list.add(Color.BLACK);
        list.add(23000);
        object = objectCreator.initClass(Car.class, list);
    }

    @Test
    public void testTypesExpected() {
        assertTrue(object instanceof Car);
    }

    @Test
    public void testConstructorParametersSet() {
        String [] constructorExpectedParams = {"String", "Color", "Integer"};
        ArrayList<String> constructorRealParams = new ArrayList<String>();
        boolean isConstructorMatched = false;
        Constructor[] constructors = object.getClass().getConstructors();
        for (Constructor c : constructors) {
            Parameter[] realParam = c.getParameters();
            for (Parameter p : realParam) {
                constructorRealParams.add(p.getType().getSimpleName());
            }
            if (Arrays.equals(constructorRealParams.toArray(), constructorExpectedParams)) {
                isConstructorMatched = true;
            }
            constructorRealParams.clear();
        }
        assertTrue(isConstructorMatched);
    }
}

