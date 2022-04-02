package ru.netcraker.part6;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.math.BigDecimal;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
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
		BigDecimal len_v1 = new BigDecimal(v1.distance(v2));
		BigDecimal len_v2 = new BigDecimal(v2.distance(v3));
		BigDecimal len_v3 = new BigDecimal(v3.distance(v1));

		String type = "I dont know!";
		if (len_v1.compareTo(len_v2) == 0
				&& len_v2.compareTo(len_v3) == 0
				&& len_v3.compareTo(len_v1) == 0) {
			type = "Equilateral";
		} else if ( (len_v1.compareTo(len_v2) == 0 || len_v1.compareTo(len_v3) == 0)
				|| (len_v2.compareTo(len_v3) == 0)
				|| (len_v3.compareTo(len_v2) == 0) ) {
			type = "Isosceles";
		} else if ((len_v1.compareTo(len_v2) != 0
					&& len_v1.compareTo(len_v3) !=  0)
				&& (len_v2.compareTo(len_v3) != 0)
				&& (len_v3.compareTo(len_v2) != 0)) {
			type = "Scalene";
		}
		return type;
	}
}
