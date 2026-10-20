package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String email;
    String address;
    String gender;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, String lastName, int age, String email, String address, String gender) {
        this(firstName, lastName, age);
        this.email = email;
        this.address = address;
        this.gender = gender;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public Boolean isTeen(int age) {
        if (age >= 13 && age <= 18) {
            return true;
        }else  {
            return false;
        }
    }
}
