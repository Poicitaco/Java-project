/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.User;

/**
 *
 * @author DTC
 */
public class UserDao {
    public boolean checkUser(User user) {
        if (user != null) {
            if ("admin".equals(user.getUsername()) && "admin".equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
