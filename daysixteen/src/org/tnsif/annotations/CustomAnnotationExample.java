package org.tnsif.annotations;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
//custom annotation
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Custom{
	//abstract method
	String print();
	float percentage();
}
class ImplementableClass{
	@Custom(print="Welcome Abhinav",percentage=89.6f)
	public void display() {
		System.out.println("Hurrah!It's working almost!");
	}
}
public class CustomAnnotationExample {

	public static void main(String[] args) throws Exception, SecurityException {
		ImplementableClass i = new ImplementableClass();
		i.display();
		Method m = i.getClass().getMethod("display");
		Custom obj = m.getAnnotation(Custom.class);
		System.out.println(obj.print());
		System.out.println(obj.percentage());


	}

}
