package _06_Composite;

import java.util.ArrayList;
import java.util.List;

//Component
interface FileSystem {
	void showDetails();
}

//Leaf
class File implements FileSystem {
	private String name;

	public File(String name) {
		this.name = name;
	}

	@Override
	public void showDetails() {
		System.out.println("File: " + name);
	}
}

//Composite
class Directory implements FileSystem {
	private String name;
	private List<FileSystem> children = new ArrayList<>();

	public Directory(String name) {
		this.name = name;
	}

	public void add(FileSystem fs) {
		children.add(fs);
	}

	public void remove(FileSystem fs) {
		children.remove(fs);
	}

	@Override
	public void showDetails() {
		System.out.println("Directory: " + name);
		for (FileSystem fs : children) {
			fs.showDetails();
		}
	}
}

public class Demo {

	public static void main(String[] args) {
		FileSystem file1 = new File("Resume.pdf");
        FileSystem file2 = new File("Photo.jpg");
        FileSystem file3 = new File("Notes.txt");
        
        Directory documents = new Directory("Documents");
        Directory pictures = new Directory("Pictures");
        Directory root = new Directory("Root");
        
        
        documents.add(file1);
        documents.add(file3);
        
        pictures.add(file2);
        
        root.add(documents);
        root.add(pictures);
        
        root.showDetails();

	}

}
