package com.sinaCompany;

import java.util.Scanner;

public class Student {
    Scanner in= new Scanner(System.in);

    private String name;
    private String sid;
    private int age;
    private String major;
    private String advancedMajor;

    public String getName() {
        return name;
    }

    public String getSid() {
        return sid;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public String getAdvancedMajor() {
        return advancedMajor;
    }

    public Student() {
        System.out.println("name:");
        name=in.nextLine();

        System.out.println("SID:");
        sid=in.nextLine();

        System.out.println("age:");
        age=Integer.parseInt(in.nextLine());

        System.out.println("major:");
        major =in.nextLine();

        System.out.println("advanced major:");
        advancedMajor =in.nextLine();
    }
}
