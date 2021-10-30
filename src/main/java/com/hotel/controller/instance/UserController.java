/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.controller.instance;

import com.hotel.controller.IUserController;
import com.hotel.model.dto.UserDTO;
import com.hotel.model.sql.UserControllerSQL;
import com.hotel.model.sql.interfaceccc.IUserControllerSQL;
import java.util.Date;

/**
 *
 * @author Tudt
 */
public class UserController implements IUserController {

    IUserControllerSQL controllerSQL;

    public UserController() {
        controllerSQL = new UserControllerSQL();
    }

    @Override
    public boolean login(String username, String pass) {

        //viết thẳng kêt snoois SQL ...
        return controllerSQL.login(username, pass);
    }

    @Override
    public boolean addNewUser(UserDTO userDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
