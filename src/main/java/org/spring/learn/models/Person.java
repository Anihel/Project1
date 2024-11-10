package org.spring.learn.models;

import jakarta.validation.constraints.*;


public class Person {

    private int personId;

    @NotEmpty(message = "Имя не должно быть пустым")
    @Size(min = 3, max = 100, message = " Имя должно быть не короче 2 символов и не длиннее 30")
    private String fullName;

//    @Min(value = 1900, message = "Г")
    private int age;

    public Person() {

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person(int id, String fullName, int age) {
        this.personId = id;
        this.fullName = fullName;
        this.age = age;
    }


    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
