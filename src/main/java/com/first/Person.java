package com.first;

public class Person {
    private String firstName;
    private String lastName;
    private String idNumber;
    private int birthDate;
    private String countryOfBirth;
    private char gender;

    public Person(String firstName, String lastName, String idNumber, int birthDate, String countryOfBirth,
            char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.birthDate = birthDate;
        this.countryOfBirth = countryOfBirth;
        this.gender = gender;
    }

    public void printAttributes() {
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("ID Number: " + this.idNumber);
        System.out.println("Birth Date: " + this.birthDate);
        System.out.println("Country of Birth: " + this.countryOfBirth);
        System.out.println("Gender: " + this.gender);
        System.out.println();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public char getGender() {
        return gender;
    }
}
