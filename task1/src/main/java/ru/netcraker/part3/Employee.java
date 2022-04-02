package ru.netcraker.part3;

import lombok.*;

@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	@Setter
	private int salary;

	public String getName() {
		return String.format("%s %s", firstName, lastName);
	}

	public int getAnnualSalary() {
		return salary * 12;
	}

	public int raiseSalary(int percent) {
		salary *= 1.f + percent/100.f;
		return salary;
	}
}
