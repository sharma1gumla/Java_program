package Capge_java;
import java.util.Scanner;

public class Remove_element {

	public static void main(String[] args) {
		
		
	        Scanner in = new Scanner(System.in);
		    int[] intArr = {1, 2, 5, 12, 7, 3, 8};
		    System.out.print("Enter Element to be deleted : ");
		    int elem = in.nextInt();
		    
		    for(int i = 0; i < intArr.length; i++){
		      if(intArr[i] == elem){
		        
		        for(int j = i; j < intArr.length - 1; j++){
		            intArr[j] = intArr[j+1];
		        }
		        break;
		      }
		    }
		      
		    System.out.println("Elements -- " );
		    for(int i = 0; i < intArr.length; i++){
		      System.out.print(" " + intArr[i]);
		    }                
		  }
		
	}

