package com.example.methodsandclasses;

public class Simpsons {
   private String name;
   private int age;
    private String Job;

    public Simpsons(String name, int age, String job) {
        this.name = name;
        this.age = age;
        Job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }
}
