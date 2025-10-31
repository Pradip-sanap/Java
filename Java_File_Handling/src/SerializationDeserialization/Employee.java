package SerializationDeserialization;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;   // Recommended
    private String name;
    private int age;
    private transient String password; 	// Not serialized

    public Employee(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", password='" + password + "'}";
    }
}
