package Cdac.pune;

public class DAI{

	private int id;
	private int totalStrength;
	private static String name ="PG-DAI";


	public DAI(int id,int totalStrength){
		this.id=id;
		this.totalStrength=totalStrength;
	}

	public void getDAI(){
	System.out.println(id+" "+totalStrength+" "+name);

	}
}



