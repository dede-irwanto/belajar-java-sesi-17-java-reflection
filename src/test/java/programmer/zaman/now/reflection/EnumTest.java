package programmer.zaman.now.reflection;

import org.junit.jupiter.api.Test;
import programmer.zaman.now.reflection.data.Gender;

import java.util.Arrays;

public class EnumTest {
    @Test
    void testEnum() {
        Class<Gender> genderClass = Gender.class;

        System.out.println(genderClass.getName());
        System.out.println(genderClass.getSuperclass());
        System.out.println(Arrays.toString(genderClass.getEnumConstants()));
        System.out.println(genderClass.isEnum());
        System.out.println(Arrays.toString(genderClass.getDeclaredConstructors()));
        System.out.println(Arrays.toString(genderClass.getDeclaredMethods()));
        System.out.println(Arrays.toString(genderClass.getDeclaredFields()));

    }
}
