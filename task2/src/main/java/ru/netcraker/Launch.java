package ru.netcraker;

import ru.netcraker.part1.MyComplex;
import ru.netcraker.part2.MyPolinomial;
import ru.netcraker.part3.field.Container;
import ru.netcraker.part3.figure.Ball;

import java.util.List;

public class Launch {
	public static void main(String[] args) {
		getListRun().forEach(i -> {
			System.out.println("***********************");
			i.run();
		});
	}
	 private static List<IRun> getListRun() {
		 return List.of(
				 () -> {
					 MyComplex myComplex = new MyComplex(3., 2.);
					 myComplex.add(new MyComplex(2., 3.));
					 System.out.println(myComplex);
				 },
				 () -> {
					 MyPolinomial myPolinomial = new MyPolinomial(1.0, 2.0, 3.0, 4.0);
					 System.out.println("myPolinomial = " + myPolinomial);
					 System.out.println("add: " + myPolinomial.add(
					 		new MyPolinomial(1.0, 2.0, 3.0, 4.0)));
					 System.out.println("multiply: " + myPolinomial.multiple(
					 		new MyPolinomial(1.0, 2.0, 3.0)));
					 System.out.println("value = : " + myPolinomial.evaluate(1.0));
				 },
				 () -> {
					 Ball ball = new Ball(0, 0, 2, 10, -45);
					 Container container = new Container(640, 480);
					 System.out.println("Пересечение с границей до передвижения = " +
							 container.collides(ball));
					 ball.move();
					 System.out.println("Пересечение с границей после движения = " +
							 container.collides(ball));
				 }
		 );
	 }
}
