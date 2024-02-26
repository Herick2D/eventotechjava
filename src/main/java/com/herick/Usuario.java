package com.herick;

public class Usuario {
    private String name;
    private String email;
    private int age;
    private boolean sex;
    private String address;

    public Usuario(String name, String email, int age, boolean sex, String address) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public boolean isSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
