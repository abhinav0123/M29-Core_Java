//Program to demonstrate on packages and Access Specifiers
package org.tnsif.firstpackage;

public class Base {
int varDefault = 10;
public String varpublic="John";
private int varprivate = 1221;
protected float varprotected = 34900.50f;

void methodDefault() {
	System.out.println("Default access method "+varDefault);
}
public void methodPublic() {
	System.out.println("Public method access "+varpublic);
}
private void methodPrivate() {
	System.out.println("Private access method "+varprivate);
}
protected void methodProtected() {
	System.out.println("Protected access method "+varprotected);
}
}
