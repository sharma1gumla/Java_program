package Capge_java;
import java.util.Scanner;

public class PrintRoll_AverageMArks {

	public static void main(String[] args) {
		
		

		int roll, s1, s2, s3;
		Scanner input = new Scanner(System.in);
		for(int i=0; i<=8; i++){

		for(int j=i; j<=8; j++){
		System.out.print("Enter Roll number :");
		roll = input.nextInt();

		System.out.print("Enter First subject number :");
		s1 = input.nextInt();

		System.out.print("Enter second subject number :");
		s2 = input.nextInt();

		System.out.print("Enter third subject number :");
		s3 = input.nextInt();

		int avg = (s1 +s2 + s3)/3 ;
		System.out.println("Student of Roll No " +roll + " get Avarage mark of "+avg);
		}
		}
	}
}
		
	
		
