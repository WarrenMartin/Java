import java.util.Scanner;
import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            Scanner in = new Scanner(System.in);
            arr[i] = in.nextInt();
        }
        int[] temp = new int[arr.length];
        Arrays.sort(arr);
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i-1]) { // Check if current element is not equal to the previous element
                temp[j++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(temp, j))); // Print only the non-zero elements in temp
    }
}
