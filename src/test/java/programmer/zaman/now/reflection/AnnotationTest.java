package programmer.zaman.now.reflection;

import org.junit.jupiter.api.Test;
import programmer.zaman.now.reflection.data.Person;
import programmer.zaman.now.reflection.validation.Validator;

public class AnnotationTest {
    @Test
    void testValidateUsingAnnotation() throws IllegalAccessException {
        Person person = new Person("Dede", " ");
        Validator.validateNotBlank(person);
    }
}
