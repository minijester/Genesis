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
public class dbBacklog extends ConnectDB implements CheckInterface{
    
    public dbBacklog(){
        super();
    }

    @Override
    public ArrayList<HashMap> checkID(String user) {
        String sql = "SELECT * FROM LibraryBacklog WHERE ID = '"+ user+ "'";
        System.out.println(sql);
        ArrayList<HashMap> list = db.queryRows(sql);
        System.out.println(list);
        boolean delSuccess = db.executeQuery(sql);
        System.out.println(delSuccess);
        return list;
    }

    @Override
    public ArrayList<HashMap> checkBookISBN(String isbn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void updateBacklog(String user, String datereturn, String isbn,String dateburr,String bname){
        String updateback = "UPDATE LibraryBacklog SET ReturnDate = '"+ datereturn +"'WHERE ID = '"+user +"'";
        System.out.println(updateback);
        Boolean delSucces8 = db.executeQuery(updateback);
        System.out.println(delSucces8);

        String updatebackisbn = "UPDATE LibraryBacklog SET ISBN = '"+isbn+"'WHERE ID = '"+ user + "'";
        System.out.println(updatebackisbn);
        Boolean delSucces4 = db.executeQuery(updatebackisbn);
        System.out.println(delSucces4);

        String updatebackbur = "UPDATE LibraryBacklog SET BurrowDate = '"+dateburr+"'WHERE ID = '"+ user + "'";
        System.out.println(updatebackbur);
        Boolean delSucces9 = db.executeQuery(updatebackbur);
        System.out.println(delSucces9);

        //String book = l2.get("BookName").toString();
        String updatebackre = "UPDATE LibraryBacklog SET BookName = '"+bname+"'WHERE ID = '"+ user + "'";
        System.out.println(updatebackre);
        Boolean delSucces10 = db.executeQuery(updatebackre);
        System.out.println(delSucces10);
    }
    
}
