package Cdac.hyd;

public class DBDA{

	private int id;
	private int totalStrength;
	static private String name="PG-DBDA";

public DBDA(int id,int totalStrength){
	this.id=id;
	this.totalStrength=totalStrength;
}

public void getDBDA(){
	
	System.out.println(id+" "+totalStrength+" "+name);
}
}
