package Proccess;

import java.sql.SQLException;

public abstract class CRUID<T> {

    public abstract void InsertData(T obj);

    public abstract void EditData(T obj);

    public abstract void DeleteData(String obj);
}
