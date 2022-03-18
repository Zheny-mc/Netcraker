package ru.netcraker.part4;

public class App {
	public static void main(String[] args) {
		Author[] authors = {
				new Author("name1", "em1", 'M'),
				new Author("name2", "em2", 'W'),
				new Author("name3", "em3", 'M')
		};

		Book book = new Book("Garry Potter", authors, 1.0);
		System.out.println(
				String.format("Book with name '%s' have authors: '%s'",
						book.getName(), book.getAuthorNames()));
	}
}
