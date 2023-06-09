package org.tnsif.datetime;

import java.time.Clock;

public class DateTimeExample {

	public static void main(String[] args) {
		Clock c = Clock.systemUTC();
		System.out.println(c);
		
		Clock c1=Clock.systemDefaultZone();
		System.out.println(c1);

	}

}
