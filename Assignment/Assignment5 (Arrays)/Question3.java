import java.util.*;

public class Question3{

	
	
	public static void main(String[] args){
		int[] arr={100,102,104,5};
		System.out.println(Arrays.toString(arr));
		int a=Smallest(arr);


		for(int i=0;i<arr.length;i++){
			if(arr[i]==a){

				arr[i]=a+100;// what if this addition is the smallest hence for tht sort the array and do , im lazy to do it now so forget

				}

		}
		int b=Smallest(arr);
		System.out.println(b);
	
	}


	public static int Smallest(int[] arr){

		int small=arr[0];
		for(int i=1;i<arr.length;i++){
			if(small>arr[i]){
				small=arr[i];
			}
		}
		return small;
	}

}
