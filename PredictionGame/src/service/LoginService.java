/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.Scanner;
import main.Config;

/**
 *
 * @author user
 */
public class LoginService implements MenuService {

    @Override
    public void process() {
        System.out.println("Girish edin");
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter username");
            String username = sc.nextLine();

            sc = new Scanner(System.in);
            System.out.println("enter password");
            String password = sc.nextLine();
            
            if(username.contains("user") && password.equals("12345")) {
                System.out.println("Your are loggedIn successfully");
                Config.instance().setLogged(true);
                return;
            } else if(!(username.contains("user") && password.contains("12345"))) {
                System.out.println("Invalid Username or Password.");
            }
        }
        System.out.println("You are banned!!!");
        System.exit(0);
    }

}
