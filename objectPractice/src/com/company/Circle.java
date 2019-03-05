package com.company;

public class Circle {

	public int radius;

	public Circle() {

		this.radius = 5;
	}

	public Circle(int input_radius) {

		this.radius = input_radius;
	}



	public double getArea() {
		return (radius * radius * 3.14);
	}

	public double getCircumference() {
		return (2 * radius * 3.14);
	}
	// fuga




}
