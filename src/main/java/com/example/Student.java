package com.example;

public class Student {

    // public Student(){
    //     System.out.println("studen is created");
    // }

    private int age;
    private String name;

    public void  show(){
        System.out.println("show is working");

    }

    public void setAge(int age){
        this.age=age;
    }



    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    
}
