package com.soap.service.pro;

import java.util.ArrayList;
import java.util.List;

public class PersonSoapImpl {
	private static List<Person> personCatalog;

	public PersonSoapImpl() {
		super();
		// TODO Auto-generated constructor stub
		initializeProductCatalog();
	}

	public Person searchByAge(int age) throws Exception {
		for (Person p : personCatalog)
			if (p.getAge() == age)
				return p;
		throw new Exception("No person found with the given age " + age);
	}

	public Person[] getAllPersons() {
		Person[] persons = new Person[personCatalog.size()];
		int i = 0;
		for (Person p : personCatalog) {
			persons[i] = p;
			i++;
		}
		return persons;

	}

	public void insertPerson(Person person) {
		personCatalog.add(person);
	}

	public void initializeProductCatalog() {
		if (personCatalog == null) {
			personCatalog = new ArrayList<Person>();
			personCatalog.add(new Person("Hindu", 24, "B-Tech"));
			personCatalog.add(new Person("Pratik", 28, "Medical"));
			personCatalog.add(new Person("Pooja", 18, "M-Tech"));
		}
	}

}
