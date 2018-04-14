package com.caveofprogramming.spring.web.dao;

public class login {

	private int E_ID;
	private String E_name;
	private String E_type;
	private String E_password;
	
	public login() {
		
	}
	
public login( String e_name, String e_type, String e_password) {
		
		
		E_name = e_name;
		E_type = e_type;
		E_password = e_password;
	}
	
	
	public login(int e_ID, String e_name, String e_type, String e_password) {
		
		E_ID = e_ID;
		E_name = e_name;
		E_type = e_type;
		E_password = e_password;
	}
	
	public int getE_ID() {
		return E_ID;
	}
	public void setE_ID(int e_ID) {
		E_ID = e_ID;
	}
	public String getE_name() {
		return E_name;
	}
	public void setE_name(String e_name) {
		E_name = e_name;
	}
	public String getE_type() {
		return E_type;
	}
	public void setE_type(String e_type) {
		E_type = e_type;
	}
	public String getE_password() {
		return E_password;
	}
	public void setE_password(String e_password) {
		E_password = e_password;
	}
	@Override
	public String toString() {
		return "login [E_ID=" + E_ID + ", E_name=" + E_name + ", E_type=" + E_type + ", E_password=" + E_password + "]";
	}
	
	
	
}
