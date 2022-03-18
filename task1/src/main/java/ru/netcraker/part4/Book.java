package ru.netcraker.part4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
@ToString
public class Book {
	private String name;
	private Author[] authors;
	@Setter
	private double price;
	@Setter
	private int qty;

	public Book(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}

	public String getAuthorNames() {
		return Arrays.stream(authors).map(Author::getName)
				.collect(Collectors.joining(","));
	}
}
