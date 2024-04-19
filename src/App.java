import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Products products = new Products();

		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("=====Management Product Program=====");
			System.out.println("1. Add new Product");
			System.out.println("2. Detele Product");
			System.out.println("3. Check Product");
			System.out.println("4. Exit");
			System.out.println("====================================");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			if(choice==1){
				products.InputProduct();
			}
			else if (choice==2) {
				products.DeleteProduct();
			}
			else if (choice==3) {
				products.OutputProduct();
			}
			
		}	

	}
}
