package com.company;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.*;
public class If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int c = 'A';
            for(int j=0;j<=i;j++){
                System.out.print((char)(c+j)+" ");
            }
            System.out.println();
        }

    }

}