package reflection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySize {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList();
        list.add(1);

        for (int i = 0; i <15; i++) {
            list.add(i);
            Field size = list.getClass().getDeclaredField("elementData");
            size.setAccessible(true);
            Object o = size.get(list);
            System.out.println(Arrays.toString((Object[])  o));
        }

    }
}
