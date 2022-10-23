package com.flavio.javarestapi.model;

import java.util.Date;

public class Person {
    String firstName;
    String surname;
    Date birthDate;
    Gender gender;
    MaritalStatus maritalStatus;
    int socialSecurityNumber;
    String phone;
    String email;
    Address address;

    public Person(String firstName, String surname, Date birthDate, Gender gender, MaritalStatus maritalStatus,
                  int socialSecurityNumber, String phone, String email, Address address) {
        this.firstName = firstName;
        this.surname = surname;
        this.birthDate = birthDate;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.socialSecurityNumber = socialSecurityNumber;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }
}
