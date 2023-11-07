package programmer.zaman.now.reflection;

import org.junit.jupiter.api.Test;
import programmer.zaman.now.reflection.data.Person;

import java.lang.reflect.Field;

public class FieldTest {
    @Test
    void testGetField() {
        Class<Person> personClass = Person.class;

        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " : " + field.getType().getName());
        }
    }

    @Test
    void testGetFieldValue() throws NoSuchFieldException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Field firstName = personClass.getDeclaredField("firstName");
        firstName.setAccessible(true);

        Person person1 = new Person("Dede", "Irwanto");

        String result = (String) firstName.get(person1);
        System.out.println(result);

        Person person2 = new Person("Budi", "Gunawan");

        String result2 = (String) firstName.get(person2);
        System.out.println(result2);
    }

    @Test
    void testSetFieldValue() throws NoSuchFieldException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Field firstName = personClass.getDeclaredField("firstName");
        firstName.setAccessible(true);

        Person person1 = new Person("Dede", "Irwanto");
        firstName.set(person1, "Joko"); // person1.setFirstName("Joko")
        System.out.println(person1.getFirstName());

        Person person2 = new Person("Budi", "Gunawan");
        firstName.set(person2, "Tono"); /* person2.setFirstName("Tono") */
        System.out.println(person2.getFirstName());
    }
}
