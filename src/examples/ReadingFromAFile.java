package examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingFromAFile {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("D:\\David\\Devel\\Worspace_Courses\\MultipleJavaItems\\src\\handsOn\\students.txt"));
		List<String> students = new ArrayList<String>();
		while(in.hasNextLine()) {
			students.add(in.nextLine());
		}
		
		for(int i=0; i < students.size(); i++) {
			if(students.get(i) != null) {
				System.out.println("name: " + students.get(i));
			}
		}
		in.close();
	}
}
