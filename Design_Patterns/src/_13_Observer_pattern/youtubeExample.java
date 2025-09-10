package _13_Observer_pattern;

import java.util.*;

//Step 1: Observer interface
interface Subscriber {
 void notify(String channelName, String videoTitle);
}

//Step 2: Subject interface
interface Channel {
 void subscribe(Subscriber subscriber);
 void unsubscribe(Subscriber subscriber);
 void notifySubscribers(String videoTitle);
}

//Step 3: Concrete Subject (YouTube Channel)
class YouTubeChannel implements Channel {
 private String name;
 private List<Subscriber> subscribers = new ArrayList<>();

 public YouTubeChannel(String name) {
     this.name = name;
 }

 @Override
 public void subscribe(Subscriber subscriber) {
     subscribers.add(subscriber);
     System.out.println(subscriber + " subscribed to " + name);
 }

 @Override
 public void unsubscribe(Subscriber subscriber) {
     subscribers.remove(subscriber);
     System.out.println(subscriber + " unsubscribed from " + name);
 }

 @Override
 public void notifySubscribers(String videoTitle) {
     for (Subscriber s : subscribers) {
         s.notify(name, videoTitle);
     }
 }

 // Business method: Upload a new video
 public void uploadVideo(String videoTitle) {
     System.out.println("\nChannel: " + name + " uploaded a new video → " + videoTitle);
     notifySubscribers(videoTitle);
 }
}

//Step 4: Concrete Observers (Subscribers)
class User implements Subscriber {
 private String username;

 public User(String username) {
     this.username = username;
 }

 @Override
 public void notify(String channelName, String videoTitle) {
     System.out.println("Hi " + username + "! New video on " + channelName + ": " + videoTitle);
 }

 @Override
 public String toString() {
     return username;
 }
}

//Step 5: Client
public class youtubeExample {
 public static void main(String[] args) {
     YouTubeChannel techChannel = new YouTubeChannel("TechExplained");

     Subscriber user1 = new User("Alice");
     Subscriber user2 = new User("Bob");
     Subscriber user3 = new User("Charlie");

     techChannel.subscribe(user1);
     techChannel.subscribe(user2);
     techChannel.subscribe(user3);

     techChannel.uploadVideo("Observer Pattern in Java");
     techChannel.uploadVideo("Strategy Pattern Explained");

     techChannel.unsubscribe(user2);

     techChannel.uploadVideo("Command Pattern Tutorial");
 }
}

