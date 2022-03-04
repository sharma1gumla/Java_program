package Capge_java;
import java.util.Scanner;
public class Nonnrgative_unique_Array {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    System.out.println("define length of array");
	    int l =sc.nextInt();
	    int [] arr =new int[l];
	    System.out.println("enter elements");
	    for (int i =0;i<l;i++){
	        int flag=0;
	        int a = sc.nextInt();
	        for (int e : arr) {
	            if(e==a){
	                flag=1;
	                break;
	            }
	        }
	        if (flag==0){
	            arr[i]=a;
	        }
	        else {
	            System.out.println("enter unique no.");
	            break;
	        }
	    }
	    int [] arr2 = new int[l+1];
	    int max=arr[0];
	    int second_max=arr[0];
	    int j=0;
	    for (int i=0;i<l;i++){
	        if(arr[i]>max){
	            max=arr[i];
	            j=i;
	        }
	    }
	    for (int i =0;i<l;i++){
	        if (arr[i]>second_max && arr[i]<max){
	            second_max=arr[i];
	        }
	    }
	    for (int i= 0;i<j;i++){
	        arr2[i]=arr[i];
	    }
	    arr2[j]=second_max;
	    arr2[j+1]=max-second_max;
	    for (int i=j+2;i< arr2.length;i++){
	        arr2[i]=arr[i-1];
	    }
	    for (int e:arr2){
	        System.out.print(e+" ");
	    }
	}

}
