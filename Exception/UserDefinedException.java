// its very simple !!!!!

//firstly we extend InvalidAgeException to Exception
// then we define a constructor and pass a string message of error description
// then we pass the string message to a parent consructor error description

public class InvalidAgeException extends Exception{

	public InvalidAgeException(String errDesc){
	
		super(errDesc);
	}

}
