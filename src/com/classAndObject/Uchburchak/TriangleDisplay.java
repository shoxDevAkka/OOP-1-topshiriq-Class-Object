package com.classAndObject.Uchburchak;

import java.util.Scanner;

public class TriangleDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nechta uchburchak ma'lumotlarini kiritmoqchisiz :");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            Triangle triangle = new Triangle();

            System.out.println("Uchburchak a-tomonini kiriting :");
            int a = scanner.nextInt();
            System.out.println("Uchburchak b-tomonini kiriting :");
            int b = scanner.nextInt();
            System.out.println("Uchburchak c-tomonini kiriting :");
            int c = scanner.nextInt();

            triangle.setA(a);
            triangle.setB(b);
            triangle.setC(c);

            System.out.println();
            System.out.println((i + 1) + "-uchburchak ma'lumotlari :");
            System.out.println("a tomon : " + triangle.getA());
            System.out.println("b tomon : " + triangle.getB());
            System.out.println("c tomon : " + triangle.getC());
            System.out.println();
        }


    }
}
