package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
	Triangle triangle=new Triangle();
//        System.out.println(triangle);
        System.out.println("Nhap mau sac cho tam giac:");
        String mausac = input.nextLine();
        System.out.println("Nhap vai do dai canh thu nhat: ");
        float canh1=input.nextFloat();
        System.out.println("Nhap vai do dai canh thu hai: ");
        float canh2=input.nextFloat();
        System.out.println("Nhap vai do dai canh thu ba: ");
        float canh3=input.nextFloat();

        if (canh1+canh2>canh3&&canh2+canh3>canh1&&canh1+canh3>canh2) {

            triangle.setSide1(canh1);

            triangle.setSide2(canh2);

            triangle.setSide3(canh3);


            triangle.setColor(mausac);
            System.out.println(triangle);
        }else System.out.println("Day khong phai la tam giac");
        return;
    }
}
