package com.sinaCompany;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String code;
    private String user;
    private String pass;
    private boolean state;

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    private ArrayList<Integer> scorList=new ArrayList<>();
    Scanner in = new Scanner(System.in);

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return user;
    }

    public void setName(String name) {
        this.user = name;
    }

    public String getLastName() {
        return pass;
    }

    public void setLastName(String lastName) {
        this.pass = lastName;
    }
    public void scoreListMaker(){
        System.out.println("How many number ?");
        int i=Integer.parseInt(in.nextLine());
        for(;i>0;i--){
            System.out.println("score :");
            scorList.add(Integer.parseInt(in.nextLine()));
        }
    }
    public void showScoreList(){
        for (Integer temp :scorList){
            int count =1;
            System.out.println("score "+count+" :"+temp);
            count++;
        }
    }

    public Student() {
        System.out.println("code :");
        this.code = in.nextLine();
        System.out.println("user :");
        this.user =in.nextLine() ;
        System.out.println("pass :");
        this.pass =in.nextLine();
    }
}
