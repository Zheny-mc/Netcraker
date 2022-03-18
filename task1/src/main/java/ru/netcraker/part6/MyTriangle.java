package ru.netcraker.part6;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class MyTriangle {
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;

	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.v1 = new MyPoint(x1, y1);
		this.v2 = new MyPoint(x2, y2);
		this.v3 = new MyPoint(x3, y3);
	}

	public double getPerimetr() {
		double perim = 0;
		perim += v1.distance(v2);
		perim += v2.distance(v3);
		perim += v3.distance(v1);
		return perim;
	}

	public String getType() {
		Double len_v1 = v1.distance(v2);
		Double len_v2 = v2.distance(v3);
		Double len_v3 = v3.distance(v1);
		String type = "I dont know!";
		if (len_v1 == len_v2 && len_v2 == len_v3 && len_v3 == len_v1) {
			type = "Equilateral";
		} else if ((len_v1 == len_v2 || len_v1 == len_v3)
				|| (len_v2 == len_v1 || len_v2 == len_v3)
				|| (len_v3 == len_v1 || len_v3 == len_v2)) {
			type = "Isosceles";
		} else if ((len_v1 != len_v2 && len_v1 != len_v3)
				&& (len_v2 != len_v1 && len_v2 != len_v3)
				&& (len_v3 != len_v1 && len_v3 != len_v2)) {
			type = "Scalene";
		}
		return type;
	}
}
