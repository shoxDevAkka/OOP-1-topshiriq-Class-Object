package com.classAndObject.Car;

import java.util.Scanner;

public class ClassObjectCarDisplay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nechta moshina ma'lumotlarini kiritmoqchisiz :");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            ClassObjectCar classObjectCar = new ClassObjectCar();
            System.out.println("Moshina rangini kiriting :");
            String color = scanner.next();
            System.out.println("Moshina modelini kiriting :");
            String model = scanner.next();
            System.out.println("Moshina narxini kiriting :");
            int price = scanner.nextInt();
            System.out.println("Moshina avtomat yoki mexanik tuzilmaga ekanligini kiriting : ");
            String carType = scanner.next();

            classObjectCar.setColor(color);
            classObjectCar.setModel(model);
            classObjectCar.setPrice(price);
            classObjectCar.setCarType(carType);

            System.out.println();
            System.out.println((i + 1) + "-Moshina umumiy ma'lumotlari :");

            System.out.println("Modeli : " + classObjectCar.getModel());
            System.out.println("Rangi : " + classObjectCar.getColor());
            System.out.println("Narxi : " + classObjectCar.getPrice());
            System.out.println("Moshina tuzilmasi : " + classObjectCar.getCarType());
            System.out.println();
        }
    }

}
