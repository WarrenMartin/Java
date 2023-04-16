public class Outer{

private int data=99;

//NB: Inner class can have any Access modifer outer class cannot be private, static

	private class Inner{
		
		void msg(){
			System.out.println(data); //outer class private var
		}
	
	}
	
	
	public static void main(String[] args){
		//if you want obj of inner class that means you have to have outer class object because inner class obj is going to point outer clas object
		Outer out=new Outer();
		System.out.println(out.data);
		
		//Creating inner class
		
		Outer.Inner in=out.new Inner();
		//here out.new so creating inner obj inside outer obj
		in.msg();
		
	}


}



/*
──(kali㉿kali)-[~/Desktop/Java/Outer]
└─$ javac Outer.java   

                                                                                                               
┌──(kali㉿kali)-[~/Desktop/Java/Outer]
└─$ ls               
'Outer$Inner.class'   Outer.class   Outer.java
                                                                                                               
┌──(kali㉿kali)-[~/Desktop/Java/Outer]
└─$ javap Outer\$Inner  
Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
Compiled from "Outer.java"
class Outer$Inner {
 final Outer this$0;
 void msg();
}
                                                                                                               
┌──(kali㉿kali)-[~/Desktop/Java/Outer]
└─$ java Outer         
99
*/
