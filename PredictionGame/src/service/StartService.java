/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.Random;
import java.util.Scanner;
import main.Config;
import menu.Menu;

/**
 *
 * @author user
 */
public class StartService implements MenuService{
    

    @Override
    public void process() {
        System.out.println("---Yarishma bashlamishdir---");
        Random r = new Random();
        int random = r.nextInt(Config.person.length+1);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("texmininizi daxil edin:");
        int texmin = sc.nextInt();
        
        Menu[] menu = Menu.values();
        if(menu[texmin-1].getNumber() == random) {
            System.out.println("Congratulations you won!");
        } else {
            System.out.println("You are failed!");
        }

    }
    
}
