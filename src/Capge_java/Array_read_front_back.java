package Capge_java;
import java.util.*;

public class Array_read_front_back {

	public static void main(String[] args) {
	
		
		    int[] a = {2,3,15,15,3,2};
		    boolean read = true;
		    int j = a.length-1;

		    for(int i =0;i<a.length/2;i++){
		      if(a[i]!=a[j]){
		        read = false;
		        break;
		      }
		      else
		        j--;
		    }
		    System.out.println(read);
		  }
		
		

	}


