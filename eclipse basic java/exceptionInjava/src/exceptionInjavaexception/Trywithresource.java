package exceptionInjavaexception;

import java.io.BufferedReader;
import java.io.FileReader;

public class Trywithresource {
	public static void main(String[] args) {
		try(BufferedReader reader = new BufferedReader(new FileReader("exa.txt"))) {
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			System.err.println("Error reading file:" +e.getMessage());
		}
	}

}
