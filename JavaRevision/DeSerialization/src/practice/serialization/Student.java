package practice.serialization;

import java.io.Serializable;

public class Student implements Serializable {
	private String name;
	transient private String email;
	private int age;
	private String address;

	public Student(String name, String email, int age, String address) {

		this.name = name;
		this.email = email;
		this.age = age;
		this.address = address;
	}

	public Student() {

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	public void displayname() {
		System.out.println("Name - " + this.name);
		System.out.println("Email - " + this.email);
		System.out.println("Age - " + this.age);
		System.out.println("Address - " + this.address);
	}

}
