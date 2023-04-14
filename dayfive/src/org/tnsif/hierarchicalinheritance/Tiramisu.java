package org.tnsif.hierarchicalinheritance;

public class Tiramisu extends Android{
  @Override
	public String toString() {
		return "Tiramisu [versionName=" + versionName + ", modelName=" + modelName + ", getBrand()=" + getBrand()
				+ ", getOwnerName()=" + getOwnerName() + "]";
	}
private int versionName;
  private String modelName;
public Tiramisu() {
	super();
	// TODO Auto-generated constructor stub
}
public Tiramisu(int versionName, String modelName) {
	super();
	this.versionName = versionName;
	this.modelName = modelName;
}
  
}
