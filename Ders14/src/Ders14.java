import java.util.Scanner;
import java.io.*;
public class Ders14 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("enter a directory name: ");
		
		String directoryName= scan.nextLine();
		
		if(new File(directoryName).mkdirs()) {
			System.out.println("Directory "+ directoryName+ " created");
		}
		else {
			System.out.println("Directory "+ directoryName + " already exist");
		}
		
		
	}

}
