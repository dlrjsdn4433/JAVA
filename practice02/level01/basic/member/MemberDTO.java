package com.ohgiraffers.practice02.level01.basic.member;

public class MemberDTO {
    private String id;
    private String pwd;
    private String name;
    private int age;
    private char gender;
    private String phone;
    private String email;

    public void MemberDTO(){};

    public void setId(String id){
        this.id = id;
    }
    public void setPwd(String pwd){
        this.pwd = pwd;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getId(){
        return id;
    }
    public String getPwd(){
        return pwd;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public char getGender(){
        return gender;
    }
    public String getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
    }

    public void getInfo(){
        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phone = " + phone);
        System.out.println("email = " + email);
    }
}
