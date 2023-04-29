import java.util.*;

public class LinkListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList();
        ll.add("Hyderabad");
        ll.add("asdf");
        ll.add("pune");
        ll.add("Bombay");
        System.out.println(ll);
        ListIterator<String> litr = ll.listIterator();
        while (litr.hasNext()) {
            String city = litr.next();
            System.out.println(city);
			if(city.equals("Bombay")){
				litr.set("Mumbai");
			}
        }

		System.out.println(ll);
    }
}
