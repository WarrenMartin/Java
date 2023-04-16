/*
When it is a local it cant have access modifier, because it is local that means no private,public,protected  etc.
As a local only final (final static) modifier is applicable.
Its scope is limited to method.
*/

public class OuterLocal{
	private int data=10;
	
	public void display(){
	//since inside method so inner class is local to the method itself, it cant have access specifier
		
		
		class Local{
			void msg(){
				
				System.out.println(data);
			}
		} //class def-end
		
	// you have to create the instance of local class inside a method only otherwise you cannot access it
		
		Local l=new Local();
		l.msg();
		
	} //Method End

	
	
	
	public static void main(String[] args){
		
		OuterLocal out=new OuterLocal();
		
		out.display();
	
	}


}
