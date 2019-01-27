package com.java.entity;

/**
 * @author Kidney
 * @version ����ʱ�䣺2019��1��19�� ����9:05:13 ��˵��
 */
public class User {
	private String username;
	private String password;
	private Integer age;
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", age=" + age + "]";
	}
	
	
}
