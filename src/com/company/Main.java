package com.company;
import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <galactic> countries=new <galactic> ArrayList(){
            {
                add(new galactic("venera",8));
                add(new galactic("Upiter",6));
                add(new galactic("uran",2));
            }
        };
        galactic ct=new galactic("Venera",3);
        System.out.println("Name star");
        String a=sc.nextLine();
        for (int i = 0; i <3; i++) {
            ct=(galactic)countries.get(i);
            System.out.println(ct.toString()+ct.countplanet(3));
        }

        for (int i = 0; i <countries.size() ; i++) {
            ct=(galactic)countries.get(i);
            System.out.println(ct.hashCode());
        }
    }
}
