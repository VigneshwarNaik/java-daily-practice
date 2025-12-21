package Aggcomp;

class Charger{
	private String cBrand;
	private float cVoltage;
	
	public Charger(String cBrand,float cVoltage){
		this.cBrand=cBrand;
		this.cVoltage=cVoltage;
	}
	
	public String getcBrand(){
		return cBrand;
	}
	
	public float getcVoltage(){
		return cVoltage;
	}
}
	
class Os{
	private String oName;
	private float oSize;
	
	public Os(String oName,float oSize){
		this.oName=oName;
		this.oSize=oSize;
	}
	
	public String getName(){
		return oName;
	}
	
	public float getSize(){
		return oSize;
	}
}
	
class Mobile{
	Os os=new Os("iphone",45.2f);
	
	 void hasA(Charger c){
		System.out.println(c.getcBrand());
		System.out.println(c.getcVoltage());
	}
}







public class Demo {


	public static void main(String[] args) {
		
		Charger c=new Charger("samsang",74.2f);
		Mobile  m=new Mobile();
		

		System.out.println(c.getcBrand());
		System.out.println(c.getcVoltage());
		
//		Mobile with me

		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		
//		Mobile lost
		m=null;
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		
	}

}
