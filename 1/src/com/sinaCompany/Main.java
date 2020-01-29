package com.sinaCompany;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students =new ArrayList<>();
        students.add(new Student());
        for (Student temp: students){
            System.out.println("name:"+temp.getName());
            System.out.println("SID:"+temp.getSid());
            System.out.println("age:"+temp.getAge());
            System.out.println("major:"+temp.getMajor());
            System.out.println("advanced major:"+temp.getAdvancedMajor());
        }

    }
}
