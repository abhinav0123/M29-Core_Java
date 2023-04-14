package org.tnsif.hierarchicalinheritance;

public class SnowCone extends Android {
	private int versionName;
	private String modelName;
	
	public SnowCone() {
		System.out.println("Default constructor for parent");
		// TODO Auto-generated constructor stub
	}
	
	
	public SnowCone(int versionName, String modelName) {
		super();
		this.versionName = versionName;
		this.modelName = modelName;
	}


	@Override
	public String toString() {
		return "SnowCone [versionName=" + versionName + ", modelName=" + modelName + ", getBrand()=" + getBrand()
				+ ", getOwnerName()=" + getOwnerName() + "]";
	}

	

	public int getVersionName() {
		return versionName;
	}
	public void setVersionName(int versionName) {
		this.versionName = versionName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	
	

}
