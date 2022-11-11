package com.autoparts.general.entity;

import com.autoparts.general.enums.Role;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "date_of_birth", columnDefinition = "date")
    private LocalDate dateOfBirth;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "password")
    private char[] password;
    @Column(name = "balance")
    private BigDecimal balance;
    @Enumerated(EnumType.STRING)
    @Column(name="role")
    private Role role;
    @OneToMany(mappedBy = "user",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    @Column(name = "car_id")
    private List<Car> cars;

    public User() {
    }

    /*public User() {
        this.firstName = "firstName";
        this.lastName = "lastName";
        this.email = "email@example.com";
        this.dateOfBirth = LocalDate.EPOCH;
        this.phoneNumber = "0";
        this.password = new char[]{'0'};
        this.balance = new Balance(BigDecimal.ZERO);
        this.role = Role.REGULAR_USER;
        this.car = new Car("brandName", "modelName", "vinCode", Body.SEDAN, 1.0, LocalDate.EPOCH);
    }*/

    public User(int id, String firstName, String lastName, String email, LocalDate dateOfBirth, String phoneNumber, char[] password, BigDecimal balance, Role role, List<Car> cars) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.balance = balance;
        this.role = role;
        this.cars = cars;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password=" + Arrays.toString(password) +
                ", balance=" + balance +
                ", role=" + role +
                ", cars=" + cars +
                '}';
    }
}
