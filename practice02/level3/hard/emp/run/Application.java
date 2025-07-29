package com.ohgiraffers.practice02.level3.hard.emp.run;

import com.ohgiraffers.practice02.level3.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("번호 : ");
        int number=sc.nextInt();
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("부서 : ");
        String dept = sc.next();
        System.out.print("직책 : ");
        String job = sc.next();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        System.out.print("성별 : ");
        String gender = sc.next();
        System.out.print("월급 : ");
        int salary = sc.nextInt();
        System.out.print("인센티브 : ");
        double bonusPoint = sc.nextDouble();
        System.out.print("전화번호 : ");
        String phone = sc.next();
        sc.nextLine(); // /n이 남아있어서 뒤에있는 sc.nextLine()이 제대로 작동하지 않고 넘어감.
        System.out.print("주소 : ");
        String address = sc.next();


        EmployeeDTO e1= new EmployeeDTO();
        e1.setNumber(number);
        e1.setName(name);
        e1.setDept(dept);
        e1.setJob(job);
        e1.setAge(age);
        e1.setGender(gender.charAt(0));
        e1.setSalary(salary);
        e1.setBonusPoint(bonusPoint);
        e1.setPhone(phone);
        e1.setAddress(address);
        System.out.println(e1.getNumber());
        System.out.println(e1.getName());
        System.out.println(e1.getDept());
        System.out.println(e1.getJob());
        System.out.println(e1.getAge());
        System.out.println(e1.getGender());
        System.out.println(e1.getSalary());
        System.out.println(e1.getBonusPoint());
        System.out.println(e1.getPhone());
        System.out.println(e1.getAddress());

    }
}
