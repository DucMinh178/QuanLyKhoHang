/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proccess;

import java.sql.SQLException;

/**
 *
 * @author taduc
 */
public abstract class CRUID<T> {
    public abstract void InsertData(T obj);
    public abstract void EditData(T obj);
    public abstract void DeleteData(String obj);
}
