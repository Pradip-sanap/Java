package _03_Prototype;

public class _01_MainClass {
	public static void main(String[] args) {
		String[] baseSkills = { "Java", "Spring", "Git" };
		_01_Resume originalResume = new _01_Resume("John Doe", "Software Engineer", baseSkills);

		// Clone the resume
		_01_Resume copiedResume = originalResume.clone();
		copiedResume.setName("Alice Smith");

		// Print both
		System.out.println("Original Resume:");
		originalResume.printResume();

		System.out.println("Copied Resume:");
		copiedResume.printResume();
	}
}
