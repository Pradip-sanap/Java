package default_Class_methods;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.*;

public class CollectionStaticMethods {
    public static void main(String[] args) {



        ArrayList<String> names = new ArrayList<>(List.of("Ram", "Shyam", "Mohan","Pratik", "Shubham"));

//        Collections.sort(names);

//        Collections.shuffle(names);

        System.out.println(Collections.class.toString());


        Collections.reverse(names);
        System.out.println(names);

        List<String> src = new ArrayList<>(Arrays.asList("one", "two", "three"));
        List<String> dest = new ArrayList<>(Arrays.asList("a", "b", "c"));
        Collections.copy(dest, src);
        System.out.println(dest);  // Output: [one, two, three]


        src.add("four");

        System.out.println(src);
        System.out.println(dest);


    }
}
