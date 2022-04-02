package ru.netcraker.part4;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Author {
	private String name;
	private String email;
	private char gender;
}
