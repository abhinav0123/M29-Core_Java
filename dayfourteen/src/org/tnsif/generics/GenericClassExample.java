package org.tnsif.generics;
//Generic Class
class GenericClass<T>{
	T x;
	void print(T x) {
		this.x=x;
	}
	T accept() {
		return x;
	}
}
public class GenericClassExample<T> {

	public static void main(String[] args) {
		GenericClass<String> obj= new GenericClass<>();
		obj.print("Hello all");
		System.out.println(obj.accept());
		

	}

}
