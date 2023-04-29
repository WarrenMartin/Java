import java.util.*;

public class ArrayListDemo{

	public static void main(String[] args){
		
		ArrayList<Object> al = new ArrayList<>();
		al.add("xyz");
		al.add("Added String");
		al.add("XYZ");
		al.add("ABC");
		
		System.out.println(al);

		Collections.shuffle(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);

	
	}
}
