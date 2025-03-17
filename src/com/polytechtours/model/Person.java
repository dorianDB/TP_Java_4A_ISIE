package com.polytechtours.model;

public class Person {
    private String name;
    private String foreName;
    private int age;
    private boolean polytechStudent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForeName() {
        return foreName;
    }

    public void setForeName(String foreName) {
        this.foreName = foreName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPolytechStudent() {
        return polytechStudent;
    }

    public void setPolytechStudent(boolean polytechStudent) {
        this.polytechStudent = polytechStudent;
    }

    public void addOneYearToAge(){
        age++;
    }
}
