
public class Empoloyee  extends Person{

	  
	
	private String departement; 
	Empoloyee(String name,int number, int contactNumber,String address,double salary,String departement){
			super(name,number,contactNumber,address,salary);	
			this.departement=departement;
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Person employee1=new Empoloyee("lara",66,335,"fff",77.89,"IT");
		System.out.print("name :" +employee1.getName()+" "+"number:"+employee1.getNumber()+ "contact number: "+employee1.getContactNumber());
		System.out.print("employee salary :" +employee1.getSalary()+ " employee address: " +employee1.getAddress());
	}

}
