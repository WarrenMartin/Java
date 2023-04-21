public class VotingApp{

	// this method has a potential to throw a exception so you shoud declare it
	public void validate(int age) throws InvalidAgeException {
		
		if(age>=18){
			System.out.println("You are welcome to vote!!");
		}
		else{
			
			throw new InvalidAgeException("Under Age");
		}
	}
	
	
	public static void main(String[] args){
		
		VotingApp v=new VotingApp();
		
		
		try{
			
			v.validate(19);
			v.validate(16);
		}
		catch(Exception e){
			
			System.out.println(e);	 //Invalid Age Exception	
			System.out.println(e.getMessage()); //under Age
		} 
		finally{
			System.out.println(v);
			v=null;
			System.out.println(v);
		}
	
	}

}
