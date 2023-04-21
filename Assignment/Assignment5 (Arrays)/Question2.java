 //Write a Java program to find the second largest element in an array
 
 import java.util.*;
 
 public class Question2{
 	public static void main(String[] args){
 		
 		
 		int[] arr={1,2,53,44,5};
 		int largest=largest(arr);


 		for(int i=0;i<arr.length;i++){
			if(largest==arr[i]){
				arr[i]=0;
			}
 		}
 		System.out.println(Arrays.toString(arr));
 		int large=largest(arr);
 		System.out.println(large);
 			
 		
 		
 	}
 	
 	public static int largest(int[] arr){
 		
 		int l=arr[0];
 		int index=0;
 		
 		for(int i=1;i<arr.length;i++){
 			

 			if(arr[i]>l){
 				
 				l=arr[i];
 				index=i;

 			}
 			

 			
 		}
 		return l;

 		
 	
 	}
 	
 	
 }
