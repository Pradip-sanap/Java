package _03_Prototype;

public class _01_Resume implements _01_Prototype{
	
	private String name;
    private String designation;
    private String[] skills;

    public _01_Resume(String name, String designation, String[] skills) {
        this.name = name;
        this.designation = designation;
        this.skills = skills;
    }

    @Override
    public _01_Resume clone() {
        // Deep copy of the skills array
        return new _01_Resume(name, designation, skills.clone());
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
