package spring_intro;

public class Employee {
	
	private int id;
	private String name;
	private int sal;
	private Address add;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, Address add) {
		super();
		this.id = id;
		this.add = add;
	}
	
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public Employee(int id, String name, int sal, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.add = add;
	}
	public void display() {
		System.out.println( "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", add=" + add + "]");
	}
	
	public void init() {
		
	}
	
	

}
