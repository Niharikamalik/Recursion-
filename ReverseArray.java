import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner (System.in);
		int n =  sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i] = sc.nextInt();
		}
		reverse( arr,0);
	}
	public static void reverse (int arr[],int idx){
	    if(idx==arr.length){
	        return;
	    }
	    reverse(arr,idx+1);
	    System.out.print(arr[idx]+ " ");
	}
}
