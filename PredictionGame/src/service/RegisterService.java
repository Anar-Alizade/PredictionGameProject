/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.Scanner;
import main.Config;
import util.Person;

/**
 *
 * @author user
 */
public class RegisterService implements MenuService {

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Neche eded ishtirakci daxil edilecek?");
        int count = sc.nextInt();

        Config.person = new Person[count];

        for (int i = 0; i < Config.person.length; i++) {
            System.out.println((i+1) + ".Register");
            sc = new Scanner(System.in);
            System.out.println("enter name");
            String name = sc.nextLine();

            sc = new Scanner(System.in);
            System.out.println("enter surname");
            String surname = sc.nextLine();

            sc = new Scanner(System.in);
            System.out.println("enter age");
            int age = sc.nextInt();

            Person p = new Person(name, surname, age);
            p.setName(name);
            p.setSurname(surname);
            p.setAge(age);

            Config.person[i] = p;
        }
    }

}
