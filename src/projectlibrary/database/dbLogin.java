/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectlibrary.database;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Minijester
 */
public class dbLogin extends ConnectDB implements CheckInterface{

    @Override
    public ArrayList<HashMap> checkID(String user) {
         String sta = "SELECT * FROM LibrayAccount where userID = '"+ user + "'";
         System.out.println(sta);
         ArrayList<HashMap> list2 = db.queryRows(sta);
         System.out.println(list2);
         boolean delSuccess = db.executeQuery(sta);
         System.out.println(delSuccess);
         
         return list2;
    }
    

    @Override
    public ArrayList<HashMap> checkBookISBN(String isbn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
