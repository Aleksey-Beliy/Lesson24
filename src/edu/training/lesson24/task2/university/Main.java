package edu.training.lesson24.task2.university;

public class Main {

	public static void main(String[] args) {

		University.Student st1 = new University.Student(1, "Вася Пупкин");
		University.Student st2 = new University.Student(2, "Петр Петров");
		University.Student st3 = new University.Student(3, "Иван Иванов");
		University.Student st4 = new University.Student(4, "Захар Мухов");

		st1.print();
		st2.print();
		st3.print();
		st4.print();
	}

}
