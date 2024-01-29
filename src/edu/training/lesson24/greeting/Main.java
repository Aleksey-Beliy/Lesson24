package edu.training.lesson24.greeting;

public class Main implements Greeting {

	public static void main(String[] args) {

		Greeting greeting = new Greeting() {
			
			@Override
			public void SayHello() {
				System.out.println("Привет, Java!");
			}
		};
		greeting.SayHello();
	}

	

}
