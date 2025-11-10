package StudentRecordManageProject;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StudentManager manager = new StudentManager();
		boolean flag = true;
		while (flag) {
			System.out.println( "\n\nEnter you choice:\n1)Add Student\n2)View All students\n3)search Record\n4)Delete Record\n5)Exit\n");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter RollNo, Name and grades");
				int rollNo = sc.nextInt();
				String name = sc.next();
				String grade = sc.next();
				Student stud = new Student(rollNo, name, grade);

				manager.addStudent(stud);
				break;
			case 2:
				manager.viewRecords();
				break;
			case 3:
				System.out.println("Enter name that you want to search:");
				String searchWord = sc.next();
				manager.searchRecord(searchWord);
				break;
			case 4:
				break;
			case 5:
				flag = false;
			default:
				System.out.println("Invalid input");
			}

		}

	}

}
