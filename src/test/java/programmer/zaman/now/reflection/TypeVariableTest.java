package programmer.zaman.now.reflection;

import org.junit.jupiter.api.Test;
import programmer.zaman.now.reflection.data.Data;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;

public class TypeVariableTest {
    @Test
    void testGetTypeVariable() {
        Class<Data> dataClass = Data.class;

        TypeVariable<Class<Data>>[] typeParameters = dataClass.getTypeParameters();

        for (TypeVariable<Class<Data>> variable : typeParameters) {
            System.out.println(variable.getName());
            System.out.println(Arrays.toString(variable.getBounds()));
            System.out.println(variable.getGenericDeclaration());
        }

    }
}
