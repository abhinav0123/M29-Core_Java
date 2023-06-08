package org.tnsif.annotations;
import java.util.Set;
import java.util.TreeSet;
public class SuppressWarningExample {
    /*We can remove the warnings by using
     * below annotations*/
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Set s = new TreeSet();
		s.add(12);
		s.add(76);
		s.add("John");
		System.out.println(s);
		

	}

}
