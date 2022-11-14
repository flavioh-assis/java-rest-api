package com.flavio.javarestapi.model;

import java.util.Date;

public class Person {
    private String firstName;
    private String surname;
    private Gender gender;
    private Date birthDate;
    private Address address;

    public Person(String firstName, String surname, Gender gender, Date birthDate, Address address) {
        this.firstName = firstName;
        this.surname = surname;
        this.gender = gender;
        this.birthDate = birthDate;
        this.address = new Address(
            address.getStreet(),
            address.getCity(),
            address.getState(),
            address.getZipCode()
        );
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Address getAddress() {
        return address;
    }
}
