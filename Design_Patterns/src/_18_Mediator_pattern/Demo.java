package _18_Mediator_pattern;

import java.util.*;

//Step 1: Mediator interface
interface ChatMediator {
	void sendMessage(String message, User user);

	void addUser(User user);
}

//Step 2: Concrete Mediator
class ChatRoom implements ChatMediator {
	private List<User> users = new ArrayList<>();

	@Override
	public void sendMessage(String message, User user) {
		for (User u : users) {
			// Don't send message to sender itself
			if (u != user) {
				u.receive(message, user.getName());
			}
		}
	}

	@Override
	public void addUser(User user) {
		users.add(user);
	}
}

//Step 3: Colleague (abstract user)
abstract class User {
	protected ChatMediator mediator;
	protected String name;

	public User(ChatMediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}

	public abstract void send(String message); 
	public abstract void receive(String message, String from);

	public String getName() {
		return name;
	}
}

//Step 4: Concrete Colleague
class ChatUser extends User {
	public ChatUser(ChatMediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void send(String message) {
		System.out.println(this.name + " sends: " + message);
		mediator.sendMessage(message, this);
	}

	@Override
	public void receive(String message, String from) {
		System.out.println(this.name + " receives from " + from + ": " + message);
	}
}

//Step 5: Client
public class Demo {
	public static void main(String[] args) {
		ChatMediator chatRoom = new ChatRoom();

		User user1 = new ChatUser(chatRoom, "Alice");
		User user2 = new ChatUser(chatRoom, "Bob");
		User user3 = new ChatUser(chatRoom, "Charlie");
		User user4 = new ChatUser(chatRoom, "Diana");

		chatRoom.addUser(user1);
		chatRoom.addUser(user2);
		chatRoom.addUser(user3);
		chatRoom.addUser(user4);

		user1.send("Hello everyone!");
		user3.send("Hey Alice, how are you?");
	}
}
