/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proccess;

import Database.Connect;
import Model.AccountModel;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ngoc Son
 */
public class Account {
    public Connect conn;
    public String getAcc(AccountModel account) throws SQLException{
        conn=new Connect();
                
        conn.connectSQL();
        ResultSet rs =conn.LoadData("Select * from Account where id='"+account.getId()+"'");
        if (rs.next()){
            if(account.getPass().equals(rs.getString(2)))
                return rs.getString(3);
            else
                return "saiMK";
        }
        return "not";
    }
    
}
