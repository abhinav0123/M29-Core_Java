package org.tnsif.annotations;

class Car{
	public void speed(int speed) {
		System.out.println("Speed of car is:  "+speed+" km/hr");
	}
}
class Lamborghini extends Car{
	/*below annotation ensures that child class method
	 * inherits the properties of parent class method */
    @Override
	//it should be speed (int speed)
    //if we do Speed(int speed) , we will get an error
	public void speed(int speed) {
		System.out.println("Speed of lamborghini is: "+speed+" km/hr");
		
	}
}

public class OverrideAnnotations {

	public static void main(String[] args) {
		Lamborghini l = new Lamborghini();
		l.speed(90);

	}

}
