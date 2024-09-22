package com.deloitte.lab9ex4;

import java.util.function.Supplier;


public class Lab9Ex4 {

    public static void main(String[] args) {
        Supplier<Person> persons = Person::new;
        Person person = persons.get();
        person.setName("Mahanthi sri Asish");
        person.setAge(30);
        System.out.println(person);

        Supplier<Person> anotherPersonSupplier = () -> new Person("Akhil Varma", 25);
        Person anotherPerson = anotherPersonSupplier.get();
        System.out.println(anotherPerson);
    }
}
