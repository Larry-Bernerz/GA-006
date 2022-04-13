
public class  Manger extends Person {
	private String  specialization;
		
	Manger (String name,int number, int contactNumber,String address,double salary,String specialization){
		super(name,number,contactNumber,address,salary);	
		this.specialization=specialization;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person manger1=new Manger("lara",66,335,"fff",77.89,"IT");
		
	}

}
