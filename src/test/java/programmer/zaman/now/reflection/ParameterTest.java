package programmer.zaman.now.reflection;

import org.junit.jupiter.api.Test;
import programmer.zaman.now.reflection.data.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ParameterTest {
    @Test
    void testGetParameters() {
        Class<Person> personClass = Person.class;
        Method[] methods = personClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("Paramater name : " + parameter.getName());
                System.out.println("Paramater type : " + parameter.getType());
            }
            System.out.println("=============");
        }
    }

    @Test
    void testInvokeMethodWithParameter() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Method setFirstName = personClass.getDeclaredMethod("setFirstName", String.class);

        Person person = new Person("Dede", "Irwanto");
        setFirstName.invoke(person, "Joko");
        System.out.println(person.getFirstName());
    }
}
