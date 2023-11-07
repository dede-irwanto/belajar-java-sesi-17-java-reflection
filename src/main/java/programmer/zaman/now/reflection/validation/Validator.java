package programmer.zaman.now.reflection.validation;

import programmer.zaman.now.reflection.annotation.NotBlank;

import java.lang.reflect.Field;

public class Validator {
    public static void validateNotBlank(Object object) throws IllegalAccessException {
        // get class
        Class<?> aClass = object.getClass();

        // get all field
        Field[] fields = aClass.getDeclaredFields();

        // iterate each field
        for (Field field : fields) {
            // get not blank annotation
            NotBlank notBlank = field.getAnnotation(NotBlank.class);

            // cek if @NotBlank is exists
            if (notBlank != null) {
                // get field value
                field.setAccessible(true);
                String value = (String) field.get(object);

                if (notBlank.allowEmptyString()) {
                    // allow empty string
                } else {
                    // not allow empty string
                    value = value.trim();
                }

                // check if value is empty string
                if ("".equals(value)) {
                    throw new RuntimeException(field.getName() + " must not blank");
                }
            }
        }
    }

}
