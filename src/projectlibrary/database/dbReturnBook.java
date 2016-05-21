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
public class dbReturnBook extends ConnectDB implements CheckInterface{
    
    public dbReturnBook(){
        super();
    }
    
    @Override
    public ArrayList<HashMap> checkID(String user){
        String sqlid = "SELECT * FROM LibrayAccount WHERE userID = '"+ user + "'";
        ArrayList<HashMap> list = db.queryRows(sqlid);
        System.out.println(list);
        boolean delSuccess = db.executeQuery(sqlid);
        System.out.println(delSuccess);
        
        return list;
    }
    
    @Override
    public ArrayList<HashMap> checkBookISBN(String isbn){
        String sqlbook = "SELECT * FROM LibraryBook WHERE ISBN = '"+ isbn+ "'";
        ArrayList<HashMap> list2 = db.queryRows(sqlbook);
        System.out.println(list2);
        boolean delSuccess2 = db.executeQuery(sqlbook);
        System.out.println(delSuccess2);
        
        return list2;
    }
    
    public void updateBook(String isbn,String user){
        //update book burrowdate
        String updateday = "UPDATE LibraryBook SET BurrowDate = '"+ "no" +"'WHERE ISBN = '"+ isbn +"'";
        System.out.println(updateday);
        Boolean delSucces5 = db.executeQuery(updateday);
        System.out.println(delSucces5);
         //update book burrow by ...
        String updateby = "UPDATE LibraryBook SET BurrowBy = '"+ "no" +"'WHERE ISBN = '"+isbn +"'";
        System.out.println(updateby);
        Boolean delSucces6 = db.executeQuery(updateby);
        System.out.println(delSucces6);
        //update book status
        String updateinloan = "UPDATE LibrayAccount SET Bookinloan = '"+ " No" +"'WHERE userID = '"+user +"'";
        System.out.println(updateinloan);
        Boolean delSucces7 = db.executeQuery(updateinloan);
        System.out.println(delSucces7);
        
    }
}
