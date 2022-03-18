package ru.netcraker;

import ru.netcraker.part1.Circle;
import ru.netcraker.part2.Rectangle;
import ru.netcraker.part3.Employee;
import ru.netcraker.part4.Author;
import ru.netcraker.part4.Book;
import ru.netcraker.part5.MyPoint;
import ru.netcraker.part6.MyTriangle;

public class Launch {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}

	private static void test1() {
		IRun part1 = () -> {
			System.out.println(String.format("Area of the circle = %.3f",
							new Circle().getArea()));
		};
		part1.run();
		System.out.println("--------------------------");

		IRun part2 = () -> {
			System.out.println(
					String.format("Area of the Rectangle = %.3f",
							new Rectangle().getArea()));

			System.out.println(
					String.format("Perimeter of the circle = %.3f",
							new Rectangle(10.f, 10.f).getPerimeter()));
		};
		part2.run();
		System.out.println("--------------------------");
	}

	private static void test2() {
		IRun part3 = () -> {
			Employee employee = new Employee(1, "Evgeny", "Bubnov", 10);

			System.out.println(
					String.format("Name Employee = %s", employee.getName()));

			System.out.println(
					String.format("AnnualSalary employee = %d",
							employee.getAnnualSalary()));

			System.out.println(
					String.format("Raise salary employee = %d",
							employee.raiseSalary(10)));

			System.out.println(
					String.format("AnnualSalary employee = %d",
							employee.getAnnualSalary()));
		};
		part3.run();
		System.out.println("--------------------------");

		IRun part4 = () -> {
			Author[] authors = {
					new Author("name1", "em1", 'M'),
					new Author("name2", "em2", 'W'),
					new Author("name3", "em3", 'M')
			};

			Book book = new Book("Garry Potter", authors, 1.0);
			System.out.println(
					String.format("Book with name '%s' have authors: '%s'",
							book.getName(), book.getAuthorNames()));
		};
		part4.run();
		System.out.println("--------------------------");
	}

	private static void test3() {
		IRun part5 = () -> {
			MyPoint basePoint = new MyPoint(1, 1);
			System.out.println(basePoint.distance(2, 2));
		};
		part5.run();
		System.out.println("--------------------------");

		IRun part6 = () -> {
			ru.netcraker.part6.MyPoint[] arrPoint = {
					new ru.netcraker.part6.MyPoint(0, 0),
					new ru.netcraker.part6.MyPoint(5, 0),
					new ru.netcraker.part6.MyPoint(0, 5)
			};

			MyTriangle triangle = new MyTriangle(arrPoint[0], arrPoint[1], arrPoint[2]);
			System.out.println("triangle type = " + triangle.getType());
			System.out.println("triangle periment = " + triangle.getPerimetr());
		};
		part6.run();
		System.out.println("--------------------------");
	}
}
