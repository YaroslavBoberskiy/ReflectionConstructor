import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * Created by YB on 24.01.2016.
 */
public class ObjectCreator<T> {

    public T initClass(Class<T> c, List<Object> params) {

        T object = null;

        Class[] constParams = new Class[params.size()];
        Object[] constObjects = new Object[params.size()];
        for (int i = 0; i < params.size(); i ++) {
            constParams[i] = params.get(i).getClass();
            constObjects[i] = params.get(i);
            System.out.println(constParams[i]);
        }
        try {
            Constructor<T> constructor = c.getConstructor(constParams);
            object = constructor.newInstance(constObjects);
            return object;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return object;
    }
}


