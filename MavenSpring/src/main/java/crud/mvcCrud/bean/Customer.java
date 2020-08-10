package crud.mvcCrud.bean;

import java.util.List;

public class Customer {
	
	int id;
	int age;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static List<Customer> getOne() {
		// TODO Auto-generated method stub
		return null;
	}

}