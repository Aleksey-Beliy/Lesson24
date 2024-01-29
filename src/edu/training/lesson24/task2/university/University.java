package edu.training.lesson24.task2.university;

public class University {

	public static class Student {
		 int id;
		 String name;

		
		
		public Student(int id, String name) {
			this.id = id;
			this.name = name;
			
		}



		public void print() {
			System.out.println(id + " " + name);
		}

	}
}
