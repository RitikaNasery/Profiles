/**
 * 
 */
package com.org.test;

/**
 * 
 */

public class Employee {
	private int empId;
	private String name;
	private String city;
	private String gender;
	public Employee() {
		super();
	}
	public Employee(int empId, String name, String city, String gender) {
		super();
		this.empId = empId;
		this.name = name;
		this.city = city;
		this.gender = gender;
	}
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
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
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", city=" + city + ", gender=" + gender + "]";
	}
	
	

}
