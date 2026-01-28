package spring_intro;

public class Address {

	private int num;
	private String city;
	private String state;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public void display() {
		System.out.println("Num - "+num+" City: "+city+"state : "+state );
	}
	public Address(int num) {
		super();
		this.num = num;
	}
	
	
	public Address(int num, String city, String state) {
		super();
		this.num = num;
		this.city = city;
		this.state = state;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
