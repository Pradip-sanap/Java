package default_Class_methods;

import java.util.UUID;

public class MyUUID {

    public static void main(String[] args) {

        UUID id = UUID.randomUUID();

        System.out.println(id);
        System.out.println(id.version());
//        System.out.println(id.clockSequence());
//        System.out.println(id.timestamp());
        System.out.println(id.variant());

    }
}
