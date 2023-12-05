package library;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInputOutputEx {
	public static void main(String[] args) {
		File file = new File("/Users/EUNCHAE/documents/books.txt");
		try (Scanner scanner = new Scanner(new File("books.txt"));){
//			Scanner scanner = new Scanner(new File("books.txt"));
			while (scanner.hasNextLine()) {
			scanner.hasNextLine();
			String line = scanner.nextLine();
			String[] splitLine = line.split(","); 
			
			String title = splitLine[0].trim();
			String author = splitLine[1].trim();
			int year = Integer.parseInt (splitLine[2].trim());
			int price = Integer.parseInt(splitLine[3].trim());
			boolean renting = Boolean.parseBoolean(splitLine[4].trim());

			System.out.println(splitLine.length);
			System.out.println(title);
			System.out.println(author);
			System.out.println(year);
			System.out.println(price);
			System.out.println(renting);
			System.out.println("------------------");
			}
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}

}
