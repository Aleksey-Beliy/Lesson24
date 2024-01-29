package edu.training.lesson24.task1.car;

public class Car {

	String model;
	String year;

	public Car(String model, String year) {
		this.model = model;
		this.year = year;
	}

	Engine engine = new Engine();
	{
		engine.power = "250";
		engine.type = "бензин";
	}

	public void info() {
		System.out.println("Модель: " + model);
		System.out.println("Год: " + year);
		System.out.println("Мощность: " + engine.power);
		System.out.println("Тип: " + engine.type);
	}

	public class Engine {
		String power;
		String type;

	}
}
