import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet ts=new TreeSet<>();
        ts.add(10);
        ts.add(15);
        ts.add(15);
        ts.add(10);

        System.out.println(ts);
    }
    
    
}

// since treeset organises the data in ascending order then we should make sure
// that all the elements belong to one datatype
// tthat is only integer or only string
//also treeset rmoves duplicates
