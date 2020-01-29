package com.sinaCompany;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        ArrayList<Student> slist = new ArrayList<>();
        for (int i = 2; i > 0; i--) {
            slist.add(new Student());
            System.out.println("--------------------");
        }
        System.out.println("user :");
        String user = in.nextLine();
        boolean f=false;
        int index =0;
        for (Student temp : slist) {
            int count=0;
            if (temp.getName().equalsIgnoreCase(user)) {
                slist.get(count).scoreListMaker();
                System.out.println("State :");
                slist.get(count).setState(in.nextBoolean());
                index = count;
                break;
            }
            count++;
        }

        //if(index ==0){
        //    System.out.println("notfound!");
        //}
        slist.get(index).showScoreList();


    }
}
