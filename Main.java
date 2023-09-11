package com.java;

 

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Diksha", 24);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        person.setName("Divya");
        person.setAge(22);

        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
    }
}
