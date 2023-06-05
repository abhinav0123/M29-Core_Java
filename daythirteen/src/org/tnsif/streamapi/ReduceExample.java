package org.tnsif.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {

	public static void main(String[] args) {
		List<Integer> obj = Arrays.asList(10,20,30,40);
	    Optional<Integer> obj1 = obj.stream().reduce((a,b)->(a*b));
	    if(obj1.isPresent())
		{
			System.out.println(obj1.get());
		}
	}

}
