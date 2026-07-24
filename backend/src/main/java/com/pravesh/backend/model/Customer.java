package com.pravesh.backend.model;

public class Customer {

    private int customerId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String address;

    public Customer(String firstName,
                    String lastName,
                    String phoneNumber,
                    String email,
                    String address) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public int getCustomerId () {
        return customerId;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
    public boolean hasEmail() {
        return email != null && !email.isBlank();
    }
    public boolean hasPhoneNumber() {
        return phoneNumber != null && !phoneNumber.isBlank();
    }
    public boolean isProfileComplete() {
        return firstName != null && !firstName.isBlank() &&
                lastName != null && !lastName.isBlank() &&
                address != null && !address.isBlank() &&
                hasEmail() &&
                hasPhoneNumber();
    }

}
