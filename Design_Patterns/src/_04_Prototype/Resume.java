package _04_Prototype;

public class Resume implements Prototype{
	
	private String name;
    private String designation;
    private String[] skills;

    public Resume(String name, String designation, String[] skills) {
        this.name = name;
        this.designation = designation;
        this.skills = skills;
    }

    @Override
    public Resume clone() {
        return new Resume(name, designation, skills.clone());		 // Deep copy of the skills array
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printResume() {
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.print("Skills: ");
        for (String skill : skills) {
            System.out.print(skill + " ");
        } 
    }

}
