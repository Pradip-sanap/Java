package StudentRecordManageProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class StudentManager {

	private static final String FILEPATH = "C:\\Users\\pradips\\Music\\Java Repo\\Java_File_Handling\\src\\StudentRecordManageProject\\StudentRecords.csv";
	Path path = Paths.get(FILEPATH);
	
	// Ensure file exists
    public StudentManager() {
        try {
            File file = new File(FILEPATH);
            if (!file.exists()) file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error initializing file: " + e.getMessage());
        }
    }
	
	void addStudent(Student s) {
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILEPATH, true))){
			
			bw.write(s.toCSV());
			bw.newLine();
			System.out.println("Student added successfully!");
			
		}catch(IOException e) {
			System.out.println("Error adding student: " + e.getMessage());
		}
		
	}
	
	void viewRecords() {
		try(BufferedReader br = new BufferedReader(new FileReader(FILEPATH))){
			Stream<String> records = br.lines();
			records.forEach(System.out::println);
			
		}catch(IOException e) {
			System.out.println("Error adding student: " + e.getMessage());
		}
	}
	
	void searchRecord(String name) {
		try(BufferedReader br = new BufferedReader(new FileReader(FILEPATH))){
			Stream<String> records = br.lines();
			Stream<String> searchRecords = records.filter(record ->{
				return record.toLowerCase().contains(name.toLowerCase());
			});
			
			searchRecords.forEach(System.out::println);
			
			
		}catch(IOException e) {
			System.out.println("Error adding student: " + e.getMessage());
		}
	}
}
