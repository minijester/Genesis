/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectlibrary.database;

import edu.sit.cs.db.CSDbDelegate;
/**
 *
 * @author Minijester
 */
public class ConnectDB {
    protected static CSDbDelegate db;
    
    public ConnectDB() {
        
    }
    
    public static void dbConnect() {
        db = new CSDbDelegate("128.199.117.93", "3306", "genius", "user", "iloveoosd");
        db.connect();
        
    }
     public static void disconnect() {
        db.disconnect();
    }
    
    
}
