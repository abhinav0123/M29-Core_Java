//program to demonstrate on Matcher Class
package org.tnsif.regularexpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MatcherClassExample {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("job");
		Matcher m=p.matcher("Java programming is enough"
				+ "to get a job");
		while(m.find())
		{
			System.out.printf("pattern found from: " +m.start()+" "+(m.end()-1));
		}

	}

}