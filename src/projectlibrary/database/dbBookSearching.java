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
public class dbBookSearching extends ConnectDB {
    
    public dbBookSearching(){
        super();
    }
    
    public ArrayList<HashMap> searchISBN(String key){
        String sql = "SELECT * FROM LibraryBook WHERE ISBN LIKE '"+ "%" + key + "%" + "'";
        System.out.println(sql);
        ArrayList<HashMap> list = db.queryRows(sql);
        boolean delSuccess = db.executeQuery(sql);
        System.out.println(list);
        System.out.println(delSuccess);
        return list;
    }
    
    public ArrayList<HashMap> searchBookName(String key){
        String sql2 = "SELECT * FROM LibraryBook WHERE Title LIKE '"+ "%" + key + "%" + "'";
        System.out.println(sql2);
        ArrayList<HashMap> list2 = db.queryRows(sql2);
        boolean delSuccess2 = db.executeQuery(sql2);
        System.out.println(list2);
        System.out.println(delSuccess2);
        return list2;
    }
    
    public ArrayList<HashMap> searchAuthor(String key){
        String sql3 = "SELECT * FROM LibraryBook WHERE Authors LIKE '"+ "%" + key + "%" + "'";
        System.out.println(sql3);
        ArrayList<HashMap> list3 = db.queryRows(sql3);
        boolean delSuccess3 = db.executeQuery(sql3);
        System.out.println(list3);
        System.out.println(delSuccess3);
        return list3;
    }
}
