
///This is going to tel you how to iterator through the hashmap(key,values) it is a bit complicated call 8308485202
//also it teells you how to extract key and value pairs seprately






import java.util.*;
public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> m=new HashMap<>();

        m.put("USA",5);
        m.put("India",5);
        m.put("UK",8);
        m.put("AUS",9);
        m.put("CH",15);


        System.out.println(m);



        Set s=m.entrySet();
        //entryset will have key value entries as a set.
        

        Iterator itr=s.iterator();
        // s is going to have key value pair entries.

        while(itr.hasNext()){
            Map.Entry m1=(Map.Entry) itr.next();
            System.out.println(m1.getKey()+" "+m1.getValue());
        }

        // if you want to get all the keys then 
        Collection k=m.keySet();
        System.out.println(k);
        

        // if you want to get all the values then
        Collection v=m.values();
        System.out.println(v);


        //  iteration here is different as in maps there are key value pairs that is two objects
        //unlike before in set and list
    





    }

}

