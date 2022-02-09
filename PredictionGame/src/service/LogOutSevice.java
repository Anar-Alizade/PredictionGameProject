/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import menu.Menu;

/**
 *
 * @author user
 */
public class LogOutSevice implements MenuService {

    @Override
    public void process() {
        Menu.LOGIN.process();
    }

}
