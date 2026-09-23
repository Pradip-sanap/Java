package delete_strings;

public class code_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Class declaration inside method. 
		class Animal {
			private String name;
			private int age;
			private String type;
			public Animal(String name, int age, String type) {
				super();
				this.name = name;
				this.age = age;
				this.type = type;
			}
			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}

			public String getType() {
				return type;
			}

			public void setType(String type) {
				this.type = type;
			}
			@Override
			public String toString() {
				return "Animal [name=" + name + ", age=" + age + ", type=" + type + "]";
			}
			
		}
		
		Animal obj1 = new Animal("cow", 20, "vegetarian");
		System.out.println(obj1);

	}

	

}
