package Capge_java;
import java.util.Scanner;

public class String_remove {

	public static void main(String[] args) {
		
		
		      String str, word;
		      Scanner scan = new Scanner(System.in);
		      
		      System.out.print("Enter the String: ");
		      str = scan.nextLine();
		      System.out.print("Enter the Word to Remove: ");
		      word = scan.nextLine();
		      
		      str = str.replaceAll(word, "");
		      
		      System.out.println("\nThe new string is: " +str);
		   }
		}

	


