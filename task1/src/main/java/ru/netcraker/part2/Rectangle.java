package ru.netcraker.part2;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Rectangle {
	private float length = 1.0f;
	private float width = 1.0f;

	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return 2*(length + width);
	}
}
