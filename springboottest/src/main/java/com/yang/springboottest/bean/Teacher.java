package com.yang.springboottest.bean;

public class Teacher {

    private int age;
    private String name;
    private String phone;
    private String Emeal;

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", Emeal='" + Emeal + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmeal() {
        return Emeal;
    }

    public void setEmeal(String emeal) {
        Emeal = emeal;
    }
}
