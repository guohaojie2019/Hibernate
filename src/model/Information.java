package model;

import java.util.Date;

/**
 * Information entity. @author MyEclipse Persistence Tools
 */

public class Information implements java.io.Serializable {

	// Fields

	private Integer studentId;
	private String name;
	private String sex;
	private Date data;
	private String address;

	// Constructors

	/** default constructor */
	public Information() {
	}

	/** full constructor */
	public Information(String name, String sex, Date data, String address) {
		this.name = name;
		this.sex = sex;
		this.data = data;
		this.address = address;
	}

	// Property accessors

	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}