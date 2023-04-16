/// varx is called variable x. 

public class Varx{
   
  static void add(int ... a){
    //here a is the variable intgeer
    int sum=0;
    for(int i:a)  
      sum+=i;
    System.out.println(sum)
    
  }
  
  // What about if you want to put another variable in the parantheses
  
  static void add_WontWork(int ... a, int x)
    
    int sum=0;
    for(int i:a)  
      sum+=i;
    System.out.println(sum)
    
    
  }
  //the add_WontWork wont work this is a trick question because there will be a compile time error as int ...a has to always be last

static void add_WillWork(int x, int ...a){
    
    int sum=0;
    for(int i:a)  
      sum+=i;
    System.out.println(sum)
    
    
  }
  
  
  public static final synchronised void main(String... args){
    
    add(1,2);
    add(1,2,3,4,5,6);
  
  }
