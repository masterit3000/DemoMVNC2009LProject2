/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.controller;

import com.hotel.model.dto.UserDTO;
import java.util.Date;

/**
 *
 * @author Tudt
 */
public interface IUserController {
    
    boolean login(String username, String pass);
    boolean addNewUser(UserDTO userDTO);
}
