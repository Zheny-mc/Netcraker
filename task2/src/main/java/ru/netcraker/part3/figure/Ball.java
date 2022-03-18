package ru.netcraker.part3.figure;

import lombok.*;

@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode
public class Ball extends MyPoint{
	private int radius;
	private double xDelta;
	private double yDelta;

	public Ball(int x, int y, int radius, int speed, int direction) {
		super(x, y);
		this.radius = radius;
		this.xDelta = speed * Math.cos(direction);
		this.yDelta = (-1) * speed * Math.sin(direction);
	}

	public void move() {
		x += xDelta;
		y += yDelta;
	}

	public void reflectHorizontal() {
		xDelta = (-1) * xDelta;
	}

	public void reflectVertical() {
		yDelta = (-1) * yDelta;
	}

	@Override
	public String toString() {
		return String.format("Ball[(%.3f, %.3f), speed=(%.3f, %.3f)]", x, y, xDelta, yDelta);
	}

}
