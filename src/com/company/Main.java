package com.company;


import java.sql.SQLOutput;
import java.time.MonthDay;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println(Week.MONDAY +    "     JAVA sabagu bolot");
                break;
            case 2:
                System.out.println(Week.TUESDAY+  "    ENGLISH sabagu bolot");
                break;
            case 3:
                System.out.println(Week.WEDNESDAY +"   praktika sabagu bolot");
                break;
            case 4:
                System.out.println(Week.THURSDAY+"  Java sabagu bolot");
                break;
            case 5:
                System.out.println(Week.FRIDAY+"   English sabagu bolot");
                break;
            case 6:
                System.out.println(Week.SATURDAY+"   Praktika sabagu bolot");
                break;
            case 7:
                System.out.println(Week.SUNDAY+   "    Es aluu kun");
        }


}}
