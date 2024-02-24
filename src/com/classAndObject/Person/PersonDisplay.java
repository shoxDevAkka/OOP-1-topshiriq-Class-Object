package com.classAndObject.Person;

import java.util.Scanner;

public class PersonDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nechta odam ma'lumotlarini kiritmoqchisiz :");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            Person person = new Person();

            System.out.println("Jinsini kiriting :");
            String gender = scanner.next();
            System.out.println("Ismini kiriting :");
            String name = scanner.next();
            System.out.println("Yoshini kiriting :");
            int age = scanner.nextInt();
            System.out.println("Boy uzunligini kiriting :");
            int height = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Qiziqishlarini kiriting :");
            String interest = scanner.nextLine();
            System.out.println("Kasbini kiriting :");
            String job = scanner.next();

            person.setGender(gender);
            person.setName(name);
            person.setAge(age);
            person.setHeight(height);
            person.setInterest(interest);
            person.setJob(job);

            System.out.println();
            System.out.println((i + 1) + "-inson ma'lumotlari :");
            System.out.println("Jinsi : " + person.getGender());
            System.out.println("Ismi : " + person.getName());
            System.out.println("Yoshi : " + person.getAge());
            System.out.println("Bo'yi : " + person.getHeight());
            System.out.println("Qiziqishlari : " + person.getInterest());
            System.out.println("Kasbi : " + person.getJob());
            System.out.println();
        }
    }
}
