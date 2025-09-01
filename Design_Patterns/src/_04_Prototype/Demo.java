package _04_Prototype;

public class Demo {
	
	public static void main(String[] args) {
		
		String[] baseSkills = { "Java", "Spring", "Git" };
		Resume originalResume = new Resume("John Doe", "Software Engineer", baseSkills);

		// Clone the resume
		Resume copiedResume = originalResume.clone();
		
		copiedResume.setName("Alice Smith");

		// Print both
		System.out.println("Original Resume:");
		originalResume.printResume();

		System.out.println("\n\nCopied Resume:");
		copiedResume.printResume();
	}
}
