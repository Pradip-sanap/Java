package ArrayList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

class Task { 
	private String description;
	private boolean completed;
	private LocalDate dueDate;
	private int priority;		// 1:high, 2:medium, 3:low
	
	Task(String description, LocalDate dueDate, int priority){
		this.description = description;
		this.completed = false;
		this.dueDate = dueDate;
		this.priority = priority;
	}
	
	public String getDescription() { return this.description; }
	public LocalDate getDueDate() { return this.dueDate; }
	public int getPriority() { return this.priority; }
	public boolean isCompleted() { return completed; }
	
	public void setCompleted(boolean status) {this.completed = status;}
	public void setDescription(String desc) {this.description = desc;}
	public void setDuedate(LocalDate dueDate) {this.dueDate = dueDate;}
	public void setPriority(int priority) {this.priority = priority;}
	
	@Override
	public String toString() {
		return (completed ? "[✔]": "[ ]") + " [description=" + description + ", completed=" + completed + ", dueDate=" + dueDate + ", priority="
				+ priority + "]";
	}
	
	
	
}

class ToDoListapp{
	private ArrayList<Task> tasks = new ArrayList<>();
	
	public void addNewTask(String desc, LocalDate dueDate, int priority) {
		tasks.add(new Task(desc, dueDate, priority));
	}
	
	public void displayMyTasks() {
		if(tasks.isEmpty()) {
			System.out.println("There is no tasks added.");
		}
		int counter=1;
		for (Task task : tasks) {
		    System.out.println(counter++ + ". " + task);
		}
	}
	
	public void markTaskCompleted(int index) {
		if(index<0 || index>tasks.size()) {
			System.out.println("Invalid input.");
			return;
		}
		
		tasks.get(index).setCompleted(true);
	}
	
	// Remove all completed tasks
    public void removeCompleted() {
        tasks.removeIf(Task::isCompleted);
    }
    
    public void editTaskDescription(int idx, String newDesc) {
        if (idx < 0 || idx >= tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }
        tasks.get(idx).setDescription(newDesc);
    }
    
 // Move task up
    public void moveUp(int idx) {
        if (idx <= 0 || idx >= tasks.size()) {
            System.out.println("Task can't be moved up.");
            return;
        }
        Collections.swap(tasks, idx, idx - 1);
    }

    // Move task down
    public void moveDown(int idx) {
        if (idx < 0 || idx >= tasks.size() - 1) {
            System.out.println("Task can't be moved down.");
            return;
        }
        Collections.swap(tasks, idx, idx + 1);
    }
}

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Here is a console-based to-do list application in Java using ArrayList, implementing these features:
//
//			Mark tasks as completed. 
//			Remove completed tasks. 
//			Reorder tasks (move up/down in the list). 
//			Save/load tasks from a file.
		
		
		ToDoListapp app = new ToDoListapp();
		Scanner sc = new Scanner(System.in);
//        app.loadFromFile();

        while (true) {
            System.out.println("\n--- TO-DO LIST ---");
//            app.displayTasks();
            System.out.println("\nOptions: 1-Add 2-Complete 3-Remove 4-DisplayTasks 5-MoveUp 6-MoveDown 7-EditDescription  8-Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Task description: ");
                    String desc = sc.next();
                    System.out.print("DueDate(YYYY-MM-DD): ");
                    LocalDate dueDate = LocalDate.parse(sc.next());
                    System.out.print("Priority: ");
                    int priority = sc.nextInt();
                    app.addNewTask(desc, dueDate, priority);
                    break;
                case 2:
                    System.out.print("Enter task number to complete: ");
                    app.markTaskCompleted(sc.nextInt() - 1);
                    sc.nextLine();
                    break;
                case 3:
                    app.removeCompleted();
                    break;
                case 4:
                	app.displayMyTasks();
                	break;
                case 5:
                    System.out.print("Task number to move up: ");
                    app.moveUp(sc.nextInt() - 1);
                    sc.nextLine();
                    break;
                case 6:
                    System.out.print("Task number to move down: ");
                    app.moveDown(sc.nextInt() - 1);
                    sc.nextLine();
                    break;
                case 7:
                	System.out.print("Enter task number and description: ");
                	app.editTaskDescription(sc.nextInt() - 1, sc.next());
                	sc.nextLine();
                	break;
                case 8:
//                    app.saveToFile();
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        
		

	}

}
