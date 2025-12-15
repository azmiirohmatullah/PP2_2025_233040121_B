/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.pp2_b_233040121.modul9;


import java.io.Serializable;

/**
 *
 * @author azmirahmatullah
 */
public class UserConfig implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String username;
    private int fontSize;
    
    public UserConfig(String username, int fontSize) {
        this.username = username;
        this.fontSize = fontSize;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public int getFontSize() {
        return fontSize;
    }
    
    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
    
    @Override
    public String toString() {
        return "UserConfig{username='" + username + "', fontSize=" + fontSize + "}";
    }
}
