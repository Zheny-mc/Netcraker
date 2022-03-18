package ru.netcraker.part1;

import lombok.*;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MyComplex {
	private Double real;
	private Double imag;

	void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	@Override
	public String toString() {
		return String.format("%.3f + %.3fi", real, imag);
	}

	boolean isReal() {
		return real == 0 ? false : true;
	}

	boolean isImaginary() {
		return imag == 0 ? false : true;
	}

	public boolean equals(double real, double imag) {
		return this.real.equals(real) && this.imag.equals(imag);
	}

	public boolean equals(MyComplex another) {
		return this.real.equals(another.real) && this.imag.equals(another.imag);
	}

	public double magnitude() {
		return Math.sqrt( Math.pow(real, 2) + Math.pow(imag, 2) );
	}

	public  double argument() {
		double res = 0.;
		if (real > 0) {
			res = Math.atan(imag/real);
		} else if (real < 0. && imag >= 0.) {
			res = Math.atan(imag/real + Math.PI);
		} else if (real < 0. && imag < 0.) {
			res = Math.atan(imag/real - Math.PI);
		}
		return res;
	}

	public MyComplex add(MyComplex right) {
		real += right.real;
		imag += right.imag;
		return this;
	}

	public MyComplex addNew(MyComplex right) {
		return new MyComplex(real + right.real, imag + right.imag);
	}

	public MyComplex subtract(MyComplex right) {
		real -= right.real;
		imag -= right.imag;
		return this;
	}

	public MyComplex subtractNew(MyComplex right) {
		return new MyComplex(real - right.real, imag - right.imag);
	}

	public MyComplex multiply(MyComplex right) {
		real = real*right.real - imag*right.imag;
		imag = imag*right.real + real * right.imag;
		return this;
	}

	public MyComplex divide(MyComplex right) {
		real = (real*right.real + imag*right.imag) /
				(Math.pow(right.real, 2) + Math.pow(right.imag, 2));

		imag = (imag*right.real - real* right.imag) /
				(Math.pow(right.real, 2) + Math.pow(right.imag, 2));
		return this;
	}

	public MyComplex conjugate() {
		return new MyComplex(real, -imag);
	}

}
