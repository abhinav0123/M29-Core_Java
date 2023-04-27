package org.tnsif.interfacedemo;

public class NestedInterfaceExample implements OuterInterface{
	private String str1;
	private String str2;
	
	public String getStr1() {
		return str1;
	}
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	public String getStr2() {
		return str2;
	}
	public void setStr2(String str2) {
		this.str2 = str2;
	}
	
	public String concatenate() {
		return str1+str2;
	}
	@Override
	public int sum() {
		// TODO Auto-generated method stub
		return 0;
	}

}
