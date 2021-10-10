package DTO;

public class Person {
	private String ID;
	private String Name;
	private int Age;
	private String Address;

	public Person(String iD, String name, int age, String address) {
		super();
		ID = iD;
		Name = name;
		Age = age;
		Address = address;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Person() {
		super();
	}

}
