
public class Person {

	private String name;
	private int number;
	private int contactNumber;
	private String address;
	private double salary;

Person(String name ,int number,  int contactNumber,String address,double salary){
	this. name=name;
	this.number=number;
	this.contactNumber=contactNumber;
	this.address=address;
	this.salary=salary;
}


	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getNumber() {
		return number;
	}




	public void setNumber(int number) {
		this.number = number;
	}




	public int getContactNumber() {
		return contactNumber;
	}




	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public double getSalary() {
		return salary;
	}




	public void setSalary(double salary) {
		this.salary = salary;
	}




	void displaySalary() {
		System.out.print(" salary is :"+ salary);
	}
}
