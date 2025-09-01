package _02_Builder;

import java.lang.Thread.Builder;
 
class User {
	private final int uid;
	private final String name;
	private final int age;
	private final String email;
	private final String phone;
	private final String address;
	
	private User(Builder builder){
		this.uid = builder.uid;
		this.name = builder.name;
		this.age = builder.age;
		this.email = builder.email;
		this.phone = builder.phone;
		this.address = builder.address;
	}
	
	public static class Builder{
		private   int uid;
		private   String name;
		private   int age;
		private   String email;
		private   String phone;
		private   String address;
		
		// Required fields
		Builder(int uid){
			this.uid = uid;
		}
		
		//Optional fields
		public Builder setName(String name) {this.name = name;   return this;}
		public Builder setAge(int age) {this.age = age;   return this;}
		public Builder setEmail(String email) {this.email = email;   return this;}
		public Builder setPhone(String phone) {this.phone = phone;   return this;}
		public Builder setAddress(String adrs) {this.address = adrs;   return this;}
		
		public User build() {
			return new User(this);
		}
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", age=" + age + ", email=" + email + ", phone=" + phone
				+ ", address=" + address + "]";
	} 
}

public class practice {

	public static void main(String[] args) {
		User u = new User.Builder(1001)
						.setName("Pradip")
						.setEmail("pradip@gmail.com")
						.setAddress("gandi road 3/A2")
						.setPhone("9385820389")
						.setAge(24)
						.build();
		
		System.out.println(u);
	}

}
