package _02_Builder;

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

class User2{
    private String name;
    private int age;
    private String email;
    private String address;
    
    private User2(UserBuilder builderObj){
        this.name = builderObj.name;
        this.age = builderObj.age;
        this.email = builderObj.email;
        this.address = builderObj.address;
    }
    
    public static class UserBuilder{
        private String name;
        private int age;
        private String email;
        private String address;
        
        public UserBuilder(String name, int age){
            this.name = name;
            this.age = age;
        } 
        public UserBuilder email(String email){
            this.email = email;
            return this;
        }
        public UserBuilder address(String address){
            this.address = address;
            return this;
        }
        
        public User2 build(){
            return new User2(this);
        }
    }
    
    public void getString(){
        System.out.println(name +"-"+age +"-"+email +"-"+address +"-");
    }
}

public class practice2
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		User2 userObj = new User2.UserBuilder("PRadip", 24).email("pradip@gmail.com").build();
	    
	    userObj.getString();
	    
	}
}
