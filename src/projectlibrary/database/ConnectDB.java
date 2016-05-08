/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectlibrary.database;

import java.sql.Connection;
import java.util.Properties;

/**
 *
 * @author Minijester
 */
public class ConnectDB {
    String hostname;
    String DBtype;
    String DBname;
    String username;
    String password;
    String URL;
    int port;
    Connection con;
    
    public ConnectDB() {
        hostname = null;
        port = 3306;
        DBtype = null;
        DBname = null;
        username = null;
        password = null;
        URL = null;
    }
    
    public Connection getConnection() {
        Connection connect = null;
        DBname = "genius";
        username = "user";
        password = "iloveoosd";
        Properties prop = new Properties();
        
        URL = "jdbc:mysql://128.199.117.93:3306/genius?"; //+ "user=user&password=iloveoosd"

        prop.put("dbname", DBname);
        prop.put("user", username);
        prop.put("passwd", password);
        return connect;
    }
}
