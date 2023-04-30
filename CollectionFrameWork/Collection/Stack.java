import java.util.Enumeration;
import java.util.Stack;

public class StackOperations {

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(11);
        s.push(12);

        Enumeration<Integer> e=s.elements();
        int ans=0;
       while(e.hasMoreElements()){
        int num=e.nextElement();
            ans=ans+num;
       }

       System.out.println(ans);
      
    }
    
}

