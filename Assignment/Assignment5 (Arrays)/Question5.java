//Write a Java program to find all pairs of elements in an array whose  sum is equal to a specified number.

public class Question5{

	public static void main(String[] args){
		int arr[]={1,2,2,2};
		int target=4;
		int k=0;


		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[k]+arr[j]==target){
					System.out.print("["+" "+arr[k]+" "+arr[j]+"]");
				}

			}
			k++;

		}
	}

}
