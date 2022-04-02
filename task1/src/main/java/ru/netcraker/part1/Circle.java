package ru.netcraker.part1;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Circle {
	private double radius = 1.0;
	private String color = "red";

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

}
