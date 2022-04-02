package ru.netcraker.part6;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@EqualsAndHashCode
public class MyPoint {
	private int x;
	private int y;

	int[] getXY() {
		return new int[] {x, y};
	}

	void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	double distance(int x, int y) {
		return Math.sqrt( Math.pow(this.x-x, 2) + Math.pow(this.y-y, 2) );
	}

	double distance(MyPoint another) {
		return Math.sqrt( Math.pow(this.x-another.x, 2) + Math.pow(this.y-another.y, 2) );
	}

	double distance() {
		return Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2) );
	}

	@Override
	public String toString() {
		return String.format("(%d, %d)", x, y);
	}
}
