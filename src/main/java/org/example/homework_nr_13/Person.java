package org.example.homework_nr_13;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) throws InvalidAgeException, InvalidNameException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("You've entered invalid age");
        }
        if (firstName == null || firstName.equalsIgnoreCase("")) {
            throw new InvalidNameException("You've entered invalid firstName");
        }
        if (lastName == null || lastName.equalsIgnoreCase("")) {
            throw new InvalidNameException("You've entered invalid lastName");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

}
