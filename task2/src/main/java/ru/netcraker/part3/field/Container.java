package ru.netcraker.part3.field;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import ru.netcraker.part3.figure.Ball;
import ru.netcraker.part3.figure.MyPoint;

@AllArgsConstructor
@EqualsAndHashCode
@Getter @Setter
public class Container extends MyPoint{
	private int width;
	private int height;

	public boolean collides(Ball ball) {
		return collidesWidth(ball) && collidesHeight(ball);
	}

	private boolean collidesWidth(Ball ball) {
		int x2 = (int)x + width;
		if((ball.getX() + ball.getRadius()) >= x2) {
			return true;
		}
		if((ball.getX() - ball.getRadius()) <= x) {
			return true;
		}
		return false;
	}

	private boolean collidesHeight(Ball ball) {
		double y2 = y + height;
		if((ball.getY() + ball.getRadius()) >= y2) {
			return true;
		}
		if((ball.getY() - ball.getRadius()) <= (double)y) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return String.format("Container[base_point(%.3f, %.3f), width=(%d), height=(%d)]",
				x, y, width, height);
	}
}
