package com.demoqa.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("en-US"));

    private String name, email, lastName, birthday, mobileNumber,currentAddress,
            permanentAddress, extensionName, extensionEmail, extensionCurrentAddress, extensionPermanentAddress;

    public String getName() {
        return name;
    }

    public String getExtensionName() {
        return extensionName;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getExtensionEmail() {
        return extensionEmail;
    }

    public String getExtensionCurrentAddress() {
        return extensionCurrentAddress;
    }

    public String getExtensionPermanentAddress() {
        return extensionPermanentAddress;
    }

    public DataInjection(){
        this.name = faker.name().name();
        this.email = faker.internet().emailAddress();
        this.lastName = faker.name().lastName();
        this.birthday = faker.date().birthday().toString();
        this.mobileNumber = faker.phoneNumber().phoneNumber();
        this.currentAddress = faker.address().secondaryAddress();
        this.permanentAddress = faker.address().fullAddress();
        this.extensionName = "Name:";
        this.extensionEmail = "Email:";
        this.extensionCurrentAddress = "Current Address :";
        this.extensionPermanentAddress = "Permananet Address :";
    }


}

