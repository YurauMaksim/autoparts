package com.autoparts.general.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

public class User {

    private int id;
    private String firstName;
    private String lastName;

    private String email;
    private LocalDate dateOfBirth;
    private char[] password;
    private Balance balance;
    private Role role;

    public User() {
        this.firstName = "firstName";
        this.lastName = "lastName";
        this.email = "email@example.com";
        this.dateOfBirth = LocalDate.EPOCH;
        this.password = new char[]{'0'};
        this.balance = new Balance(BigDecimal.ZERO);
        this.role = Role.REGULAR_USER;
    }

    public User(int id, String firstName, String lastName, String email, LocalDate dateOfBirth, char[] password, Balance balance, Role role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.balance = balance;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", password=" + Arrays.toString(password) +
                ", balance=" + balance +
                ", role=" + role +
                '}';
    }
}
