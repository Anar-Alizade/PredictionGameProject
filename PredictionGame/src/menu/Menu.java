/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import service.ExitService;
import service.LogOutSevice;
import service.LoginService;
import service.MenuService;
import service.RegisterService;
import service.ShowAllService;
import service.StartService;

/**
 *
 * @author user
 */
public enum Menu {
    
    LOGIN(1, ". Login", new LoginService()),
    REGISTER(2, ". Yarışmacıları register et", new RegisterService()),
    START(3, ". Yarışmaya başla", new StartService()),
    LOGOUT(4, ". Logout", new LogOutSevice()),
    SHOW_ALL(5, ". Show all", new ShowAllService()),
    EXIT(6, ". Exit", new ExitService()),
    UNKOWN;
    
    private int number;
    private String input;
    private MenuService service;
    
    Menu() {
    }
    
    Menu(int number, String input, MenuService service) {
        this.number = number;
        this.input = input;
        this.service = service;
    }
    
    public void process() {
        service.process();
        MenuUtil.menuTaking();
    }

    public int getNumber() {
        return number;
    }

    public String getInput() {
        return input;
    }

    public MenuService getService() {
        return service;
    }

    @Override
    public String toString() {
        return number + "" + input;
    }
    
    
    
    
    
    
}
