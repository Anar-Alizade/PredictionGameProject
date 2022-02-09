/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import util.Person;

/**
 *
 * @author user
 */
public class Config {
    
    public static Person[] person;
    private static boolean logged;
    public static Config config;


    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    public static boolean isLogged() {
        return logged;
    }
    
    public static Config instance() {
        if(config == null) {
            config = new Config();
        }
        return config;
    }
    
}
