import java.util.Arrays;

public class Question6{
   public static void main(String[] args) {
      int[] array1 = {1, 2, 3, 4, 5};
      int[] array2 = {1, 2, 3, 4, 5};
      boolean equal = Arrays.equals(array1, array2);
      if (equal) {
         System.out.println("The two arrays are equal.");
      } else {
         System.out.println("The two arrays are not equal.");
      }
      
      System.out.println(Arrays.toString(array1));
   }
}
