import java.io.*;

public class SeriallizaTest{

	public static void main(String[] args) throws Exception{
	
		Account acc=new Account(12345,"savings",2345);
		System.out.println(acc);
		
//now we need to serialise this so inorder to serialise this we require a file
		FileOutputStream fos=new FileOutputStream("account.info");
		//this is not a valid extension but u can gv any extension
		
		///this object class is used to convert the accunt.info(obj class) to byte stream
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		//you hav writte in the file where the obj is going to get converted  to byste stream
		oos.writeObject(acc);
		
		
		//Deserilisation
		
		//now the object is converted to byte stream and now it is there in account.info file
		FileInputStream fis=new FileInputStream("account.info");
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		 Account accobj=(Account) ois.readObject();
		 //u r reading obj info  from account.info so by default the return type is object. 
		 System.out.println(accobj);
		 
		
	}

}



//to serialise this account it should implement serialisation 


class Account implements Serializable{

	private int accno;
	private String accType;
	private double balance; //we dont want to serialise this info bcz it is private.
	
	public Account(int accno,String accType,double balance){
	
		this.accType=accType;
		this.accno=accno;
		this.balance=balance;
		}
	
	@Override
	public String toString(){
		return accno+" "+accType+" "+balance;
	}

}
