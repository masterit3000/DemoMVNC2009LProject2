/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.view.admin.fake;

import com.hotel.controller.IUserController;
import com.hotel.model.dto.UserDTO;

/**
 *
 * @author Tudt
 */
public class UserControlerFake implements IUserController{

    @Override
    public boolean login(String username, String pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addNewUser(UserDTO userDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
