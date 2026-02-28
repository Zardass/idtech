package reflection;

import java.lang.reflect.Field;

public class PinValidator {
    public static boolean validate(User user) throws Exception {
        Class<?> clazz = user.getClass();
        Field pin = clazz.getDeclaredField("pin");
        pin.setAccessible(true);
        if(!pin.isAnnotationPresent(PIN.class)){
            return false;
        }
        String result = (String) pin.get(user);
        for(int i = 0; i < result.length(); i++){
            if(!Character.isLetterOrDigit(result.charAt(i))){
                System.out.println("Pin must contain letter and digits");
                return false;
            }
        }
        if(result.length() != 7){
            System.out.println("Pin must contain 7 digits");
            return false;
        }
        return true;
    }
}
