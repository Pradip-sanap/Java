package _20_Memento_pattern;

import java.util.*;

//Step 1: Memento
class TextMemento {
	private final String state;

	public TextMemento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
}

//Step 2: Originator
class TextEditor {
	private String text;

	public void setText(String text) {
		System.out.println("Setting text: " + text);
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public TextMemento save() {
		System.out.println("Saving state...");
		return new TextMemento(text);
	}

	public void restore(TextMemento memento) {
		text = memento.getState();
		System.out.println("Restored to: " + text);
	}
}

//Step 3: Caretaker
class Caretaker {
	private final Stack<TextMemento> history = new Stack<>();

	public void saveState(TextEditor editor) {
		history.push(editor.save());
	}

	public void undo(TextEditor editor) {
		if (!history.isEmpty()) {
			editor.restore(history.pop());
		} else {
			System.out.println("No states to restore.");
		}
	}
}

//Step 4: Client
public class Demo {
	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		Caretaker caretaker = new Caretaker();

		editor.setText("Version 1");
		caretaker.saveState(editor);

		editor.setText("Version 2");
		caretaker.saveState(editor);

		editor.setText("Version 3");
		System.out.println("Current Text: " + editor.getText());

		// Undo twice
		caretaker.undo(editor);
		caretaker.undo(editor);
	}
}
