package StudentRecordManageProject;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class AddRecord {
	
	final String FILEPATH = "C:\\Users\\pradips\\Music\\Java Repo\\Java_File_Handling\\src\\StudentRecordManageProject\\StudentRecords.csv";
	Path path = Paths.get(FILEPATH);
	void addRecord(String rollNo, String name, String grades) {
		List<String> values = List.of(rollNo, name, grades);
		try {
			if((Files.exists(path) && Files.isRegularFile(path))){
				Files.write(path, values, StandardOpenOption.APPEND);				
			}
		}catch(Exception e) {
			
		}
		
	}

}
