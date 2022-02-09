/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import main.Config;
import util.Person;

/**
 *
 * @author user
 */
public class ShowAllService implements MenuService {

    @Override
    public void process() {
        Person[] p = Config.person;
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].getName() + " " +  p[i].getSurname() + " " +  p[i].getAge());
        }
    }

}
