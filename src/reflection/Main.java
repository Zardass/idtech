package reflection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
//        Class<User> userClass = User.class;
//        Field pin = userClass.getDeclaredField("pin");
//        System.out.println(pin);
//        Field[] declaredFields = userClass.getDeclaredFields();
//        System.out.println(Arrays.toString(declaredFields));

        User user = new User("12347");
        User user2 = new User("1334ABC");
        User user3 = new User("12349@sk");

   //     System.out.println(PinValidator.validate(user));
//            System.out.println(PinValidator.validate(user2));
        System.out.println(PinValidator.validate(user3));
    }
}
