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
public class dbUserInfo extends ConnectDB {
    
    public dbUserInfo(){
        super();
    }
    
    public ArrayList<HashMap> checkInfo(String id){
        String sql = "SELECT * FROM LibrayAccount WHERE userID = '"+ id + "'";
        ArrayList<HashMap> list = db.queryRows(sql);
        boolean delSuccess = db.executeQuery(sql);
        return list;
    }
}
