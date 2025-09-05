package _14_Command_pattern;

//Step 1: Command Interface
interface Command {
 void execute();
 void undo();
}

//Step 2: Receiver (Device)
class Light {
 public void turnOn() {
     System.out.println("Light is ON");
 }
 public void turnOff() {
     System.out.println("Light is OFF");
 }
}

//Step 3: Concrete Commands
class LightOnCommand implements Command {
 private Light light;

 public LightOnCommand(Light light) {
     this.light = light;
 }

 @Override
 public void execute() {
     light.turnOn();
 }

 @Override
 public void undo() {
     light.turnOff();
 }
}

class LightOffCommand implements Command {
 private Light light;

 public LightOffCommand(Light light) {
     this.light = light;
 }

 @Override
 public void execute() {
     light.turnOff();
 }

 @Override
 public void undo() {
     light.turnOn();
 }
}

//Step 4: Invoker (Remote Control)
class RemoteControl {
 private Command command;

 public void setCommand(Command command) {
     this.command = command;
 }

 public void pressButton() {
     if (command != null) {
         command.execute();
     }
 }

 public void pressUndo() {
     if (command != null) {
         command.undo();
     }
 }
}

//Step 5: Client
public class Main {
 public static void main(String[] args) {
     Light livingRoomLight = new Light();

     Command lightOn = new LightOnCommand(livingRoomLight);
     Command lightOff = new LightOffCommand(livingRoomLight);

     RemoteControl remote = new RemoteControl();

     // Turn on the light
     remote.setCommand(lightOn);
     remote.pressButton();

     // Undo (turn off)
     remote.pressUndo();

     // Turn off the light
     remote.setCommand(lightOff);
     remote.pressButton();

     // Undo (turn on again)
     remote.pressUndo();
 }
}

