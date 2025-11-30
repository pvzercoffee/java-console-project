package com.pvzer.pojo;

public class Teacher extends Person{

    private String course;

    public Teacher(String name, String type,int age,String course)
    {
        super(name, type, age);
        this.course = course;
    }
    public Teacher()
    {
        super();
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public void showInfo() {
        System.out.println("name："+getName()+" course:"  + getCourse()+getType());
    }
}
