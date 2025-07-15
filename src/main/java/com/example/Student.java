package com.example;

public class Student {

    // public Student(){
    //     System.out.println("studen is created");
    // }

    private int age;
    private String name;

    private Pen pen;    
    



    public void setPen(Pen pen){
        this.pen=pen;
    }



    public void  show(){
        System.out.println("show is working");

    }

    public void setAge(int age){
        System.err.println(" SETTER CALLED BY SPRING");
        this.age=age;
    }



    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }

    public void writeexamp(){
        pen.write();
    }

    public Pen getPen(Pen pen){
        return pen;

    }



    
}
