package volodko.vyacheslav.ukr.net;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class MainSaver {

    public static void main(String[] args) {
        TextConteiner ct = new TextConteiner();
        Class<?> cl = ct.getClass();

        SaveTo saveTo = cl.getAnnotation(SaveTo.class);
        String path = saveTo.path();
        Method[] methods = cl.getDeclaredMethods();
        try {
            for (Method meth : methods) {
                if (meth.isAnnotationPresent(Saver.class)) {
                    meth.invoke(ct, path);
                }
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();

        }
        System.out.println("Well");
    }
}

