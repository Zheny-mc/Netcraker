package ru.netcraker.part2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class MyPolinomial {
	private double[] coeffs;
	private int degree;

	public MyPolinomial(double ... coeffs) {
		this.coeffs = coeffs;
		degree = coeffs.length-1;
	}

	public MyPolinomial(int degree) {
		coeffs = new double[degree+1];
		this.degree = degree;
	}

	public MyPolinomial add(MyPolinomial right) {
		int max = Math.max(this.degree, right.degree);
		int min = Math.min(this.degree, right.degree);
		MyPolinomial res = new MyPolinomial(max); //новый полином размера большего из складываемых полиномов
		for (int i=0; i<=min; i++) {
			res.coeffs[i] = this.coeffs[i] + right.coeffs[i];
		}
		if (this.degree > right.degree)
			System.arraycopy(this.coeffs, min+1, res.coeffs, min+1, max-min);
		else if (right.degree > this.degree)
			System.arraycopy(right.coeffs, min+1, res.coeffs, min+1, max-min);
		return res;
	}

	public MyPolinomial multiple(MyPolinomial right) {
		MyPolinomial res = new MyPolinomial(degree + right.degree);
		for (int i = degree; i>=0; i--) {
			for (int j = right.degree; j>=0; j--) {
				res.coeffs[i+j] += coeffs[i] * right.coeffs[j];
			}
		}
		return res;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder("");
		for (int i = degree; i>=0; i--) {
			if (coeffs[i] == 0) continue;
			if ((coeffs[i] > 0) && (i!= degree))
				s.append("+");
			if ((int)coeffs[i] == coeffs[i])
				s.append((int)coeffs[i]);
			else s.append(coeffs[i]);
			if (i == 1) s.append("x");
			else if (i != 0) s.append("x^" + i);
		}
		return s.toString();
	}
}
