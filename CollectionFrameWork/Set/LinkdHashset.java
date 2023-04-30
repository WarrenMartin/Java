import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet hs=new LinkedHashSet<>();

        hs.add(10);
        hs.add(10);
        hs.add(3.14);
        hs.add(3.140);
        hs.add(20);
        hs.add("ABC");

        System.out.println(hs);

        Iterator itr=hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }


    // There is insertion order
    // the duplicates are simply ignored
}
