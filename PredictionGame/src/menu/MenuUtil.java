/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import java.util.Scanner;
import main.Config;

/**
 *
 * @author user
 */
public class MenuUtil {

    public static void menuTaking() {
        System.out.println("Please select Menu");
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != Menu.UNKOWN) {
                if (menus[i] == Menu.LOGIN) {
                    if (!(Config.isLogged())) {
                        System.out.println(menus[i]);
                    }
                } else if (Config.isLogged()) {
                    if (menus[i] != Menu.LOGIN) {
                        System.out.println(menus[i]);
                    }
                }
            }
        }
        System.out.println("------------");
        Scanner sc = new Scanner(System.in);
        int selected = sc.nextInt();
        menus[selected - 1].process();
    }
    
    
    

}
