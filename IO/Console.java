import java.io.*;

public class ConSole{

	
	public static void main(String[] args){
	
		Console c=System.console();
		
		System.out.println("Enter name");
		String name=c.readLine();  //throw is not required it is required in readLine method of buffer reader as n buffer reader inhertantly throws a IO exception and in console the readLine method doesnt throw a exception
		System.out.println("Name: "+name);
		
		System.out.println("Enter password");
		// console also has another method called password.
		//this method takes in a character array as its input
		char[] pwd=c.readPassword();
		System.out.println(pwd);
		
		
	
	}


}
