package Cdac.hyd.online;
//this will create a folder Cdac and inside another hyd folder

public class Dac{

	private int id;
	private int totalStrength;
	private static String name ="PG-DAC";


	public Dac(int id,int totalStrength){
		this.id=id;
		this.totalStrength=totalStrength;
	}

	public void getDac(){
	System.out.println(id+" "+totalStrength+" "+name);

	}
}


